package com.example.chewychamp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.example.chewychamp.FactsEntry

/**
 * Adapter used to show a simple grid of products.
 */
class FactsCardRecyclerViewAdapter(private val factsList: List<FactsEntry>) : RecyclerView.Adapter<FactsCardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FactsCardViewHolder {
        val layoutView = LayoutInflater.from(parent.context).inflate(R.layout.info_card, parent, false)
        return FactsCardViewHolder(layoutView)
    }

    override fun onBindViewHolder(holder: FactsCardViewHolder, position: Int) {
        // TODO: Put ViewHolder binding code here in MDC-102
    }

    override fun getItemCount(): Int {
        return factsList.size
    }
}