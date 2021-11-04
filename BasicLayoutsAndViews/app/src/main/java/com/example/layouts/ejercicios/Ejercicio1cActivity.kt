package com.example.layouts.ejercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layouts.databinding.ActivityEjercicio1cBinding

class Ejercicio1cActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicio1cBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio1cBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}