package com.example.android2dop3.ui.utils

import android.content.Context
import android.content.SharedPreferences

object PreferencesHelper {

    private lateinit var sharedPreferences: SharedPreferences

    fun unit(context: Context) {
        sharedPreferences = context.getSharedPreferences("settings", Context.MODE_PRIVATE)
    }

    var saveText: String?
        get() = sharedPreferences.getString("key", "")
        set(value) = sharedPreferences.edit().putString("key", value).apply()

    var saveText2: String?
        get() = PreferencesHelper.sharedPreferences.getString("key2", "")
        set(value) = PreferencesHelper.sharedPreferences.edit().putString("key2", value).apply()
}



