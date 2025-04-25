

package com.example.a24thaprilthurs_myapps

// 24th April 2025 (Thursday) while attending the Lec

import android.content.Intent
import android.os.Bundle
import android.view.PixelCopy
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.customview.widget.ViewDragHelper
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.coroutineScope

//yaha ekk aur ko import karo
import okhttps3.Call
import okhttps3.Callback
import okhttps3.Response
import java.io.IOException

import com.google.gson.Gson
import kotlin.math.log

private lateinit var recyclerView: RecyclerView
private lateinit var adapter: UserAdapter


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        fetch()


            val intent = Intent(packageContext: this, MainActivity2:: class.java)
            intent.putExtra(name: "abc", value: "this is my data Ankit Bhai")

            startActivity(intent)



    }

//    yah bhai maza aya

    private fun fetch() {
       val Client = okhttpClient()
        val request = Request.Builder()
            .url("https://jsonplaceholder.tyicode.com/users")
            .build()

        Thread{
            client.newCall(request).enqueue(object : Callback) {

                override fun onFailure(call: Call, e: IOException) {
                    log.e("My error", "resquest failed:: ${e.message}")
                }

                override fun onResponse(call: Call, response: Response) {
                    val body = response.body?.toString()
                    if(response.isSuccessful && body != null) {
                        gson = Gson()
                        val userList = gson.fromJson(body, Array<user>:: class.java).toList()
                    }
                    else{
                        //we are not going do anything
                    }
                }
            }
        }


    }
}