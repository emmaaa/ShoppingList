package com.example.shoppinglist.data

data class ShoppingListItem(
    val name: String,
    val quantity: Int,
    val bought: Boolean,
    val notes: String
)
