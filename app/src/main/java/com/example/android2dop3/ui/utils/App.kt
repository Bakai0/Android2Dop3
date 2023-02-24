package com.example.android2dop3.ui.utils

import android.app.Application

class App : Application(){

    override fun onCreate() {
        super.onCreate()
        inittPref()
    }

    private fun inittPref() {
        PreferencesHelper.unit(this)
    }
}
