package com.mani.helloworldapplications

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity  : Activity() {

    // 7 Life Cycle Methods

    // Declare the Views

    lateinit var tvTitleName : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        // To Create one Empty Window
        super.onCreate(savedInstanceState)

        //Load XML into Empty Window
        setContentView(R.layout.activity_main)

        // initalization of Views
        tvTitleName = findViewById(R.id.tvTitle)

    }

    fun performSubmitAction(view : View){

        var title = tvTitleName.text.toString()

        Toast.makeText(this,title,Toast.LENGTH_SHORT).show()
    }


}