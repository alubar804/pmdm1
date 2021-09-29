package com.example.intento2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intento2.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        enunciadoDos.text="Proyecto 6"
        buttonUno.setOnClickListener {
            val num1 = uno1.text.toString().toInt()
//            val num2 = dos2.text.toString().toInt()
//            val suma = num1 + num2
//            val producto = pr5num1 * pr5num2
            val resul = "El resultado de la suma es:"+suma.toString()+"El producto de la multiplicacion es:"+producto.toString()
            resultado.text = resul
        }

        println("Proyecto6:")
        //Realizar la carga del lado de un cuadrado, mostrar por pantalla el perímetro del
        //mismo (El perímetro de un cuadrado se calcula multiplicando el valor del lado por
        //cuatro)
        println("introduce el lado del cuadrado")
        val pr6num1 = readLine()!!.toInt()
        val pr6per=pr6num1*4
        println("El perimetro es igual a la suma de los lados:"+pr6per.toString())





    }




}
