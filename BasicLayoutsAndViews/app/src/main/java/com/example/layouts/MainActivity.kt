package com.example.layouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.layouts.basiclayouts.BasicLayoutsActivity
import com.example.layouts.databinding.ActivityMainBinding
import com.example.layouts.introviews.IntroViewsActivity
import com.example.layouts.scroll.ScrollViewActivity

/* https://developer.android.com/guide/topics/ui/declaring-layout */

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        Log.i(":::", "Hola")


        binding.buttonToBasicLayouts.setOnClickListener {
            startActivity(Intent(this, BasicLayoutsActivity::class.java))
        }
        binding.buttonToIntroviews.setOnClickListener {
            startActivity(Intent(this, IntroViewsActivity::class.java))
        }
        binding.buttonToScrollView.setOnClickListener {
            startActivity(Intent(this, ScrollViewActivity::class.java))
        }

    }

}