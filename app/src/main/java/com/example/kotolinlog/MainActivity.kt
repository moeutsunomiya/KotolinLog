package com.example.kotolinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val human1 = Human("Moe",24)
        human1.say()

    val human2 = Human("ダンス")
        human2.think()
    }
}


