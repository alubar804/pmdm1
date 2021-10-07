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
        enunciado.text = "Proyecto 69"
//        in1.isVisible= false
//        in2.isVisible= false
//        in3.isVisible= false
//        in4.isVisible= false
        in5.isVisible= false
        button.setOnClickListener {
            val num1 = in1.text.toString().toInt()
            val num2 = in2.text.toString().toInt()
            val num3 = in3.text.toString().toInt()
            val num4 = in4.text.toString().toInt()
//            //            val num5 = in5.text.toString().toInt()
            val arrayListo =  arrayOf<Int>(num1,num2,num3,num4)
            var palabras =""
            var cont0 =0
            var cont2 =0
            var cont1 =0
            var contMas=0
            for (i in arrayListo)
                when(i){
                    0 -> cont0++
                    1 -> cont1++
                    2 -> cont2++
                    else -> contMas++

                }
            palabras= "the families have this many children:\n $cont0 zero children \n $cont1 one child\n" +
                    " $cont2 two children\n $contMas have more than two"
            resultado.text =palabras

        }
    }


}





