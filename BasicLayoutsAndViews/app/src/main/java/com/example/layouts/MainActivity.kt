package com.example.layouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.layouts.ej1_classic_layouts.Ej1ClassicLayoutsActivity
import com.example.layouts.databinding.ActivityMainBinding
import com.example.layouts.ejercicios.EjerciciosActivity
import com.example.layouts.ej2_introviews.Ej2IntroViewsActivity
import com.example.layouts.ej3_scrollviews.Ej3ScrollViewActivity

/* https://developer.android.com/guide/topics/ui/declaring-layout */

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        Log.i(":::", "Hola")


        binding.buttonToBasicLayouts.setOnClickListener {
            startActivity(Intent(this, Ej1ClassicLayoutsActivity::class.java))
        }
        binding.buttonToIntroviews.setOnClickListener {
            startActivity(Intent(this, Ej2IntroViewsActivity::class.java))
        }
        binding.buttonToScrollView.setOnClickListener {
            startActivity(Intent(this, Ej3ScrollViewActivity::class.java))
        }
        binding.ejercicios.setOnClickListener {
            startActivity(Intent(this, EjerciciosActivity::class.java))
        }

    }

}