package com.example.layouts.ej2_introviews

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layouts.databinding.ActivityEj2ConstraintLayoutBinding

class Ej2IntroViewsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj2ConstraintLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj2ConstraintLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button201.setOnClickListener { startActivity(Intent(this, Ej201BasicViewsActivity::class.java)) }
        binding.button202.setOnClickListener { startActivity(Intent(this, Ej202PaddingMarginActivity::class.java)) }
        binding.button203.setOnClickListener { startActivity(Intent(this, Ej203DefinicionRecursosActivity::class.java)) }
        binding.button204.setOnClickListener { startActivity(Intent(this, Ej204ProgramaticoActivity::class.java)) }
        binding.button205.setOnClickListener { startActivity(Intent(this, Ej205VisibilidadActivity::class.java)) }
        binding.button206.setOnClickListener { startActivity(Intent(this, Ej206RotationActivity::class.java)) }
        binding.button207.setOnClickListener { startActivity(Intent(this, Ej207TogglePasswordActivity::class.java)) }

    }

}