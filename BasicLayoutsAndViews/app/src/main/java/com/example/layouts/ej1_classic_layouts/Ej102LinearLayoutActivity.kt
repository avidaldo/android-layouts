package com.example.layouts.ej1_classic_layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layouts.databinding.ActivityEj102LinearLayoutBinding


class Ej102LinearLayoutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj102LinearLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj102LinearLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}