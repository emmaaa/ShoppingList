package com.example.shoppinglist.list

import com.example.shoppinglist.data.ShoppingListItem

interface ShoppingListView {

    fun renderItems(items: List<ShoppingListItem>?)

}