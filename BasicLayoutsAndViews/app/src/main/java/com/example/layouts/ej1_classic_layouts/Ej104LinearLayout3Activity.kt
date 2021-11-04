package com.example.layouts.ej1_classic_layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layouts.databinding.ActivityEj104LinearLayout3Binding

class Ej104LinearLayout3Activity : AppCompatActivity() {

    private lateinit var binding: ActivityEj104LinearLayout3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj104LinearLayout3Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}