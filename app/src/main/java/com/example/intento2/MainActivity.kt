package com.example.intento2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        enunciado.text = "Proyecto 127"
        in1.isVisible = false
        in2.isVisible = false
        in3.isVisible = false
        in4.isVisible = false
        in5.isVisible = false
        resultado.text = ""
        button.setOnClickListener {
            mensajeComplex("This program operates the class Dado ")

            val clase1 = Dado()
            clase1.tirar()
            mensajeComplex(clase1.imprimir())
        }
    }
    class Dado() {
        private var valor: Int = 1
            set(valor) {
                if (valor<1 || valor >6)
                    field = 1
                else
                    field = valor
            }
        fun tirar() :Int{
            valor=((Math.random()*6)+1).toInt()
            return valor
        }
        fun imprimir():String {
            return "the value of the die is $valor"
        }

    }



    fun mensaje(mensaje: String) {
        var palabras = resultado.text.toString()
        palabras += "$mensaje \n"
        resultado.text = palabras
    }

    fun mensajeComplex(mensaje: String) {
        var palabras = resultado.text.toString()
        palabras += ("*******************************\n")
        palabras += "$mensaje \n"
        palabras += ("*******************************\n")
        resultado.text = palabras
    }
}