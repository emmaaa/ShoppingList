package com.example.shoppingList.data

import io.reactivex.Scheduler

interface SchedulerProvider {

    fun getUiScheduler(): Scheduler
}