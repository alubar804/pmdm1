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
        enunciado.text = "Proyecto 42"
//        in1.hint="Ingrese dia"
//        in2.hint="Ingrese mes"
//        in3.hint="Ingrese año"
//        in1.isVisible= false
        in2.isVisible= false
        in3.isVisible= false
        in4.isVisible= false
        in5.isVisible= false
        button.setOnClickListener {
            val num1 = in1.text.toString().toInt()
//            val num2 = in2.text.toString().toInt()
//            val num3 = in3.text.toString().toInt()
//            val num4 = in4.text.toString().toInt()
//            //            val num5 = in5.text.toString().toInt()
//            val arrayListo =  arrayOf<Int>(num1,num2,num3,num4)
            //            val resta = num1 - num2
            //            val producto = num1 * num2
            //            val division = num1 / num2
            //          val cuadrado=num1*4
            //            val promedio = suma / 3
            var x =0
            do {
                //esto crea un bucle infinito y peta, no es traducible parece
                x = num1
                if (x>-1)
                    if (x <10)
                        resultado.text =("el numero $x tiene 1 cifra")
                    else if (x <100)
                        resultado.text =("el numero $x tiene 2 cifras")
                    else if (x<1000)
                        resultado.text =("el numero $x tiene 3 cifras")
                    else
                        resultado.text = "error"
                else
                    resultado.text = "negativo no validos"
            }while (x !=0)




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
