package com.example.intento2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intento2.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        enunciado.text = "Proyecto 17"
        button.setOnClickListener {
            val num1 = in1.text.toString().toInt()
//            val num2 = in2.text.toString().toInt()
//            val num3 = in3.text.toString().toInt()
//            val num4 = in4.text.toString().toInt()
//          val num5 = in5.text.toString().toInt()
//            val suma = num1 + num2
//            val resta = num1 - num2
//            val producto = num1 * num2
//            val division = num1 / num2
//          val cuadrado=num1*4
//            val promedio = suma / 4
            val digitos = if (num1 < 10) 1  else 2
            
            resultado.text =("El numero de digitos es $digitos")





        }
    }


}

fun pr17() {

    println("Proyecto17:")
    //Cargar un valor entero por teclado comprendido entre 1 y 99. Almacenar
    //en otra variable la cantidad de dígitos que tiene el valor ingresado por
    //teclado.
    //Mostrar la cantidad de dígitos del número ingresado por teclado.
    print("Ingrese un valor comprendido entre 1 y 99:")
    val pr17num1 = readLine()!!.toInt()
    val digitos = if (pr17num1 < 10) 1  else 2
    println("El numero de digitos es $digitos")
}
fun pr18() {

    println("Proyecto18:")
    //Confeccionar un programa que pida por teclado tres notas de un alumno, calcule
    //el promedio e imprima alguno de estos mensajes:
    //Si el promedio es >=7 mostrar "Promocionado".
    //Si el promedio es >=4 y <7 mostrar "Regular".
    //Si el promedio es <4 mostrar "Reprobado".
    print("Ingresa numero")
    val num1 = readLine()!!.toInt()

}
fun pr19() {

    println("Proyecto19:")
    //Se cargan por teclado tres números distintos. Mostrar por pantalla el
    //mayor de ellos.

}
fun pr20() {

    println("Proyecto20:")
    //Se ingresa por teclado un valor entero, mostrar una leyenda que indique si
    //el número es positivo, nulo o negativo.

}
fun pr21() {
    println("Proyecto21:")
    //Confeccionar un programa que permita cargar un número entero positivo
    //de hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3
    //cifras. Mostrar un mensaje de error si el número de cifras es mayor.
}