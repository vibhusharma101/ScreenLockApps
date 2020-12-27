package com.vibhu.fingerprintdemo.koin

import com.vibhu.fingerprintdemo.User
import org.koin.dsl.module

val dataModels = module {
    single { User(get()) }
}