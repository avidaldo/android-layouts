package com.example.layouts.ej1_classic_layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layouts.databinding.ActivityEj101FrameLayoutBinding

class Ej101FrameLayoutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj101FrameLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj101FrameLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}