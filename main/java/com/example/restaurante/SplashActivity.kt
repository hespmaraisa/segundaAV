package com.example.restaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    //define o layout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //responsável por exibir uma tela de splash ao iniciar
        setContentView(R.layout.activity_splash)
    }
}