package com.example.layouts.ej4_contraintlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layouts.databinding.ActivityEj4ConstraintLayoutBinding


//https://developer.android.com/training/constraint-layout


class Ej4ConstraintLayoutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj4ConstraintLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj4ConstraintLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btn401.setOnClickListener {
            startActivity(Intent(this, CadenasActivity::class.java))
        }



    }

}