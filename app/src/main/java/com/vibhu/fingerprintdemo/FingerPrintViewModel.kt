package com.vibhu.fingerprintdemo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData

class FingerPrintViewModel():ViewModel() {
    var signedInText =MutableLiveData<String>()
    val isSuccess = MutableLiveData<Boolean>()
}