package com.example.layouts.ej2_introviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layouts.databinding.ActivityEj202PaddingMarginBinding

class Ej202PaddingMarginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj202PaddingMarginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj202PaddingMarginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}