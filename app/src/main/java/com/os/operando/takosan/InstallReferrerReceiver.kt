package com.os.operando.takosan

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class InstallReferrerReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        Log.d("InstallReferrerReceiver", intent.toString())
        if (intent.extras != null) {
            intent.extras.keySet().forEach {
                Log.d("InstallReferrerReceiver", "key : " + it)
                Log.d("InstallReferrerReceiver", "value : " + intent.extras.get(it).toString())
            }
        }
        Log.d("InstallReferrerReceiver", intent.action)
        if (intent.`package` != null) {
            Log.d("InstallReferrerReceiver", intent.`package`)
        }
        Log.d("InstallReferrerReceiver", "referrer : " + intent.getStringExtra("referrer"))
    }
}
