package com.example.intento2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import com.example.intento2.*
import kotlinx.android.synthetic.main.activity_dos_inputs.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //preguntas a hacer,
        //el print, como lo quiere
        // el input tiene que ser double¿
        //hay algo mas eficiente que los megaswitch?
        buttonMain.setOnClickListener {
            val selector = selector.text.toString().toInt()
            val cuantos=2//meter el when enrome aqui, quizas en funcion
            pantallaInputs(cuantos)
            lanzarProyecto(selector)
        }







    }

    private fun pantallaInputs(cuantos:Int){
        val proyecto = "pr"+cuantos
        //hacer los 5 posibles como ifs
        //arriba usar wl mega switch
        //aberiguar como extraer los valores de las pantalas exxtra
        var i = Intent(this,MainActivity::class.java)
        when(cuantos){
            1 ->  i = Intent(this,unInput::class.java)
            2 ->  i = Intent(this,dosInputs::class.java)
            3 ->  i = Intent(this,tresInputs::class.java)
            4 -> i = Intent(this,cuatroInputs::class.java)
            5 -> i = Intent(this,cincoInputs::class.java)
        }
        startActivity(i)
    }
    private fun lanzarProyecto(prx:Int){
        when (prx) {
            3 -> pr3()
            4 -> pr4()
            5 -> pr5()
            6 -> pr6()
            7 -> pr7()
            8 -> pr8()
            9 -> pr9()
            10 -> pr10()
            11 -> pr11()
            12 -> pr12()
            13 -> pr13()
            14 -> pr14()
            15 -> pr15()
            16 -> pr16()
            17 -> pr17()
            18 -> pr18()
            19 -> pr19()
            20 -> pr20()
            21 -> pr21()
            22 -> pr22()
            23 -> pr23()
            24 -> pr24()
            25 -> pr25()
            26 -> pr26()
            27 -> pr27()
            28 -> pr28()
            29 -> pr29()
            30 -> pr30()
            31 -> pr31()
            32 -> pr32()
            33 -> pr33()
            34 -> pr34()
            35 -> pr35()
            36 -> pr36()
            37 -> pr37()
            38 -> pr38()
            39 -> pr39()
            40 -> pr40()
            41 -> pr41()
            42 -> pr42()
            43 -> pr43()
            44 -> pr44()
            45 -> pr45()
            46 -> pr46()
            47 -> pr47()
            48 -> pr48()
            49 -> pr49()
            50 -> pr50()
            51 -> pr51()
            52 -> pr52()
            53 -> pr53()
            54 -> pr54()
            55 -> pr55()
            56 -> pr56()
            57 -> pr57()
            58 -> pr58()
            59 -> pr59()
            60 -> pr60()
            61 -> pr61()
            62 -> pr62()
            63 -> pr63()
            64 -> pr64()
            65 -> pr65()
            66 -> pr66()
            67 -> pr67()
            68 -> pr68()
            69 -> pr69()
            70 -> pr70()
            71 -> pr71()
            72 -> pr72()
            73 -> pr73()
            74 -> pr74()
            75 -> pr75()
            76 -> pr76()
            77 -> pr77()
            78 -> pr78()
            79 -> pr79()
            80 -> pr80()
            81 -> pr81()
            82 -> pr82()
            83 -> pr83()
            84 -> pr84()
            85 -> pr85()
            86 -> pr86()
            87 -> pr87()
            88 -> pr88()
            89 -> pr89()
            90 -> pr90()
            91 -> pr91()
            92 -> pr92()
            93 -> pr93()
            94 -> pr94()
            95 -> pr95()
            96 -> pr96()
            97 -> pr97()
            98 -> pr98()
            99 -> pr99()
            100 -> pr100()
            101 -> pr101()
            102 -> pr102()
            103 -> pr103()
            104 -> pr104()
            105 -> pr105()
            106 -> pr106()
            107 -> pr107()
            108 -> pr108()
            109 -> pr109()
            110 -> pr110()
            111 -> pr111()
            112 -> pr112()
            113 -> pr113()
            114 -> pr114()
            115 -> pr115()
            116 -> pr116()
            117 -> pr117()
            118 -> pr118()
            119 -> pr119()
            120 -> pr120()
            121 -> pr121()
            122 -> pr122()
            123 -> pr123()
            124 -> pr124()
            125 -> pr125()
            126 -> pr126()
            127 -> pr127()
            128 -> pr128()
            129 -> pr129()
            130 -> pr130()
            131 -> pr131()
            132 -> pr132()
            133 -> pr133()
            134 -> pr134()
            135 -> pr135()
            136 -> pr136()
            137 -> pr137()
            138 -> pr138()
            139 -> pr139()
            140 -> pr140()
            141 -> pr141()
            142 -> pr142()
            143 -> pr143()
            144 -> pr144()
            145 -> pr145()
            146 -> pr146()
            147 -> pr147()
            148 -> pr148()
            149 -> pr149()
            150 -> pr150()
            151 -> pr151()
            152 -> pr152()
            153 -> pr153()
            154 -> pr154()
            155 -> pr155()
            156 -> pr156()
            157 -> pr157()
            158 -> pr158()
            159 -> pr159()
            160 -> pr160()
            161 -> pr161()
            162 -> pr162()
            163 -> pr163()
            164 -> pr164()
            165 -> pr165()
            166 -> pr166()
            167 -> pr167()
            168 -> pr168()
            169 -> pr169()
            170 -> pr170()
            171 -> pr171()
            172 -> pr172()
            173 -> pr173()
            174 -> pr174()
            175 -> pr175()
            176 -> pr176()
            177 -> pr177()
            178 -> pr178()
            179 -> pr179()
            180 -> pr180()
            181 -> pr181()
            182 -> pr182()
            183 -> pr183()
            184 -> pr184()
            185 -> pr185()
            186 -> pr186()
            187 -> pr187()
            188 -> pr188()
            189 -> pr189()
            190 -> pr190()
            191 -> pr191()
            192 -> pr192()
            193 -> pr193()
            194 -> pr194()
            195 -> pr195()
            196 -> pr196()
            197 -> pr197()
            198 -> pr198()
            199 -> pr199()
            200 -> pr200()

        }
    }
    private fun cuantosInputs(prx:Int) : Int{
        var cantidad=0
        when(prx){
            3-> cantidad = 0
            4-> cantidad = 0
            5-> cantidad = 0
            6-> cantidad = 0
            7-> cantidad = 0
            8-> cantidad = 0
            9-> cantidad = 0
            10-> cantidad = 0
            11-> cantidad = 0
            12-> cantidad = 0
            13-> cantidad = 0
            14-> cantidad = 0
            15-> cantidad = 0
            16-> cantidad = 0
            17-> cantidad = 0
            18-> cantidad = 0
            19-> cantidad = 0
            20-> cantidad = 0
            21-> cantidad = 0
            22-> cantidad = 0
            23-> cantidad = 0
            24-> cantidad = 0
            25-> cantidad = 0
            26-> cantidad = 0
            27-> cantidad = 0
            28-> cantidad = 0
            29-> cantidad = 0
            30-> cantidad = 0
            31-> cantidad = 0
            32-> cantidad = 0
            33-> cantidad = 0
            34-> cantidad = 0
            35-> cantidad = 0
            36-> cantidad = 0
            37-> cantidad = 0
            38-> cantidad = 0
            39-> cantidad = 0
            40-> cantidad = 0
            41-> cantidad = 0
            42-> cantidad = 0
            43-> cantidad = 0
            44-> cantidad = 0
            45-> cantidad = 0
            46-> cantidad = 0
            47-> cantidad = 0
            48-> cantidad = 0
            49-> cantidad = 0
            50-> cantidad = 0
            51-> cantidad = 0
            52-> cantidad = 0
            53-> cantidad = 0
            54-> cantidad = 0
            55-> cantidad = 0
            56-> cantidad = 0
            57-> cantidad = 0
            58-> cantidad = 0
            59-> cantidad = 0
            60-> cantidad = 0
            61-> cantidad = 0
            62-> cantidad = 0
            63-> cantidad = 0
            64-> cantidad = 0
            65-> cantidad = 0
            66-> cantidad = 0
            67-> cantidad = 0
            68-> cantidad = 0
            69-> cantidad = 0
            70-> cantidad = 0
            71-> cantidad = 0
            72-> cantidad = 0
            73-> cantidad = 0
            74-> cantidad = 0
            75-> cantidad = 0
            76-> cantidad = 0
            77-> cantidad = 0
            78-> cantidad = 0
            79-> cantidad = 0
            80-> cantidad = 0
            81-> cantidad = 0
            82-> cantidad = 0
            83-> cantidad = 0
            84-> cantidad = 0
            85-> cantidad = 0
            86-> cantidad = 0
            87-> cantidad = 0
            88-> cantidad = 0
            89-> cantidad = 0
            90-> cantidad = 0
            91-> cantidad = 0
            92-> cantidad = 0
            93-> cantidad = 0
            94-> cantidad = 0
            95-> cantidad = 0
            96-> cantidad = 0
            97-> cantidad = 0
            98-> cantidad = 0
            99-> cantidad = 0
            100-> cantidad = 0
            101-> cantidad = 0
            102-> cantidad = 0
            103-> cantidad = 0
            104-> cantidad = 0
            105-> cantidad = 0
            106-> cantidad = 0
            107-> cantidad = 0
            108-> cantidad = 0
            109-> cantidad = 0
            110-> cantidad = 0
            111-> cantidad = 0
            112-> cantidad = 0
            113-> cantidad = 0
            114-> cantidad = 0
            115-> cantidad = 0
            116-> cantidad = 0
            117-> cantidad = 0
            118-> cantidad = 0
            119-> cantidad = 0
            120-> cantidad = 0
            121-> cantidad = 0
            122-> cantidad = 0
            123-> cantidad = 0
            124-> cantidad = 0
            125-> cantidad = 0
            126-> cantidad = 0
            127-> cantidad = 0
            128-> cantidad = 0
            129-> cantidad = 0
            130-> cantidad = 0
            131-> cantidad = 0
            132-> cantidad = 0
            133-> cantidad = 0
            134-> cantidad = 0
            135-> cantidad = 0
            136-> cantidad = 0
            137-> cantidad = 0
            138-> cantidad = 0
            139-> cantidad = 0
            140-> cantidad = 0
            141-> cantidad = 0
            142-> cantidad = 0
            143-> cantidad = 0
            144-> cantidad = 0
            145-> cantidad = 0
            146-> cantidad = 0
            147-> cantidad = 0
            148-> cantidad = 0
            149-> cantidad = 0
            150-> cantidad = 0
            151-> cantidad = 0
            152-> cantidad = 0
            153-> cantidad = 0
            154-> cantidad = 0
            155-> cantidad = 0
            156-> cantidad = 0
            157-> cantidad = 0
            158-> cantidad = 0
            159-> cantidad = 0
            160-> cantidad = 0
            161-> cantidad = 0
            162-> cantidad = 0
            163-> cantidad = 0
            164-> cantidad = 0
            165-> cantidad = 0
            166-> cantidad = 0
            167-> cantidad = 0
            168-> cantidad = 0
            169-> cantidad = 0
            170-> cantidad = 0
            171-> cantidad = 0
            172-> cantidad = 0
            173-> cantidad = 0
            174-> cantidad = 0
            175-> cantidad = 0
            176-> cantidad = 0
            177-> cantidad = 0
            178-> cantidad = 0
            179-> cantidad = 0
            180-> cantidad = 0
            181-> cantidad = 0
            182-> cantidad = 0
            183-> cantidad = 0
            184-> cantidad = 0
            185-> cantidad = 0
            186-> cantidad = 0
            187-> cantidad = 0
            188-> cantidad = 0
            189-> cantidad = 0
            190-> cantidad = 0
            191-> cantidad = 0
            192-> cantidad = 0
            193-> cantidad = 0
            194-> cantidad = 0
            195-> cantidad = 0
            196-> cantidad = 0
            197-> cantidad = 0
            198-> cantidad = 0
            199-> cantidad = 0
            200-> cantidad = 0
        }
        return cantidad
    }
    fun pr5(){
        println("Proyecto5:")
        //Realizar la carga de dos números enteros por teclado e imprimir su suma y su
        //producto.
        val pr5num1 = dos1.text.toString().toInt()
        val pr5num2 = dos2.text.toString().toInt()
        val suma = pr5num1 + pr5num2
        val producto = pr5num1 * pr5num2
        println("El resultado de la suma es:")
        println(suma.toString())
        println("El producto de la multiplicacion es:")
        println(producto.toString())

    }

}
