


/*

SplashScreen == matlab apka app jismai centre pe logo ho


A splash screen is a graphical control element consisting of a window containing an image, a logo, and the current version of the software. 
A splash screen can appear while a game or program is launching. A splash page is an introduction page on a website.



*/






package com.example.sampleapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

private lateinit var logoImageView: ImageButton

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash_screen)

        // Apply window insets for edge-to-edge display
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Step 1: Connect the element from XML file
        logoImageView = findViewById(R.id.LogoImageSplashScreen)

        // Step 2: Create a delay of 5 seconds before navigating to the next screen
        Handler(Looper.getMainLooper()).postDelayed(
            {
                // Start the main activity
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            },
            5000 // 5000 milliseconds = 5 seconds
        )

        // Step 3: Update the manifest file to export the SplashScreen activity
        // Goals:
        // - Show the logo for 3 to 5 seconds
        // - Redirect to the home screen or desired screen after that
    }
}
