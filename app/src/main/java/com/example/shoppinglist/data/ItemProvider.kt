package com.example.shoppinglist.data

import io.reactivex.Single

interface ItemProvider {

    fun getShoppingList(): Single<List<ShoppingListItem>>
}