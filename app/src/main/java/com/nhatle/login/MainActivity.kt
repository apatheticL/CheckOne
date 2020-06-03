package com.nhatle.login

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        configView()
        registerListener()
    }

    private fun registerListener() {
        buttonLogin.setOnClickListener {
            // xu ly
        }
    }

    private fun configView() {
       val spannable = SpannableString("myHSA")
        spannable.setSpan(ForegroundColorSpan(Color.GREEN),
        0,2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        titleText.text = spannable
    }

}