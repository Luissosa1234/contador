package com.example.contador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var contador = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Se agrega contador al valor para aumentar el numero en el texto
        btnIncrementar.setOnClickListener{
            contador++
            txtContador.text = "$contador"
        }


        //Se agrega contador al valor para aumentar el decrementar en el texto
        btnDecrementar.setOnClickListener{
            contador--
            txtContador.text = "$contador"
        }
    }
}