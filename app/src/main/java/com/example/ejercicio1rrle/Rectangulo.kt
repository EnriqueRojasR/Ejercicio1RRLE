package com.example.ejercicio1rrle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Rectangulo : AppCompatActivity() {
    private lateinit var tvResArea: TextView
    private lateinit var etBase: EditText
    private lateinit var etAltura: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rectangulo)

        tvResArea = findViewById(R.id.tvResArea)
        etAltura = findViewById(R.id.etAltura)
        etBase = findViewById(R.id.etBase)


    }

    fun click2(view: View) {
        if (!etAltura.text.toString().isEmpty()) {
            if(!etBase.text.toString().isEmpty()) {

                val numero3 = etAltura.text.toString().toFloat()
                val numero4 = etBase.text.toString().toFloat()

                tvResArea.text = "${numero3 * numero4}"
            }else{
                Toast.makeText(this, getString(R.string.Aviso), Toast.LENGTH_SHORT).show()
                etBase.error = getString(R.string.Aviso)
            }

        } else {
            Toast.makeText(this, getString(R.string.Aviso), Toast.LENGTH_SHORT).show()
            etAltura.error = getString(R.string.Aviso)


        }
    }
}