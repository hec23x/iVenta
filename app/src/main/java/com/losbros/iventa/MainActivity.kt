package com.losbros.iventa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        //Splash Screen
        Thread.sleep(1000)
        setTheme(R.style.Theme_IVenta)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Hey brooooo!")


    }
}