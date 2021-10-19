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


        binding.button07.setOnClickListener { startActivity(Intent(this, Ej201BasicViewsActivity::class.java)) }
        binding.button08.setOnClickListener { startActivity(Intent(this, Ej202PaddingMarginActivity::class.java)) }
        binding.button09.setOnClickListener { startActivity(Intent(this, Ej203DefinicionRecursosActivity::class.java)) }
        binding.button10.setOnClickListener { startActivity(Intent(this, Ej204ProgramaticoActivity::class.java)) }


    }
}