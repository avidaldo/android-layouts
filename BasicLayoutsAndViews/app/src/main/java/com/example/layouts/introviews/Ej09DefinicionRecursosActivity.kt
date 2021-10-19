package com.example.layouts.introviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layouts.databinding.ActivityEj09DefinicionRecursosBinding

class Ej09DefinicionRecursosActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj09DefinicionRecursosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj09DefinicionRecursosBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}