package com.example.shoppingList.data

import io.reactivex.Single

interface ItemProvider {

    fun getShoppingList(): Single<List<ShoppingListItem>>
}