package com.example.layouts.introviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layouts.databinding.ActivityEj08PaddingMarginBinding

class Ej202PaddingMarginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj08PaddingMarginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj08PaddingMarginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}