package com.example.layouts.ejercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.example.layouts.R
import com.example.layouts.databinding.ActivityEjercicio3Binding

class Ejercicio3Activity : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicio3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        /* Al hacer click en “Iniciar Sesión” se comprobará que los dos campos tengan algún contenido. Si alguno está
        vacío, se mostrará un Toast indicándolo (“Debe introducir un nombre de usuario”; “Debe introducir una
        contraseña”). Además, la contraseña debe tener más de 8 caracteres. */


        binding.btnLogin.setOnClickListener {

            if (binding.etUser.text.isEmpty()) {
                Toast.makeText(this, R.string.empty_user, Toast.LENGTH_SHORT).show()
            } else if (binding.etPassword.text.isEmpty()) {
                Toast.makeText(this, R.string.empty_password, Toast.LENGTH_SHORT).show()
            } else if (binding.etPassword.text.length <= 8) {
                Toast.makeText(this, R.string.invalid_password, Toast.LENGTH_SHORT).show()
            } else {
                // Comprobación de credenciales (Autenticación)
                // if (comprobacion) {
                //      sesion
                //      intent a activity
                // }
            }

        }

        binding.tvOlvido.setOnClickListener {
            Toast.makeText(this, R.string.forgot_password, Toast.LENGTH_SHORT).show()
        }

    }

}