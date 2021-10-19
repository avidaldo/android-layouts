package com.example.layouts.scroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layouts.databinding.ActivityEj11ScrollViewBinding


class Ej11ScrollViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj11ScrollViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj11ScrollViewBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

}