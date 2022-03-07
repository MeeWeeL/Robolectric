package com.meeweel.robolectric.presenter.details

import com.meeweel.robolectric.presenter.PresenterContract

internal interface PresenterDetailsContract : PresenterContract {
    fun setCounter(count: Int)
    fun onIncrement()
    fun onDecrement()
}
