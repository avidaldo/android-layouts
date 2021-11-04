package com.example.layouts.ejercicios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layouts.databinding.ActivityEjerciciosBinding

class EjerciciosActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEjerciciosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjerciciosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonEjer1a.setOnClickListener {
            startActivity(Intent(this, Ejercicio1aActivity::class.java))
        }
        binding.buttonEjer1b.setOnClickListener {
            startActivity(Intent(this, Ejercicio1bActivity::class.java))
        }
        binding.buttonEjer1c.setOnClickListener {
            startActivity(Intent(this, Ejercicio1cActivity::class.java))
        }
        binding.buttonEjer2.setOnClickListener {
            startActivity(Intent(this, Ejercicio2Activity::class.java))
        }
        binding.buttonEjer3.setOnClickListener {
            startActivity(Intent(this, Ejercicio3Activity::class.java))
        }
        binding.buttonEjer4.setOnClickListener {
            startActivity(Intent(this, Ejercicio4Activity::class.java))
        }

    }
}