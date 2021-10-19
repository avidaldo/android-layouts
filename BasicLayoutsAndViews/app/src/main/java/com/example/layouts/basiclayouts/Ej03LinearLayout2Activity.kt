package com.example.layouts.basiclayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layouts.databinding.ActivityEj03LinearLayout2Binding

class Ej03LinearLayout2Activity : AppCompatActivity() {

    private lateinit var binding: ActivityEj03LinearLayout2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj03LinearLayout2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}