package com.example.shoppingList.list

import com.example.shoppingList.data.ShoppingListItem

interface ShoppingListView {

    fun renderItems(items: List<ShoppingListItem>?)

}