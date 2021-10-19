package com.example.layouts.classic_layouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layouts.databinding.ActivityBasicLayoutsBinding

class BasicLayoutsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBasicLayoutsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBasicLayoutsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button01.setOnClickListener { startActivity(Intent(this, Ej101FrameLayoutActivity::class.java)) }
        binding.button02.setOnClickListener { startActivity(Intent(this, Ej102LinearLayoutActivity::class.java)) }
        binding.button03.setOnClickListener { startActivity(Intent(this, Ej103LinearLayout2Activity::class.java)) }
        binding.button04.setOnClickListener { startActivity(Intent(this, Ej104LinearLayout3Activity::class.java)) }
        binding.button05.setOnClickListener { startActivity(Intent(this, Ej105LinearLayout4Activity::class.java)) }
        binding.button06.setOnClickListener { startActivity(Intent(this, Ej106TableLayoutActivity::class.java)) }
    }
}