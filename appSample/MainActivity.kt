

// 18th April 2025 (Friday) this is my first app



package com.example.appsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.appsample.ui.theme.AppSampleTheme

//import es liye Ankit bhai error throw kar raha tha
import androidx.compose.foundation.layout.Column




class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppSampleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // 👇 Use Column to show both greetings
                    Column(modifier = Modifier.padding(innerPadding)) {
                        Greeting(name = "Android")
                        CustomGreeting()
                    }
                }
            }
        }
    }
}

// 👇 Your greeting functions

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun CustomGreeting(modifier: Modifier = Modifier) {
    Text(
        text = "Good morning Ankit bhai! Kaisi chal rahi hai AndroidAppDev ki learning?",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppSampleTheme {
        Column {
            Greeting("Ankit")
            CustomGreeting()
        }
    }
}