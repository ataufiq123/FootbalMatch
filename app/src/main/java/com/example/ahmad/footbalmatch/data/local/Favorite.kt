package com.example.ahmad.footbalmatch.data.local

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Favorite(val id: Long?, val idEvent: String, val dateEvent: String?, val strHomeTeam: String?, val intHomeScore: String?, val intAwayScore: String?, val strAwayTeam: String?) : Parcelable {

    companion object {
        const val TABLE_FAVORITE: String = "TABLE_FAVORITE"
        const val TABLE_FAVORITE_TEAM: String = "TABLE_FAVORITE_TEAM"
        const val ID: String = "ID"

        const val ID_EVENT: String = "ID_EVENT"
        const val DATE_EVENT: String = "DATE_EVENT"
        const val HOME_TEAM: String = "HOME_TEAM"
        const val HOME_SCORE: String = "HOME_SCORE"
        const val AWAY_SCORE: String = "AWAY_SCORE"
        const val AWAY_TEAM: String = "AWAY_TEAM"

        const val ID_TEAM: String = "ID_TEAM"
        const val TEAM_NAME: String = "TEAM_NAME"
        const val TEAM_BADGE: String = "TEAM_BADGE"
    }
}