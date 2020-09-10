package com.malang.sharedpreferencetest

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit

object Preferences {
    private const val DATA = "DATA"
    private lateinit var preferences: SharedPreferences

    fun init(context: Context) {
        preferences = context.getSharedPreferences(context.packageName, Activity.MODE_PRIVATE)
    }

    var data: String
        get() = preferences.getString(DATA, "") ?: "앙"
        set(value) = preferences.edit { putString(DATA, value) }
}