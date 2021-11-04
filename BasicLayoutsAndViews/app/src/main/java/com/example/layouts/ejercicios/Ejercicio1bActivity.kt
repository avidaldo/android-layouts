package com.example.layouts.ejercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layouts.databinding.ActivityEjercicio1bBinding

class Ejercicio1bActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicio1bBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio1bBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}