package com.example.layouts.scroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layouts.databinding.ActivityEj12HorizontalScrollViewBinding


class Ej12HorizontalScrollViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj12HorizontalScrollViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj12HorizontalScrollViewBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}