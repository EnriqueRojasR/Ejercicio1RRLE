package com.example.ejercicio1rrle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Aceleracion : AppCompatActivity() {
    private lateinit var tvResNew: TextView
    private lateinit var etMas:EditText
    private lateinit var etAcel:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aceleracion)

        tvResNew = findViewById(R.id.tvResNew)
        etMas = findViewById(R.id.etMas)
        etAcel = findViewById(R.id.etAcel)


    }

    fun click3(view: View) {
        if (!etMas.text.toString().isEmpty()) {
            if(!etAcel.text.toString().isEmpty()) {

                val numero5 = etMas.text.toString().toFloat()
                val numero6 = etAcel.text.toString().toFloat()

                tvResNew.text = "${numero5 * numero6}"
            }else{
                Toast.makeText(this, getString(R.string.Aviso), Toast.LENGTH_SHORT).show()
                etAcel.error = getString(R.string.Aviso)
            }

        } else {
            Toast.makeText(this, getString(R.string.Aviso), Toast.LENGTH_SHORT).show()
            etMas.error = getString(R.string.Aviso)


        }
    }
}