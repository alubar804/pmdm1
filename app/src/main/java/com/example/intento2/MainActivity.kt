package com.example.intento2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import androidx.core.view.isVisible
import com.example.intento2.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        enunciado.text = "Proyecto 80"
//        in1.isVisible= false
//        in2.isVisible= false
        in3.isVisible= false
        in4.isVisible= false
        in5.isVisible= false
        resultado.text =""


        button.setOnClickListener {
            val num1 = in1.text.toString().toInt()
            val num2 = in2.text.toString().toInt()
//            val num3 = in3.text.toString().toInt()
//        val num4 = in4.text.toString().toInt()
//            //            val num5 = in5.text.toString().toInt()
            mensaje("This program returns the biggest out of two numbers")
            var valor = operacion(num1,num2)
            mensaje("The biggest number is $valor")
            mensaje("End of the program, thanks for using it")





        }
    }



    fun operacion(num1:Int,num2:Int) : Int{
        if (num1>num2){
            return num1
        }else{
            return num2
        }


    }

    fun mensaje(mensaje:String){
        var palabras =resultado.text.toString()
        palabras+=("*******************************\n")
        palabras+= "$mensaje \n"
        palabras+=("*******************************\n")
        resultado.text =palabras
    }


}


