package com.example.layouts.basiclayouts

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


        binding.button01.setOnClickListener { startActivity(Intent(this, Ej01FrameLayoutActivity::class.java)) }
        binding.button02.setOnClickListener { startActivity(Intent(this, Ej02LinearLayoutActivity::class.java)) }
        binding.button03.setOnClickListener { startActivity(Intent(this, Ej03LinearLayout2Activity::class.java)) }
        binding.button04.setOnClickListener { startActivity(Intent(this, Ej04LinearLayout3Activity::class.java)) }
        binding.button05.setOnClickListener { startActivity(Intent(this, Ej05LinearLayout4Activity::class.java)) }
        binding.button06.setOnClickListener { startActivity(Intent(this, Ej06TableLayoutActivity::class.java)) }
    }
}