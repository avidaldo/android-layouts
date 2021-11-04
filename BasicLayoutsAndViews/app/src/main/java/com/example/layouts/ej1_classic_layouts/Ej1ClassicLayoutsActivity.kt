package com.example.layouts.ej1_classic_layouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layouts.databinding.ActivityEj1ClassicLayoutsBinding

class Ej1ClassicLayoutsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj1ClassicLayoutsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEj1ClassicLayoutsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button101.setOnClickListener { startActivity(Intent(this, Ej101FrameLayoutActivity::class.java)) }
        binding.button102.setOnClickListener { startActivity(Intent(this, Ej102LinearLayoutActivity::class.java)) }
        binding.button103.setOnClickListener { startActivity(Intent(this, Ej103LinearLayout2Activity::class.java)) }
        binding.button104.setOnClickListener { startActivity(Intent(this, Ej104LinearLayout3Activity::class.java)) }
        binding.button105.setOnClickListener { startActivity(Intent(this, Ej105LinearLayout4Activity::class.java)) }
        binding.button106.setOnClickListener { startActivity(Intent(this, Ej106TableLayoutActivity::class.java)) }
    }
}