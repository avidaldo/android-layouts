package com.example.layouts.ej2_introviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.layouts.databinding.ActivityEj206RotationBinding

class Ej206RotationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj206RotationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj206RotationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tv1.setOnClickListener { mostrarTextoRotado(it) }
        binding.tv2.setOnClickListener { rotar(it) }


    }

    fun mostrarTextoRotado(view: View?) {
        view?.visibility = View.GONE
        binding.tv2.visibility = View.VISIBLE
    }

    /** Añade una rotación de 25º a la rotación ya presente */
    fun rotar(view: View?) {
        binding.tv2.rotation += 25
    }

}