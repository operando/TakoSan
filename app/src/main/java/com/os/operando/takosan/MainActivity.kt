package com.os.operando.takosan

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val i = Intent()
        i.setClassName("com.android.egg", "com.android.egg.octo.Ocquarium")
        startActivity(i)
        finish()
    }
}