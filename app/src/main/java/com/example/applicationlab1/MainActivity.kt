package com.example.applicationlab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.buttonid)
        val textin = findViewById<EditText>(R.id.textid)
        val resoultt = findViewById<TextView>(R.id.rezultid)

        button.setOnClickListener{
            var resoult = 0
            val text = textin.text.toString()
            val list: List<String> = text.split(" ").toList()
            for (l in list){
                if ("a" in l || "A" in l){
                    resoult++
                }
            }
            resoultt.text = "Litera 'a' este in ".plus(resoult).plus(" cuvinte")
        }
    }
}

