package com.example.layouts.ejercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layouts.databinding.ActivityEjercicio4bienBinding

class Ejercicio4Activity : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicio4bienBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio4bienBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /* Ejercicio propuesto:
        Comprobar que todos los campos tengan algún valor y mostrar un Toast acorde
         */


    }

}