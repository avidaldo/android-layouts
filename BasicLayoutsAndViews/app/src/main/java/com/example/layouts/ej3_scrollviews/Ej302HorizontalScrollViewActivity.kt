package com.example.layouts.ej3_scrollviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layouts.databinding.ActivityEj302HorizontalScrollViewBinding


class Ej302HorizontalScrollViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj302HorizontalScrollViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj302HorizontalScrollViewBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}