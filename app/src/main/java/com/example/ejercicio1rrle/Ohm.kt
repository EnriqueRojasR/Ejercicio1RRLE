package com.example.ejercicio1rrle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Ohm : AppCompatActivity() {

    private lateinit var tvResOhm: TextView
    private lateinit var etVolt: EditText
    private lateinit var etCor: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ohm)

        tvResOhm = findViewById(R.id.tvResOhm)
        etVolt = findViewById(R.id.etVolt)
        etCor = findViewById(R.id.etCor)


        val boton4 = findViewById<Button>(R.id.btnMenu)

        boton4.setOnClickListener {
            val lanzar4 = Intent (this,MainActivity::class.java)
            startActivity(lanzar4)
        }

    }

    fun click1(view: View) {
        if(!etVolt.text.toString().isEmpty()){
            if (!etCor.text.toString().isEmpty()) {

                val numero = etVolt.text.toString().toFloat()
                val numero2 = etCor.text.toString().toFloat()

                tvResOhm.text = "${numero / numero2}"

            }else{
                Toast.makeText(this,getString(R.string.Aviso),Toast.LENGTH_SHORT).show()
                etCor.error = getString(R.string.Aviso)
            }

        }else{
            Toast.makeText(this,getString(R.string.Aviso),Toast.LENGTH_SHORT).show()
            etVolt.error = getString(R.string.Aviso)


        }

    }










    }

