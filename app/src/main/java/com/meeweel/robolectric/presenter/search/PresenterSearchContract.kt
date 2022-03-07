package com.meeweel.robolectric.presenter.search

import com.meeweel.robolectric.presenter.PresenterContract

internal interface PresenterSearchContract : PresenterContract {
    fun searchGitHub(searchQuery: String)
    //onAttach
    //onDetach
}
