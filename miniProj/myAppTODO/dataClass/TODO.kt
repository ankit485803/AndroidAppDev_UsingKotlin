

package com.example.myapptodo.dataClass




data class Todo(
    // this is our data class
    val title: String,
    var isChecked: Boolean = false

    //we are using var here bcz the flag will change its value
)
