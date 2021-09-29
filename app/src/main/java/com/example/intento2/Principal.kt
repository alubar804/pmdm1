package com.example.intento2

import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.pow
import com.example.intento2.unInput.*
import com.example.intento2.dosInputs.*
import com.example.intento2.tresInputs.*
import com.example.intento2.cuatroInputs.*
import com.example.intento2.cincoInputs.*

    fun main(){
//    do {
//        println("introduce el numero de proyecto")
//        val selector = readLine()!!.toInt()
//        when (selector) {
//            -1 -> continue
//            3 -> pr3()
//            4 -> pr4()
//            5 -> pr5()
//            6 -> pr6()
//            7 -> pr7()
//            8 -> pr8()
//            9 -> pr9()
//            10 -> pr10()
//            11 -> pr11()
//            12 -> pr12()
//            13 -> pr13()
//            14 -> pr14()
//            15 -> pr15()
//            16 -> pr16()
//            17 -> pr17()
//            18 -> pr18()
//            19 -> pr19()
//            20 -> pr20()
//            21 -> pr21()
//            22 -> pr22()
//            23 -> pr23()
//            24 -> pr24()
//            25 -> pr25()
//            26 -> pr26()
//            27 -> pr27()
//            28 -> pr28()
//            29 -> pr29()
//            30 -> pr30()
//            31 -> pr31()
//            32 -> pr32()
//            33 -> pr33()
//            34 -> pr34()
//            35 -> pr35()
//            36 -> pr36()
//            37 -> pr37()
//            38 -> pr38()
//            39 -> pr39()
//            40 -> pr40()
//            41 -> pr41()
//            42 -> pr42()
//            43 -> pr43()
//            44 -> pr44()
//            45 -> pr45()
//            46 -> pr46()
//            47 -> pr47()
//            48 -> pr48()
//            49 -> pr49()
//            50 -> pr50()
//            51 -> pr51()
//            52 -> pr52()
//            53 -> pr53()
//            54 -> pr54()
//            55 -> pr55()
//            56 -> pr56()
//            57 -> pr57()
//            58 -> pr58()
//            59 -> pr59()
//            60 -> pr60()
//            61 -> pr61()
//            62 -> pr62()
//            63 -> pr63()
//            64 -> pr64()
//            65 -> pr65()
//            66 -> pr66()
//            67 -> pr67()
//            68 -> pr68()
//            69 -> pr69()
//            70 -> pr70()
//            71 -> pr71()
//            72 -> pr72()
//            73 -> pr73()
//            74 -> pr74()
//            75 -> pr75()
//            76 -> pr76()
//            77 -> pr77()
//            78 -> pr78()
//            79 -> pr79()
//            80 -> pr80()
//            81 -> pr81()
//            82 -> pr82()
//            83 -> pr83()
//            84 -> pr84()
//            85 -> pr85()
//            86 -> pr86()
//            87 -> pr87()
//            88 -> pr88()
//            89 -> pr89()
//            90 -> pr90()
//            91 -> pr91()
//            92 -> pr92()
//            93 -> pr93()
//            94 -> pr94()
//            95 -> pr95()
//            96 -> pr96()
//            97 -> pr97()
//            98 -> pr98()
//            99 -> pr99()
//            100 -> pr100()
//            101 -> pr101()
//            102 -> pr102()
//            103 -> pr103()
//            104 -> pr104()
//            105 -> pr105()
//            106 -> pr106()
//            107 -> pr107()
//            108 -> pr108()
//            109 -> pr109()
//            110 -> pr110()
//            111 -> pr111()
//            112 -> pr112()
//            113 -> pr113()
//            114 -> pr114()
//            115 -> pr115()
//            116 -> pr116()
//            117 -> pr117()
//            118 -> pr118()
//            119 -> pr119()
//            120 -> pr120()
//            121 -> pr121()
//            122 -> pr122()
//            123 -> pr123()
//            124 -> pr124()
//            125 -> pr125()
//            126 -> pr126()
//            127 -> pr127()
//            128 -> pr128()
//            129 -> pr129()
//            130 -> pr130()
//            131 -> pr131()
//            132 -> pr132()
//            133 -> pr133()
//            134 -> pr134()
//            135 -> pr135()
//            136 -> pr136()
//            137 -> pr137()
//            138 -> pr138()
//            139 -> pr139()
//            140 -> pr140()
//            141 -> pr141()
//            142 -> pr142()
//            143 -> pr143()
//            144 -> pr144()
//            145 -> pr145()
//            146 -> pr146()
//            147 -> pr147()
//            148 -> pr148()
//            149 -> pr149()
//            150 -> pr150()
//            151 -> pr151()
//            152 -> pr152()
//            153 -> pr153()
//            154 -> pr154()
//            155 -> pr155()
//            156 -> pr156()
//            157 -> pr157()
//            158 -> pr158()
//            159 -> pr159()
//            160 -> pr160()
//            161 -> pr161()
//            162 -> pr162()
//            163 -> pr163()
//            164 -> pr164()
//            165 -> pr165()
//            166 -> pr166()
//            167 -> pr167()
//            168 -> pr168()
//            169 -> pr169()
//            170 -> pr170()
//            171 -> pr171()
//            172 -> pr172()
//            173 -> pr173()
//            174 -> pr174()
//            175 -> pr175()
//            176 -> pr176()
//            177 -> pr177()
//            178 -> pr178()
//            179 -> pr179()
//            180 -> pr180()
//            181 -> pr181()
//            182 -> pr182()
//            183 -> pr183()
//            184 -> pr184()
//            185 -> pr185()
//            186 -> pr186()
//            187 -> pr187()
//            188 -> pr188()
//            189 -> pr189()
//            190 -> pr190()
//            191 -> pr191()
//            192 -> pr192()
//            193 -> pr193()
//            194 -> pr194()
//            195 -> pr195()
//            196 -> pr196()
//            197 -> pr197()
//            198 -> pr198()
//            199 -> pr199()
//            200 -> pr200()
//
//        }
//    }while (selector!=-1)
    for (x in 3..200)
        println(""+x+"-> cantidad = 0")
//    for (x in 22..200) {
//        println("\tfun pr" + x + "() {")
//        println("\t\tprintln(\"Proyecto" + x + ":\")")
//        println("\t\t//")
//        println("\t}")
//    }


}
    fun pr3() {
        println("Proyecto3:")
        //Definir una variable inmutable con el valor 50 que representa el lado de un
        //cuadrado, en otras dos variables inmutables almacenar la superficie y el
        //perímetro del cuadrado.
        //Mostrar la superficie y el perímetro por la Consola.
        val pr3Lado = 50
        val pr3per = pr3Lado * 4
        val pr3Super = pr3Lado * pr3Lado
        println("El lado es: " + pr3Lado.toString())
        println("El perimetro es igual a la suma de los lados:" + pr3per.toString())
        println("La superficie del cuadrado es igual al lado multiplicado por si mismo" + pr3Super.toString())
    }
    fun pr4(){
        println("Proyecto4:")
        //Definir tres variables inmutables y cargar por asignación los pesos de tres
        //personas con valores Float. Calcular el promedio de pesos de las
        //personas y mostrarlo.
        val pr4peso1 = 123.4f
        val pr4peso2 = 56.7f
        val pr4peso3 = 89.1f
        val media =(pr4peso1+pr4peso2+pr4peso3)/3
        println("El promedio es: "+media.toString())


        }
    fun pr5(){
        val pr5num1 = dos1.text.toString().toInt()
        val pr5num2 = dos2.text.toString().toInt()
        val suma = pr5num1 + pr5num2
        val producto = pr5num1 * pr5num2
        val resul = "El resultado de la suma es:"+suma.toString()+"El producto de la multiplicacion es:"+producto.toString()
        resultadoDos.text = resul
        }

    fun pr6(){
        println("Proyecto6:")
        //Realizar la carga del lado de un cuadrado, mostrar por pantalla el perímetro del
        //mismo (El perímetro de un cuadrado se calcula multiplicando el valor del lado por
        //cuatro)
        println("introduce el lado del cuadrado")
        val pr6num1 = readLine()!!.toInt()
        val pr6per=pr6num1*4
        println("El perimetro es igual a la suma de los lados:"+pr6per.toString())


        }
    fun pr7(){
        println("Proyecto7:")
        //Se debe desarrollar un programa que pida el ingreso del precio de un artículo y
        //la cantidad que lleva el cliente. Mostrar lo que debe abonar el comprador.
        println("introduce el precio del producto")
        val pr7num1 = readLine()!!.toInt()
        println("introduce la cantidad de productos")
        val pr7num2 = readLine()!!.toInt()
        val precioTotal = pr7num1 * pr7num2
        println("El precio total de los productos es:")
        println(precioTotal.toString())

        }
    fun pr8(){
        println("Proyecto8:")
        //Escribir un programa en el cual se ingresen cuatro números enteros,
        //calcular e informar la suma de los dos primeros y el producto del tercero y
        //el cuarto
        println("introduce el primer numero")
        val pr8num1 = readLine()!!.toInt()
        println("introduce el segundo numero")
        val pr8num2 = readLine()!!.toInt()
        println("introduce el tercer numero")
        val pr8num3 = readLine()!!.toInt()
        println("introduce el cuarto numero")
        val pr8num4 = readLine()!!.toInt()
        val pr8suma= pr8num1+pr8num2
        val pr8producto= pr8num3* pr8num4
        println("El resultado de la suma es:")
        println(pr8suma.toString())
        println("El producto de la multiplicacion es:")
        println(pr8producto.toString())

        }
    fun pr9(){
        println("Proyecto9:")
        //Realizar un programa que lea por teclado cuatro valores numéricos
        //enteros e informar su suma y promedio.
        println("introduce el primer numero")
        val pr9num1 = readLine()!!.toInt()
        println("introduce el segundo numero")
        val pr9num2 = readLine()!!.toInt()
        println("introduce el tercer numero")
        val pr9num3 = readLine()!!.toInt()
        println("introduce el cuarto numero")
        val pr9num4 = readLine()!!.toInt()
        val pr9suma= pr9num1+pr9num2+pr9num3+pr9num4
        val pr9promedio = pr9suma/4
        println("El resultado de la suma es:")
        println(pr9suma.toString())
        println("El producto del promedio es:")
        println(pr9promedio.toString())


        }
    fun pr10(){
        println("Proyecto10:")
        //Ingresar el sueldo de una persona, si supera los 3000 pesos mostrar un mensaje
        //en pantalla indicando que debe abonar impuestos.
        println("introduce tu sueldo")
        val pr10num1 = readLine()!!.toDouble()
        if (pr10num1>3000)
            println("paga impuestos")

        }
    fun pr11(){
        println("Proyecto11:")
        //Realizar un programa que solicite ingresar dos números enteros distintos y
        //muestre por pantalla el mayor de ellos (suponemos que el operador del
        //programa ingresa valores distintos, no valida nuestro programa dicha situación)
        println("introduce el primer numero")
        val pr11num1 = readLine()!!.toInt()
        println("introduce el segundo numero")
        val pr11num2 = readLine()!!.toInt()
        println("El numero mas grande es:")
        if (pr11num1<pr11num2)
            println(pr11num2.toString())
        else
            println(pr11num1.toString())


        }
    fun pr12(){
        println("Proyecto12:")
        //Se ingresan por teclado 2 valores enteros. Si el primero es menor al segundo
        //calcular la suma y la resta, luego mostrarlos, sino calcular el producto y la
        //división.
        println("introduce el primer numero")
        val pr12num1 = readLine()!!.toInt()
        println("introduce el segundo numero")
        val pr12num2 = readLine()!!.toInt()
        if (pr12num1<pr12num2) {
            val pr12suma = pr12num1 + pr12num2
            println("El resultado de la suma es:")
            println(pr12suma.toString())
            val pr12resta = pr12num1 - pr12num2
            println("El resultado de la resta es:")
            println(pr12suma.toString())

        }else {
            val pr12producto = pr12num1 * pr12num2
            println("El producto de la multiplicacion es:")
            println(pr12producto.toString())
            val pr12division = pr12num1 / pr12num2
            println("El producto de la multiplicacion es:")
            println(pr12division.toString())
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
    fun pr22() {
        println("Proyecto22:")
        //
    }
    fun pr23() {
        println("Proyecto23:")
        //
    }
    fun pr24() {
        println("Proyecto24:")
        //
    }
    fun pr25() {
        println("Proyecto25:")
        //
    }
    fun pr26() {
        println("Proyecto26:")
        //
    }
    fun pr27() {
        println("Proyecto27:")
        //
    }
    fun pr28() {
        println("Proyecto28:")
        //
    }
    fun pr29() {
        println("Proyecto29:")
        //
    }
    fun pr30() {
        println("Proyecto30:")
        //
    }
    fun pr31() {
        println("Proyecto31:")
        //
    }
    fun pr32() {
        println("Proyecto32:")
        //
    }
    fun pr33() {
        println("Proyecto33:")
        //
    }
    fun pr34() {
        println("Proyecto34:")
        //
    }
    fun pr35() {
        println("Proyecto35:")
        //
    }
    fun pr36() {
        println("Proyecto36:")
        //
    }
    fun pr37() {
        println("Proyecto37:")
        //
    }
    fun pr38() {
        println("Proyecto38:")
        //
    }
    fun pr39() {
        println("Proyecto39:")
        //
    }
    fun pr40() {
        println("Proyecto40:")
        //
    }
    fun pr41() {
        println("Proyecto41:")
        //
    }
    fun pr42() {
        println("Proyecto42:")
        //
    }
    fun pr43() {
        println("Proyecto43:")
        //
    }
    fun pr44() {
        println("Proyecto44:")
        //
    }
    fun pr45() {
        println("Proyecto45:")
        //
    }
    fun pr46() {
        println("Proyecto46:")
        //
    }
    fun pr47() {
        println("Proyecto47:")
        //
    }
    fun pr48() {
        println("Proyecto48:")
        //
    }
    fun pr49() {
        println("Proyecto49:")
        //
    }
    fun pr50() {
        println("Proyecto50:")
        //
    }
    fun pr51() {
        println("Proyecto51:")
        //
    }
    fun pr52() {
        println("Proyecto52:")
        //
    }
    fun pr53() {
        println("Proyecto53:")
        //
    }
    fun pr54() {
        println("Proyecto54:")
        //
    }
    fun pr55() {
        println("Proyecto55:")
        //
    }
    fun pr56() {
        println("Proyecto56:")
        //
    }
    fun pr57() {
        println("Proyecto57:")
        //
    }
    fun pr58() {
        println("Proyecto58:")
        //
    }
    fun pr59() {
        println("Proyecto59:")
        //
    }
    fun pr60() {
        println("Proyecto60:")
        //
    }
    fun pr61() {
        println("Proyecto61:")
        //
    }
    fun pr62() {
        println("Proyecto62:")
        //
    }
    fun pr63() {
        println("Proyecto63:")
        //
    }
    fun pr64() {
        println("Proyecto64:")
        //
    }
    fun pr65() {
        println("Proyecto65:")
        //
    }
    fun pr66() {
        println("Proyecto66:")
        //
    }
    fun pr67() {
        println("Proyecto67:")
        //
    }
    fun pr68() {
        println("Proyecto68:")
        //
    }
    fun pr69() {
        println("Proyecto69:")
        //
    }
    fun pr70() {
        println("Proyecto70:")
        //
    }
    fun pr71() {
        println("Proyecto71:")
        //
    }
    fun pr72() {
        println("Proyecto72:")
        //
    }
    fun pr73() {
        println("Proyecto73:")
        //
    }
    fun pr74() {
        println("Proyecto74:")
        //
    }
    fun pr75() {
        println("Proyecto75:")
        //
    }
    fun pr76() {
        println("Proyecto76:")
        //
    }
    fun pr77() {
        println("Proyecto77:")
        //
    }
    fun pr78() {
        println("Proyecto78:")
        //
    }
    fun pr79() {
        println("Proyecto79:")
        //
    }
    fun pr80() {
        println("Proyecto80:")
        //
    }
    fun pr81() {
        println("Proyecto81:")
        //
    }
    fun pr82() {
        println("Proyecto82:")
        //
    }
    fun pr83() {
        println("Proyecto83:")
        //
    }
    fun pr84() {
        println("Proyecto84:")
        //
    }
    fun pr85() {
        println("Proyecto85:")
        //
    }
    fun pr86() {
        println("Proyecto86:")
        //
    }
    fun pr87() {
        println("Proyecto87:")
        //
    }
    fun pr88() {
        println("Proyecto88:")
        //
    }
    fun pr89() {
        println("Proyecto89:")
        //
    }
    fun pr90() {
        println("Proyecto90:")
        //
    }
    fun pr91() {
        println("Proyecto91:")
        //
    }
    fun pr92() {
        println("Proyecto92:")
        //
    }
    fun pr93() {
        println("Proyecto93:")
        //
    }
    fun pr94() {
        println("Proyecto94:")
        //
    }
    fun pr95() {
        println("Proyecto95:")
        //
    }
    fun pr96() {
        println("Proyecto96:")
        //
    }
    fun pr97() {
        println("Proyecto97:")
        //
    }
    fun pr98() {
        println("Proyecto98:")
        //
    }
    fun pr99() {
        println("Proyecto99:")
        //
    }
    fun pr100() {
        println("Proyecto100:")
        //
    }
    fun pr101() {
        println("Proyecto101:")
        //
    }
    fun pr102() {
        println("Proyecto102:")
        //
    }
    fun pr103() {
        println("Proyecto103:")
        //
    }
    fun pr104() {
        println("Proyecto104:")
        //
    }
    fun pr105() {
        println("Proyecto105:")
        //
    }
    fun pr106() {
        println("Proyecto106:")
        //
    }
    fun pr107() {
        println("Proyecto107:")
        //
    }
    fun pr108() {
        println("Proyecto108:")
        //
    }
    fun pr109() {
        println("Proyecto109:")
        //
    }
    fun pr110() {
        println("Proyecto110:")
        //
    }
    fun pr111() {
        println("Proyecto111:")
        //
    }
    fun pr112() {
        println("Proyecto112:")
        //
    }
    fun pr113() {
        println("Proyecto113:")
        //
    }
    fun pr114() {
        println("Proyecto114:")
        //
    }
    fun pr115() {
        println("Proyecto115:")
        //
    }
    fun pr116() {
        println("Proyecto116:")
        //
    }
    fun pr117() {
        println("Proyecto117:")
        //
    }
    fun pr118() {
        println("Proyecto118:")
        //
    }
    fun pr119() {
        println("Proyecto119:")
        //
    }
    fun pr120() {
        println("Proyecto120:")
        //
    }
    fun pr121() {
        println("Proyecto121:")
        //
    }
    fun pr122() {
        println("Proyecto122:")
        //
    }
    fun pr123() {
        println("Proyecto123:")
        //
    }
    fun pr124() {
        println("Proyecto124:")
        //
    }
    fun pr125() {
        println("Proyecto125:")
        //
    }
    fun pr126() {
        println("Proyecto126:")
        //
    }
    fun pr127() {
        println("Proyecto127:")
        //
    }
    fun pr128() {
        println("Proyecto128:")
        //
    }
    fun pr129() {
        println("Proyecto129:")
        //
    }
    fun pr130() {
        println("Proyecto130:")
        //
    }
    fun pr131() {
        println("Proyecto131:")
        //
    }
    fun pr132() {
        println("Proyecto132:")
        //
    }
    fun pr133() {
        println("Proyecto133:")
        //
    }
    fun pr134() {
        println("Proyecto134:")
        //
    }
    fun pr135() {
        println("Proyecto135:")
        //
    }
    fun pr136() {
        println("Proyecto136:")
        //
    }
    fun pr137() {
        println("Proyecto137:")
        //
    }
    fun pr138() {
        println("Proyecto138:")
        //
    }
    fun pr139() {
        println("Proyecto139:")
        //
    }
    fun pr140() {
        println("Proyecto140:")
        //
    }
    fun pr141() {
        println("Proyecto141:")
        //
    }
    fun pr142() {
        println("Proyecto142:")
        //
    }
    fun pr143() {
        println("Proyecto143:")
        //
    }
    fun pr144() {
        println("Proyecto144:")
        //
    }
    fun pr145() {
        println("Proyecto145:")
        //
    }
    fun pr146() {
        println("Proyecto146:")
        //
    }
    fun pr147() {
        println("Proyecto147:")
        //
    }
    fun pr148() {
        println("Proyecto148:")
        //
    }
    fun pr149() {
        println("Proyecto149:")
        //
    }
    fun pr150() {
        println("Proyecto150:")
        //
    }
    fun pr151() {
        println("Proyecto151:")
        //
    }
    fun pr152() {
        println("Proyecto152:")
        //
    }
    fun pr153() {
        println("Proyecto153:")
        //
    }
    fun pr154() {
        println("Proyecto154:")
        //
    }
    fun pr155() {
        println("Proyecto155:")
        //
    }
    fun pr156() {
        println("Proyecto156:")
        //
    }
    fun pr157() {
        println("Proyecto157:")
        //
    }
    fun pr158() {
        println("Proyecto158:")
        //
    }
    fun pr159() {
        println("Proyecto159:")
        //
    }
    fun pr160() {
        println("Proyecto160:")
        //
    }
    fun pr161() {
        println("Proyecto161:")
        //
    }
    fun pr162() {
        println("Proyecto162:")
        //
    }
    fun pr163() {
        println("Proyecto163:")
        //
    }
    fun pr164() {
        println("Proyecto164:")
        //
    }
    fun pr165() {
        println("Proyecto165:")
        //
    }
    fun pr166() {
        println("Proyecto166:")
        //
    }
    fun pr167() {
        println("Proyecto167:")
        //
    }
    fun pr168() {
        println("Proyecto168:")
        //
    }
    fun pr169() {
        println("Proyecto169:")
        //
    }
    fun pr170() {
        println("Proyecto170:")
        //
    }
    fun pr171() {
        println("Proyecto171:")
        //
    }
    fun pr172() {
        println("Proyecto172:")
        //
    }
    fun pr173() {
        println("Proyecto173:")
        //
    }
    fun pr174() {
        println("Proyecto174:")
        //
    }
    fun pr175() {
        println("Proyecto175:")
        //
    }
    fun pr176() {
        println("Proyecto176:")
        //
    }
    fun pr177() {
        println("Proyecto177:")
        //
    }
    fun pr178() {
        println("Proyecto178:")
        //
    }
    fun pr179() {
        println("Proyecto179:")
        //
    }
    fun pr180() {
        println("Proyecto180:")
        //
    }
    fun pr181() {
        println("Proyecto181:")
        //
    }
    fun pr182() {
        println("Proyecto182:")
        //
    }
    fun pr183() {
        println("Proyecto183:")
        //
    }
    fun pr184() {
        println("Proyecto184:")
        //
    }
    fun pr185() {
        println("Proyecto185:")
        //
    }
    fun pr186() {
        println("Proyecto186:")
        //
    }
    fun pr187() {
        println("Proyecto187:")
        //
    }
    fun pr188() {
        println("Proyecto188:")
        //
    }
    fun pr189() {
        println("Proyecto189:")
        //
    }
    fun pr190() {
        println("Proyecto190:")
        //
    }
    fun pr191() {
        println("Proyecto191:")
        //
    }
    fun pr192() {
        println("Proyecto192:")
        //
    }
    fun pr193() {
        println("Proyecto193:")
        //
    }
    fun pr194() {
        println("Proyecto194:")
        //
    }
    fun pr195() {
        println("Proyecto195:")
        //
    }
    fun pr196() {
        println("Proyecto196:")
        //
    }
    fun pr197() {
        println("Proyecto197:")
        //
    }
    fun pr198() {
        println("Proyecto198:")
        //
    }
    fun pr199() {
        println("Proyecto199:")
        //
    }
    fun pr200() {
        println("Proyecto200:")
        //
    }