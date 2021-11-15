package com.example.layouts.ejercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputFilter
import android.text.InputFilter.AllCaps
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.layouts.R
import com.example.layouts.databinding.ActivityEjercicio2Binding

class Ejercicio2Activity : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicio2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        /* Para forzar a que se muestren mayúsculas incluso si se introducen minúscualas:
        https://stackoverflow.com/a/25571410 */
        binding.etComentario.filters = arrayOf<InputFilter>(AllCaps())


        binding.botonGuardar.setOnClickListener {
            Toast.makeText(this, R.string.guardado, Toast.LENGTH_SHORT).show()
        }

        binding.botonCancelar.setOnClickListener {
            binding.etComentario.text.clear() // accedemos al texto del EditText y lo "limpiamos"

            //también se podría hacer con:
            // binding.etComentario.setText("")
            // https://stackoverflow.com/questions/44493908/setting-text-in-edittext-kotlin
        }



    }

}