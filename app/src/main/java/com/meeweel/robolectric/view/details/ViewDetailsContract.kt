package com.meeweel.robolectric.view.details

import com.meeweel.robolectric.view.ViewContract

internal interface ViewDetailsContract : ViewContract {
    fun setCount(count: Int)
}
