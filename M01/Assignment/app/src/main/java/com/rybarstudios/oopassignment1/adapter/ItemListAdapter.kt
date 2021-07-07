package com.rybarstudios.oopassignment1.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rybarstudios.oopassignment1.R
import com.rybarstudios.oopassignment1.model.ShoppingItem
import kotlinx.android.synthetic.main.display_list_item.view.*

class ItemListAdapter(val itemList: ArrayList<ShoppingItem>): RecyclerView.Adapter<ItemListAdapter.CustomViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.display_list_item, parent, false)
        return CustomViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.textView.text = itemList[position].getDisplayName()
        holder.layout.setBackgroundColor(itemList[position].colorId)
    }

    class CustomViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val layout: androidx.cardview.widget.CardView = view.list_item_layout
        val textView: TextView = view.text_view_list_item
    }
}