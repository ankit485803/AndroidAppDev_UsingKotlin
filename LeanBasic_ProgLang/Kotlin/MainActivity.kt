

// hello 




// Tip: R.layout.activity_main refers to res/layout/activity_main.xml
// That’s how Kotlin and XML talk to each other in Android!



package com.example.myapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myText: TextView = findViewById(R.id.myText)
        myText.text = "Hello from Kotlin!"
    }
}






/*

📌 Key Kotlin Syntax Rules

Concept	Syntax Example


Class	         class MainActivity : AppCompatActivity()
Function	fun myFunction() { ... }
Variable	val (read-only), var (mutable)
Null safety	      String? is nullable,    String is not
Set text            	myText.text = "Hello"
Find View by ID         	findViewById(R.id.view_id)
Imports	                    Like Java: import android.widget.TextView


 */