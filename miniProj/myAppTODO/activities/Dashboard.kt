


package com.example.myapptodo.activities

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.myapptodo.R
import com.example.myapptodo.fragments.ChatBotFragment
import com.example.myapptodo.fragments.ProfileFragment
import com.example.myapptodo.fragments.TaskFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
//aab import karo Ankit bhai
import android.content.Intent
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import com.example.myapptodo.activities.logoImageView // or whatever the correct path is




class Dashboard : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dashboard)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val bottomNavbar = findViewById<BottomNavigationView>(R.id.bottomNavigationViewDashboard)
        loadFragment(TaskFragment()) // Load TaskFragment by default

        bottomNavbar.setOnItemSelectedListener { item ->
            val fragment: Fragment = when (item.itemId) {
                R.id.nav_ai -> ChatBotFragment()
                R.id.nav_task -> TaskFragment()
                R.id.nav_profile -> ProfileFragment()
                else -> TaskFragment()
            }
            loadFragment(fragment)
            true
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.framelayoutDashboard, fragment)
            .commit()
    }
}



class SplashScreen : AppCompatActivity() {

    private lateinit var LogoImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash_screen)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Step 1: Connect the ImageView to XML
        val logoImageView = findViewById<ImageView>(R.id.logoImageView)

       // LogoImageView = findViewById(R.id.LogoSplashScreen)

        // Step 2: Delay for 3 seconds then move to Dashboard
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, Dashboard::class.java))
            finish()
        }, 3000) // 3000 ms = 3 seconds
    }
}

// hmara goal of this file
//goal
//CONCEPT: we have to show the logo for 5 to 3 sec  -- hm use karge HANGLER
// we hav to redirect to t he home screen / desired screen




