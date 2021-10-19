package com.example.layouts.scrollviews

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layouts.databinding.ActivityScrollViewBinding


/* Basado en: https://www.develou.com/scrollview-en-android/ */

class ScrollViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityScrollViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScrollViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button11.setOnClickListener {
            startActivity(Intent(this, Ej301ScrollViewActivity::class.java))
        }
        binding.button12.setOnClickListener {
            startActivity(Intent(this, Ej302HorizontalScrollViewActivity::class.java))
        }
        binding.button13.setOnClickListener {
            startActivity(Intent(this, Ej303NestedScrollViewActivity::class.java))
        }

    }

}