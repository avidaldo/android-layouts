package com.example.layouts.ej1_classic_layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layouts.databinding.ActivityEj103LinearLayout2Binding

class Ej103LinearLayout2Activity : AppCompatActivity() {

    private lateinit var binding: ActivityEj103LinearLayout2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj103LinearLayout2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}