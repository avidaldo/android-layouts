package com.example.layouts.basiclayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layouts.databinding.ActivityEj05LinearLayout4Binding

class Ej05LinearLayout4Activity : AppCompatActivity() {

    private lateinit var binding: ActivityEj05LinearLayout4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj05LinearLayout4Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}