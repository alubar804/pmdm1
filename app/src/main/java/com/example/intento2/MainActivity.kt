package com.example.intento2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        enunciado.text = "Proyecto 111"
//        in1.isVisible = false
//        in2.isVisible = false
//        in3.isVisible = false
        in4.isVisible = false
        in5.isVisible = false
        resultado.text = ""

        button.setOnClickListener {
            mensajeComplex("This program assigns values to the class Triangulo")
            val num1 = in1.text.toString()
            val num2 = in2.text.toString().toInt()
            val num3 = in3.text.toString()
            val num4 = in4.text.toString().toInt()
//            val num5 = in5.text.toString().toInt()
            val alu1 = Alumno()
            alu1.inicializar(num2,num1)
            mensaje( alu1.imprimir())
            mensaje(" This Student has ${ alu1.imprimir() } marks")
            val alu2 = Alumno()
            alu2.inicializar(num4,num3)
            mensaje( alu2.imprimir())
            mensaje(" This Student has ${ alu2.imprimir() } marks")
        }
    }
    class Alumno {
        var nota: Int = 0
        var nombre: String = ""

        fun inicializar(num1: Int, num2: String,) {
            this.nota = num1
            this.nombre = num2
        }
        fun imprimir() :String{
            return ("The student $nombre has marks of $nota")
        }
        fun regular():String {
           when{
               nota>4->return "Regular"
               else ->return "Under regular"
           }
        }
    }
    fun operacion() {
        var palabras = resultado.text.toString()
        fun subOperacion(pr: Int, sg: Int) = if (pr > sg) pr else sg
        val array = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

        for (i in array) {
            subOperacion(i, 5)
            palabras += "out of $i and 5, ${subOperacion(i, 5)} is bigger\n"

            resultado.text = palabras
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