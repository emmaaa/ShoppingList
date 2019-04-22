package com.example.shoppinglist.list

import com.example.shoppinglist.data.ItemProvider
import com.example.shoppinglist.data.SchedulerProvider
import io.reactivex.disposables.Disposable

class ShoppingListPresenter(
    private val shoppingListService: ItemProvider,
    private val schedulerProvider: SchedulerProvider,
    private val shoppingListView: ShoppingListView
) {

    private var shoppingListDisposable: Disposable? = null

    fun onResume() {
        shoppingListDisposable = shoppingListService.getShoppingList()
            .observeOn(schedulerProvider.getUiScheduler())
            .subscribe { items -> shoppingListView.renderItems(items)}
    }

    fun onDestroy() {
        shoppingListDisposable?.dispose()
    }

}