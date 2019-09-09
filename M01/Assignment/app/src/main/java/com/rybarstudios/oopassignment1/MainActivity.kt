package com.rybarstudios.oopassignment1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.rybarstudios.oopassignment1.adapter.ItemListAdapter
import com.rybarstudios.oopassignment1.model.GroceryItem
import com.rybarstudios.oopassignment1.model.ShoppingItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val itemList = ArrayList<ShoppingItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_view.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = ItemListAdapter(itemList)
        }

        val item = GroceryItem(Color.CYAN, "Milk", "$1.49", true)
        itemList.add(item)
    }

    private fun generateTestValues() {

    }
}
