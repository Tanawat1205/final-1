package com.example.final12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener{
            val h :Float = heidht.text.toString().toFloat()
            val w :Float = weight.text.toString().toFloat()
            val a :Float = a1.text.toString().toFloat()
            val res :Double = 66+(13.7*w)+(5*h)-(6.8*a)
            result.text = "%.2f".format(res)
        }

        btn2.setOnClickListener{
            val h :Float = heidht.text.toString().toFloat() / 100
            val w :Float = weight.text.toString().toFloat()
            val res :Float = w/(h*h)
            result.text = "%.2f".format(res)
        }




    }
}


