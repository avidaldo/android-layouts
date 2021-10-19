package com.example.layouts.basiclayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layouts.databinding.ActivityEj06TableLayoutBinding

class Ej06TableLayoutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj06TableLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj06TableLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}