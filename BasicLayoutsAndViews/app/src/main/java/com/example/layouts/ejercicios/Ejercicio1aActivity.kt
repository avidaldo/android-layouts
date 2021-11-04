package com.example.layouts.ejercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layouts.databinding.ActivityEjercicio1aBinding

class Ejercicio1aActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicio1aBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio1aBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}