package com.example.layouts.classic_layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layouts.databinding.ActivityEj03LinearLayout2Binding

class Ej103LinearLayout2Activity : AppCompatActivity() {

    private lateinit var binding: ActivityEj03LinearLayout2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj03LinearLayout2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}