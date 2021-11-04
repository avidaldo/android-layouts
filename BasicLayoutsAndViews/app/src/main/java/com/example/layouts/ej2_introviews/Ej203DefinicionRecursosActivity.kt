package com.example.layouts.ej2_introviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layouts.databinding.ActivityEj203DefinicionRecursosBinding

class Ej203DefinicionRecursosActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj203DefinicionRecursosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj203DefinicionRecursosBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}