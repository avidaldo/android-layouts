package com.example.layouts.ej2_introviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.example.layouts.databinding.ActivityEj204ProgramaticoBinding

class Ej204ProgramaticoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj204ProgramaticoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj204ProgramaticoBinding.inflate(layoutInflater)
        //setContentView(binding.root);
        // Se sustituye la linea anterior por las siguientes:

        // se crea un objeto LayoutParams para especificar los parámetros de diseño
        val parametros = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        // se crea un objeto LinearLayout como contenedor de todas las vistas
        val miLayout = LinearLayout(this)
        miLayout.orientation = LinearLayout.VERTICAL

        val etiqueta1 = TextView(this)
        etiqueta1.text = "TextView desde código"
        etiqueta1.gravity = Gravity.CENTER
        etiqueta1.layoutParams = parametros

        val boton1 = Button(this)
        boton1.text = "Botón desde código"
        boton1.layoutParams = parametros
        boton1.setOnClickListener {
            Toast.makeText(this, "Hola", Toast.LENGTH_SHORT).show()
        }

        // Añadir ambas vistas al objeto Layout
        miLayout.addView(etiqueta1)
        miLayout.addView(boton1)

        // Añadir el objeto LinearLayout a la actividad
        setContentView(miLayout, parametros)
        //this.addContentView(miLayout, parametros);


    }
}