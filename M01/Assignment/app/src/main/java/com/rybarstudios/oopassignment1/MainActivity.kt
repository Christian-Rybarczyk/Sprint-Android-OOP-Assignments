package com.rybarstudios.oopassignment1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.rybarstudios.oopassignment1.adapter.ItemListAdapter
import com.rybarstudios.oopassignment1.model.ClothingItem
import com.rybarstudios.oopassignment1.model.GroceryItem
import com.rybarstudios.oopassignment1.model.ShoppingItem
import com.rybarstudios.oopassignment1.model.SportsItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val itemList = ArrayList<ShoppingItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_view.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = ItemListAdapter(itemList)
        }
        generateTestValues()
    }

    private fun generateTestValues() {
        testValues.forEach {
            itemList.add(it)
        }
    }

    val testValues: ArrayList<ShoppingItem> = arrayListOf(
        SportsItem(
            Color.GREEN,
            "Soccer Ball",
            "$24.99",
            "Soccer"
        ),
        GroceryItem(
            Color.CYAN,
            "Milk",
            "$1.49",
            true
        ),
        GroceryItem(
            Color.CYAN,
            "Chicken",
            "$4.49",
            true
        ),
        ClothingItem(
            Color.MAGENTA,
            "Jeans",
            "$39.99",
            "34x34"
        ),
        GroceryItem(
            Color.CYAN,
            "Pasta",
            "$2.89",
            false
        ),
        GroceryItem(
            Color.CYAN,
            "Rice",
            "$0.99",
            false
        ),
        SportsItem(
            Color.GREEN,
            "Skateboard",
            "$129.99",
            "Skateboarding"
        ),
        ClothingItem(
            Color.MAGENTA,
            "T-Shirt",
            "$9.99",
            "L"
        ),
        ClothingItem(
            Color.MAGENTA,
            "Shoes",
            "$99.99",
            "11.5"
        ),
        SportsItem(
            Color.GREEN,
            "Hockey Stick",
            "$269.99",
            "Hockey"
        ),
        SportsItem(
            Color.GREEN,
            "Baseball glove",
            "$99.99",
            "Baseball"
        )
    )
}
