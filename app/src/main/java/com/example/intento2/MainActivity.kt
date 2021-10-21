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
        enunciado.text = "Proyecto 125"
        in1.isVisible = false
        in2.isVisible = false
        in3.isVisible = false
        in4.isVisible = false
        in5.isVisible = false
        resultado.text = ""
        button.setOnClickListener {
            mensajeComplex("This program operates the class Persona ")

            //            val num2 = in2.text.toString().toInt()
            //            val num3 = in3.text.toString()
            //            val num4 = in4.text.toString().toInt()
            //            val num5 = in5.text.toString().toInt()
            val persona1 = Persona()
            persona1.nom = "juan"
            persona1.edad = 23
            mensaje(persona1.nom)
            mensaje(persona1.edad.toString())
            persona1.edad = -50
            mensaje(persona1.edad.toString())
        }
    }
    class Persona {
        var nom: String = ""
            set(valor) {
                field = valor.uppercase(Locale.getDefault())
            }
            get() {
                return "(" + field + ")"
            }

        var edad: Int = 0
            set(valor) {
                if (valor >= 0)
                    field = valor
                else
                    field = 0
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