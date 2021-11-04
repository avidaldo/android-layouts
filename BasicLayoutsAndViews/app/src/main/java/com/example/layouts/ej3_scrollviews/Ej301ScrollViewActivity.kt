package com.example.layouts.ej3_scrollviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layouts.databinding.ActivityEj301ScrollViewBinding


class Ej301ScrollViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj301ScrollViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj301ScrollViewBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

}