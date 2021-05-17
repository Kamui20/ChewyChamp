package com.example.chewychamp

import android.content.res.Resources
import android.net.Uri
import com.example.chewychamp.R
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.BufferedReader
import java.util.*

/**
 * A product entry in the list of products.
 */
class FactsEntry(
    val title: String, dynamicUrl: String, val url: String, val price: String, val description: String) {
    val dynamicUrl: Uri = Uri.parse(dynamicUrl)

    companion object {
        /**
         * Loads a raw JSON at R.raw.products and converts it into a list of ProductEntry objects
         */
        fun initFactsEntryList(resources: Resources): List<FactsEntry> {
            val inputStream = resources.openRawResource(R.raw.facts)
            val jsonProductsString = inputStream.bufferedReader().use(BufferedReader::readText)
            val gson = Gson()
            val productListType = object : TypeToken<ArrayList<FactsEntry>>() {}.type
            return gson.fromJson<List<FactsEntry>>(jsonProductsString, productListType)
        }
    }
}