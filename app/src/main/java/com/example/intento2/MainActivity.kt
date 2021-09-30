package com.example.intento2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import com.example.intento2.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        enunciado.text = "Proyecto 30"
//        in1.hint="Ingrese dia"
//        in2.hint="Ingrese mes"
//        in3.hint="Ingrese año"
        in1.isVisible= true
        in2.isVisible= true
        in3.isVisible= true
        in4.isVisible= false
        in5.isVisible= false
        button.setOnClickListener {
            val num1 = in1.text.toString().toInt()
            val num2 = in2.text.toString().toInt()
            val num3 = in3.text.toString().toInt()
//            val num4 = in4.text.toString().toInt()
//            val num5 = in5.text.toString().toInt()
            //            val suma = num1 + num2 + num3
//            val resta = num1 - num2
//            val producto = num1 * num2
//            val division = num1 / num2
//          val cuadrado=num1*4
//            val promedio = suma / 3
//            val digitos = if (num1 < 10) 1  else 2
//            val mensaje = if (promedio>=7) "Promocionado"
//            else if (promedio>=4 && promedio<7) "Regular"
//            else "Reprobado"
            val menor = if (num1 < num2 && num1 < num3) num1 else if (num2 < num3) num2 else num3
            val mayor = if (num1 > num2 && num1 > num3) num1 else if (num2 > num3) num2 else num3
            resultado.text=("El mayor de la lista es $mayor y el menor $menor")

}
    }


}

