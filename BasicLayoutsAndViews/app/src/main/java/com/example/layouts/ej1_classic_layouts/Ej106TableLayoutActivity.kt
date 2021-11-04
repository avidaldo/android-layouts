package com.example.layouts.ej1_classic_layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layouts.databinding.ActivityEj106TableLayoutBinding

class Ej106TableLayoutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj106TableLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj106TableLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}