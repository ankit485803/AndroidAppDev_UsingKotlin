

package com.example.a24thaprilthurs_myapps

import android.app.Fragment
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        //here we will receive the data
        val textView = findViewById<TextView>(R.id.ss)

        val  data_from_screen = intent.getStringExtra(name: "abc")
        textView.text = "$data_from_screen"

        //    liser dekho bhai aur ek drawLisner
        textView.setOnClickListener {

        }



        //aab thora sa FRAGMENT ki baat kar le aap anpna time deke bhi Ankit pado LISNER
        fragmentManager.
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id)
            .add()

    }




}