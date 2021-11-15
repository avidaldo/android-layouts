package com.example.layouts.ej2_introviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ToggleButton
import com.example.layouts.databinding.ActivityEj205VisibilityBinding

class Ej205VisibilidadActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj205VisibilityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj205VisibilityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toggleButton.setOnClickListener {
            if ((it as ToggleButton).isChecked)
                binding.ivMiraAqui.visibility = View.VISIBLE
            else
                binding.ivMiraAqui.visibility = View.INVISIBLE

        }

    }

}