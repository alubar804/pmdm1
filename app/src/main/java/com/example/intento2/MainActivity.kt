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
        enunciado.text = "Proyecto 39"
//        in1.hint="Ingrese dia"
//        in2.hint="Ingrese mes"
//        in3.hint="Ingrese año"
        in1.isVisible= false
        in2.isVisible= false
        in3.isVisible= false
        in4.isVisible= false
        in5.isVisible= false
        button.setOnClickListener {
//            val num1 = in1.text.toString().toInt()
//            val num2 = in2.text.toString().toInt()
//            val num3 = in3.text.toString().toInt()
//            val num4 = in4.text.toString().toInt()
//            //            val num5 = in5.text.toString().toInt()
//            val arrayListo =  arrayOf<Int>(num1,num2,num3)
            //            val resta = num1 - num2
            //            val producto = num1 * num2
            //            val division = num1 / num2
            //          val cuadrado=num1*4
            //            val promedio = suma / 3
            var palabras=""

            var mult8 = 8
            while (mult8 <= 500) {
                palabras+=("$mult8 -\n")
                mult8 = mult8 + 8
            }
            resultado.text=("$palabras")

}
    }


}







fun main(parametro: Array<String>) {
    var mult8 = 8
    while (mult8 <= 500) {
        print("$mult8 -")
        mult8 = mult8 + 8
    }
}
