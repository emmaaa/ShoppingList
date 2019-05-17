package com.example.shoppinglist.list

import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.ViewGroup
import com.example.shoppinglist.data.ShoppingListItem

class ShoppingListModel(private val shoppingList: List<ShoppingListItem>) {


    fun getItemCount(): Int = shoppingList.size

    fun onCreateViewHolder(parent: ViewGroup, viewType: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView // todo bind view
    }

}