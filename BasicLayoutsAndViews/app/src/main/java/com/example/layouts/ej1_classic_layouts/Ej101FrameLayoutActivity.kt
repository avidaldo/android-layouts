package com.example.layouts.classic_layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layouts.databinding.ActivityEj01FrameLayoutBinding

class Ej101FrameLayoutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj01FrameLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj01FrameLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}