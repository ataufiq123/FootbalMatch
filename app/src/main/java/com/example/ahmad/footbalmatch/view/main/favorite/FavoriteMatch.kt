package com.example.ahmad.footbalmatch.view.main.favorite

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ahmad.footbalmatch.R
import com.example.ahmad.footbalmatch.data.local.Favorite
import com.example.ahmad.footbalmatch.data.local.database
import kotlinx.android.synthetic.main.fragment_favorite.*
import org.jetbrains.anko.db.classParser
import org.jetbrains.anko.db.select

class FavoriteMatch : Fragment() {

    private var favorites: MutableList<Favorite> = mutableListOf()
    private lateinit var adapter: FavoriteEventsAdapter
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_favorite, container, false)
    }

    override fun onStart() {
        showFavorite()

        super.onStart()
    }

    private fun showFavorite() {
        context?.database?.use {
            val result = select(Favorite.TABLE_FAVORITE)
            val favorite = result.parseList(classParser<Favorite>())
            favorites.clear()

            favorites.addAll(favorite)

            adapter = FavoriteEventsAdapter(context, favorites)
            rv_favorite.layoutManager = LinearLayoutManager(context)
            rv_favorite.adapter = adapter
        }
    }
}