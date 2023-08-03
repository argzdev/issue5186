package com.argz.issue5186

import android.app.Application
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions

class CustomApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        FirebaseApp.getInstance().delete()
    }
}