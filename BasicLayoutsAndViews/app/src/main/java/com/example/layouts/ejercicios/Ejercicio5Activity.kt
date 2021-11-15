package com.example.layouts.ejercicios

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.TextView
import com.example.layouts.databinding.ActivityEjercicio5Binding

class Ejercicio5Activity : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicio5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.doneButton.setOnClickListener { addNickname(it) }


    }


    private fun addNickname(view: View) {
        binding.nicknameText.text = binding.nicknameEdit.text
        binding.nicknameEdit.visibility = View.GONE // Ocultamos el EditText
        view.visibility = View.GONE
        binding.nicknameText.visibility = View.VISIBLE // Mostramos el TextView


        // Para oultar el teclado:
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }


}