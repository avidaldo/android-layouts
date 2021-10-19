package com.example.layouts.introviews

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layouts.databinding.ActivityConstraintLayoutBinding

class IntroViewsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityConstraintLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConstraintLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button07.setOnClickListener { startActivity(Intent(this, Ej07BasicViewsActivity::class.java)) }
        binding.button08.setOnClickListener { startActivity(Intent(this, Ej08PaddingMarginActivity::class.java)) }
        binding.button09.setOnClickListener { startActivity(Intent(this, Ej09DefinicionRecursosActivity::class.java)) }
        binding.button10.setOnClickListener { startActivity(Intent(this, Ej10ProgramaticoActivity::class.java)) }


    }
}