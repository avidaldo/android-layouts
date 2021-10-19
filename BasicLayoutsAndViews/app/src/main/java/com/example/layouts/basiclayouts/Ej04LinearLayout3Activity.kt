package com.example.layouts.basiclayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layouts.databinding.ActivityEj04LinearLayout3Binding

class Ej04LinearLayout3Activity : AppCompatActivity() {

    private lateinit var binding: ActivityEj04LinearLayout3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj04LinearLayout3Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}