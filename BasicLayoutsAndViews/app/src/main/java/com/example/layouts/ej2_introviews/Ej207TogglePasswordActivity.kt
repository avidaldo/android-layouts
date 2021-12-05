package com.example.layouts.ej2_introviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import com.example.layouts.R
import com.example.layouts.databinding.ActivityEj207TogglePasswordBinding

class Ej207TogglePasswordActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEj207TogglePasswordBinding


    private var passwordVisible = false
        set(value) {
            binding.buttonShowPassword.text =
                if (value) getString(R.string.hidePassword)
                else getString(R.string.showPassword)
            //Toast.makeText(this, binding.editTextTextPassword.inputType.toString(), Toast.LENGTH_SHORT).show()
            field = value
        }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj207TogglePasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonShowPassword.setOnClickListener {
            changePasswordVisibility1()
            //changePasswordVisibility2()
        }

    }

    private fun changePasswordVisibility1() {
        /* Solución de bajo nivel (sacada de leer el código) */
        binding.editTextTextPassword.inputType =
            if (passwordVisible) InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD  // 129
            else InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD // 145
        passwordVisible = !passwordVisible
    }

    private fun changePasswordVisibility2() {
        /* https://developer.android.com/reference/android/text/method/TransformationMethod */
        binding.editTextTextPassword.transformationMethod =
            if (passwordVisible) PasswordTransformationMethod()
            else HideReturnsTransformationMethod.getInstance() // null
        passwordVisible = !passwordVisible
    }


}