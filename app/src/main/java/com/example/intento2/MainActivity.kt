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
        enunciado.text = "Proyecto 73"
//        in1.isVisible= false
//        in2.isVisible= false
//        in3.isVisible= false
        in4.isVisible= false
        in5.isVisible= false
        resultado.text =""
        button.setOnClickListener {

            operacion1()
            separador()
            operacion1()





        }
    }


    fun operacion1(){
        var palabras =resultado.text.toString()
        val num1 = in1.text.toString().toInt()
        val num2 = in2.text.toString().toInt()
        val num3 = in3.text.toString().toInt()
//        val num4 = in4.text.toString().toInt()
//            //            val num5 = in5.text.toString().toInt()
//        val arrayListo =  arrayOf<Int>(num1,num2,num3,num4)

        val menor = if (num1 < num2 && num1 < num3) num1 else if (num2 < num3) num2 else num3
        palabras+="The smallest number of inputed ones is $menor\n"
        resultado.text =palabras
    }
    fun operacion2(){
        var palabras =resultado.text.toString()
//        val num1 = in1.text.toString().toInt()
        val num2 = in2.text.toString().toInt()
        val num3 = in3.text.toString().toInt()
//        val num4 = in4.text.toString().toInt()
//            //            val num5 = in5.text.toString().toInt()
//        val arrayListo =  arrayOf<Int>(num1,num2,num3,num4)
        val suma = num3+num2
        palabras+="The value of the sum of $num2 and $num3 is $suma\n"
        resultado.text =palabras
    }
    fun separador(){
        var palabras =resultado.text.toString()
        palabras+=("*******************************\n")

        resultado.text =palabras
    }

}


