package com.example.ejercicio1rrle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.ejercicio1rrle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // binding = ActivityMainBinding.inflate(layoutInflater)
       // setContentView(binding.root)
        val boton1 = findViewById<Button>(R.id.btnOhm)
        val boton2 = findViewById<Button>(R.id.btnRect)
        val boton3 = findViewById<Button>(R.id.btnNewt)

        boton1.setOnClickListener {
            val lanzar = Intent (this,Ohm::class.java)
            startActivity(lanzar)
            finish()
        }

        boton2.setOnClickListener {
            val lanzar2 = Intent (this,Rectangulo::class.java)
            startActivity(lanzar2)
            finish()
        }

        boton3.setOnClickListener {
            val lanzar3 = Intent (this,Aceleracion::class.java)
            startActivity(lanzar3)
            finish()
        }






    }

}



