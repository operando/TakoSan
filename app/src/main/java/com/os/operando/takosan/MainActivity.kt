package com.os.operando.takosan

import android.app.Activity
import android.content.Intent
import android.os.Bundle

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val i = Intent()
        i.setClassName("com.android.egg", "com.android.egg.octo.Ocquarium")
        startActivity(i)
        finish()
    }
}