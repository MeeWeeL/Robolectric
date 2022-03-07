package com.meeweel.robolectric.view.search

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.meeweel.robolectric.R
import com.meeweel.robolectric.model.SearchResult
import com.meeweel.robolectric.view.search.SearchResultAdapter.SearchResultViewHolder
import kotlinx.android.synthetic.main.list_item.view.*

internal class SearchResultAdapter : RecyclerView.Adapter<SearchResultViewHolder>() {

    private var results: List<SearchResult> = listOf()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SearchResultViewHolder {
        return SearchResultViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, null)
        )
    }

    override fun onBindViewHolder(
        holder: SearchResultViewHolder,
        position: Int
    ) {
        holder.bind(results[position])
    }

    override fun getItemCount(): Int {
        return results.size
    }

    fun updateResults(results: List<SearchResult>) {
        this.results = results
        notifyDataSetChanged()
    }

    internal class SearchResultViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(searchResult: SearchResult) {
            itemView.repositoryName.text = searchResult.fullName
        }
    }
}
