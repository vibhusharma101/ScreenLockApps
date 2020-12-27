package com.vibhu.fingerprintdemo.bindings

import android.graphics.Color
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.content.res.ResourcesCompat
import androidx.databinding.BindingAdapter
import com.vibhu.fingerprintdemo.R
import kotlinx.android.synthetic.main.activity_main.view.*

object AppCompatImageViewBindingAdapter {

    @JvmStatic
    @BindingAdapter("changeAccToAuthSuccess")
    fun AppCompatImageView.changeAccToAuthSuccess(isSuccess:Boolean?)
    {
        if(isSuccess==true)
        {
            setBackgroundColor(Color.GREEN)
            setImageDrawable(ResourcesCompat.getDrawable(resources, R.drawable.ic_baseline_done_24,null))
        }
        else{
            setImageDrawable(ResourcesCompat.getDrawable(resources, R.drawable.ic_baseline_fingerprint_24,null))
        }
    }



}