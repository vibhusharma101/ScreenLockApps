package com.vibhu.fingerprintdemo.koin

import com.vibhu.fingerprintdemo.FingerPrintViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModels  =module{
    viewModel { FingerPrintViewModel() }
}