package com.meeweel.robolectric.view.search

import com.meeweel.robolectric.model.SearchResult
import com.meeweel.robolectric.view.ViewContract

internal interface ViewSearchContract : ViewContract {
    fun displaySearchResults(
        searchResults: List<SearchResult>,
        totalCount: Int
    )

    fun displayError()
    fun displayError(error: String)
    fun displayLoading(show: Boolean)
}
