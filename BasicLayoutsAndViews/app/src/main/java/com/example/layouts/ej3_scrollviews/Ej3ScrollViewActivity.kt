package com.example.layouts.ej3_scrollviews

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layouts.databinding.ActivityEj3ScrollBinding


/* Basado en: https://www.develou.com/scrollview-en-android/ */

class Ej3ScrollViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEj3ScrollBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj3ScrollBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button301.setOnClickListener {
            startActivity(Intent(this, Ej301ScrollViewActivity::class.java))
        }
        binding.button302.setOnClickListener {
            startActivity(Intent(this, Ej302HorizontalScrollViewActivity::class.java))
        }
        binding.button303.setOnClickListener {
            startActivity(Intent(this, Ej303NestedScrollViewActivity::class.java))
        }

    }

}