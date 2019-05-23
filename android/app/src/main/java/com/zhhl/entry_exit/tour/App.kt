package com.zhhl.entry_exit.tour

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.util.Log
import com.uuzuche.lib_zxing.activity.ZXingLibrary
import io.flutter.app.FlutterApplication

class App : FlutterApplication() {
    override fun onCreate() {
        super.onCreate()
        ZXingLibrary.initDisplayOpinion(this)
    }
}