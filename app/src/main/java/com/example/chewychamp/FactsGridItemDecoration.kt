package com.example.chewychamp



import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

/**
 * Custom item decoration for a vertical [FactsGridFragment] [RecyclerView]. Adds a
 * small amount of padding to the left of grid items, and a large amount of padding to the right.
 */
class FactsGridItemDecoration(private val largePadding: Int, private val smallPadding: Int) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, view: View,
                                parent: RecyclerView, state: RecyclerView.State) {
        outRect.left = smallPadding
        outRect.right = smallPadding
        outRect.top = largePadding
        outRect.bottom = largePadding
    }
}
