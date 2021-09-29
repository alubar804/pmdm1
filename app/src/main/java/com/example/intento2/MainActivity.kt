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
        enunciado.text = "Proyecto 12"
        button.setOnClickListener {
            val num1 = in1.text.toString().toInt()
            val num2 = in2.text.toString().toInt()
//            val num3 = in3.text.toString().toInt()
//            val num4 = in4.text.toString().toInt()
//          val num5 = in5.text.toString().toInt()
            val suma = num1 + num2
            val resta = num1 - num2
            val producto = num1 * num2
            val division = num1 / num2
//          val cuadrado=num1*4
//            val promedio = suma / 4

            if (num1<num2)
                resultado.text = "El resultado de la suma es: $suma" +
                        "\nEl resultado de la resta es: $resta"
            else
                resultado.text = "El resultado de la multiplicacion es: $producto " +
                        "\nl resultado de la division es: $division"

        }
    }


}


fun pr13(){

    println("Proyecto13:")
    //Se ingresan tres notas de un alumno, si el promedio es mayor o igual a
    //siete mostrar un mensaje "Promocionado".
    val pr13nota1 = 123.4f
    val pr13nota2 = 56.7f
    val pr13nota3 = 89.1f
    val pr13media =(pr13nota1+pr13nota2+pr13nota3)/3
    if(pr13media>=7)
        println("Promocionado")




}
fun pr14(){
    println("Proyecto14:")
    //Se ingresa por teclado un número entero comprendido entre 1 y 99,
    //mostrar un mensaje indicando si el número tiene uno o dos dígitos.
    //(Tener en cuenta que condición debe cumplirse para tener dos dígitos, un
    //número entero)
    print("Ingrese un valor comprendido entre 1 y 99:")
    val pr14num1 = readLine()!!.toInt()
    if (pr14num1 < 10)
        println("Tiene un dígito")
    else
        println("Tiene dos dígitos")

}
fun pr15(){
    println("Proyecto15:")
    //Cargar dos valores enteros, almacenar el mayor de los mismos en otra variable y
    //mostrarlo.

    print("Ingrese primer numero:")
    val pr15num1 = readLine()!!.toInt()
    print("Ingrese segundo numero:")
    val pr15num2 = readLine()!!.toInt()
    val mayor = if (pr15num1 > pr15num2) pr15num1 else pr15num2
    println("El mayor entre $pr15num1 y $pr15num2 es $mayor")

}
fun pr16(){
    println("Proyecto16:")
    //Ingresar por teclado un valor entero. Almacenar en otra variable el cuadrado de
    //dicho número si el valor ingresado es par, en caso que sea impar guardar el
    //cubo.
    //Mostrar además un mensaje que indique si se calcula el cuadrado o el cubo.
    print("Ingrese primer numero:")
    val pr16num1 = readLine()!!.toDouble()
    val operado = if (pr16num1%2.0==0.0) pr16num1.pow(2) else pr16num1.pow(3)
    println("El resultado es $operado")
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