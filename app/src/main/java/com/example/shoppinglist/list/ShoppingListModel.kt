package com.example.shoppinglist.list

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.example.shoppinglist.data.Item

class ShoppingListModel(
    private val shoppingList: List<Item>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>()  {


    override fun getItemCount(): Int = shoppingList.size

    override fun onBindViewHolder(p0: RecyclerView.ViewHolder, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerView.ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}