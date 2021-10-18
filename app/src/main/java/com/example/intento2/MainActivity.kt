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
        enunciado.text = "Proyecto 101"
        in1.isVisible = false
        in2.isVisible = false
        in3.isVisible = false
        in4.isVisible = false
        in5.isVisible = false
        resultado.text = ""

        button.setOnClickListener {
//            val num1 = in1.text.toString().toFloat()
//            val num2 = in2.text.toString().toFloat()
//            val num3 = in3.text.toString().toFloat()
//            val num4 = in4.text.toString().toFloat()
//            val num5 = in5.text.toString().toFloat()
            mensajeComplex("This program returns the first and last elements of an array")
//            val arrayNumeros:FloatArray = FloatArray(5)
//            arrayNumeros[0]=num1
//            arrayNumeros[1]=num2
//            arrayNumeros[2]=num3
//            arrayNumeros[3]=num4
//            arrayNumeros[4]=num5
            val arrayNumeros= arrayOf<Int>(1,2,3,4,5,6,7,8,9,10)
            mensajeArray(arrayNumeros)
        }
    }
    fun mensajeArray(elarray: Array<Int>) {
        var palabras = resultado.text.toString()

            palabras += "the first number is ${elarray[0]} \n"

            palabras += "the last number is ${elarray.last()}\n"


        resultado.text = palabras
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


