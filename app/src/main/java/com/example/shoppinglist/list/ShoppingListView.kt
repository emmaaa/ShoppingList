package com.example.shoppinglist.list

import com.example.shoppinglist.data.Item

interface ShoppingListView {

    fun renderItems(items: List<Item>?)

}