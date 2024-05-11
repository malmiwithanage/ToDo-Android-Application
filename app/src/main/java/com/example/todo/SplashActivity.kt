package com.example.todo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    private val SPLASH_DISPLAY_LENGTH = 2000 // milliseconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Handler to start the MainActivity after the splash display duration
        Handler().postDelayed({
            // Start MainActivity
            val intent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(intent)
            finish() // Close the SplashActivity so it's not shown on back press
        }, SPLASH_DISPLAY_LENGTH.toLong())
    }
}
