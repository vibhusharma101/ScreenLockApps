package com.vibhu.fingerprintdemo

import android.app.Application
import com.vibhu.fingerprintdemo.koin.startKoin

class MyApplication :Application(){

    override fun onCreate() {
        super.onCreate()
        startKoin(this)
    }

}