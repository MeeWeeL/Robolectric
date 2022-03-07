package com.meeweel.robolectric.presenter.search

import com.meeweel.robolectric.presenter.PresenterContract
import com.meeweel.robolectric.view.search.ViewSearchContract

internal interface PresenterSearchContract : PresenterContract {
    fun searchGitHub(searchQuery: String)
    fun onAttach(view : ViewSearchContract)
    fun onDetach()
    fun isPresenterAttached() : Boolean
}
