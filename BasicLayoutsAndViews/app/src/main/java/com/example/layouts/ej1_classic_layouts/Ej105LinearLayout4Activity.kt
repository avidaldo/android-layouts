package com.example.layouts.ej1_classic_layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layouts.databinding.ActivityEj105LinearLayout4Binding

class Ej105LinearLayout4Activity : AppCompatActivity() {

    private lateinit var binding: ActivityEj105LinearLayout4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj105LinearLayout4Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}