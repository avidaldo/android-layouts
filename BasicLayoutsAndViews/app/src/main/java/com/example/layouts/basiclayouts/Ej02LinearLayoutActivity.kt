package com.example.layouts.basiclayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layouts.databinding.ActivityEj02LinearLayoutBinding


class Ej02LinearLayoutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj02LinearLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj02LinearLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}