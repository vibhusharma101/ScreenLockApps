package com.vibhu.fingerprintdemo.koin

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

fun startKoin(application: Application)
{
    with(application){
     org.koin.core.context.startKoin {
         androidContext(applicationContext)
         modules(listOf(dataModels))
         modules(listOf(viewModels))
     }


    }
}