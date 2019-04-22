package com.example.shoppinglist.data

import io.reactivex.Scheduler

interface SchedulerProvider {

    fun getUiScheduler(): Scheduler
}