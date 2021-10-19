package com.example.layouts.scrollviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.layouts.databinding.ActivityEj13NestedScrollViewBinding

class Ej303NestedScrollViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj13NestedScrollViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj13NestedScrollViewBinding.inflate(layoutInflater)
        setContentView(binding.root)


        /* Ejemplo de gestión del evento OnScrollChange. Se cambia el título de la Toolbar con las
        coordenadas y se muestra un Toast en el momento en que se llega al final del desplazamiento
         */
        binding.parentScroll.setOnScrollChangeListener { v, scrollX, scrollY, _, _ -> // Los parámetros de entrada no usados pueden renombrarse a "_"
            title = "Scroll ($scrollX, $scrollY)"  // Cambiamos el atributo title (titulo de la toolbar de la AppCompatActivity)

            if (!v.canScrollVertically(1)) //  si no se puede seguir haciendo scroll hacia abajo
                Toast.makeText(this, "Final", Toast.LENGTH_SHORT).show()
        }

    }



}
