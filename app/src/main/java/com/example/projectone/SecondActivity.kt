package com.example.projectone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

//        val name = intent.getStringExtra("EXTRA_NAME")
//        val age = intent.getIntExtra("EXTRA_AGE", 20)
//        val country = intent.getStringExtra("EXTRA_COUNTRY")
//        val message = "$name is $age years old and he lives in $country"
        val person = intent.getSerializableExtra("EXTRA_PERSON")

        val edtTxt = findViewById<TextView>(R.id.tvMessage)
//        edtTxt.text = message
        edtTxt.text = person.toString()
        val back = findViewById<Button>(R.id.btnBack)
        back.setOnClickListener {
            finish()
        }
    }
}