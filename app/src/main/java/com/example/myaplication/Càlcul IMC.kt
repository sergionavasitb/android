package com.example.myaplication

import android.icu.util.Calendar
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.sp

@Composable
fun MainIMC(){
    var nom:String by remember { mutableStateOf("") }
    var any:String by remember { mutableStateOf("") }
    var alcada:String by remember { mutableStateOf("") }
    var pes:String by remember { mutableStateOf("") }
    var showtext: Boolean by remember { mutableStateOf(false) }
    var resultatEdat by remember { mutableStateOf("") }
    var resultatIMC by remember { mutableStateOf("") }
    Column (Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
        TextField(
            value = nom, onValueChange = {nom = it},
            label = { Text("Posa el teu nom:") }
        )
        TextField(
            value = any, onValueChange = {any = it},
            label = { Text("Any de naixement:")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        TextField(
            value = alcada, onValueChange = {alcada = it},
            label = { Text("Posa la teva alçada: ")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        TextField(
            value = pes, onValueChange = {pes = it},
            label = { Text("Posa el teu pes: ")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Button(onClick= { showtext = true}){

            Text("Calcula")
        }
        Spacer(Modifier.fillMaxSize(0.1f))
        calEdat(any)
        calculIMC(alcada, pes)
        if (showtext) {
            Text("$nom, $resultatEdat, $resultatIMC ", fontWeight = FontWeight.Bold, fontSize = 24.sp)
        }
    }

}

fun calculIMC(alcada:String,pes:String){
    val alcadaValor= alcada.toInt()
    val pesValor= pes.toInt()
    val resultadoIMC= pesValor/alcadaValor+alcadaValor
    val imc=resultadoIMC.toFloat()
    when{
        imc<18.5->println("Pes Insufucuent")
        imc in 18.5..24.9->println("El seu pes es normal")
        imc in 25.0..50.0-> println("Voste te sobrepes")
        imc>50.0-> println("Voste te obesita")
    }


}

fun calEdat(any:String,){
    val anyActual= Calendar.getInstance().get(Calendar.YEAR)
    val anyNeix=any.toInt()
    val resultatEdat = anyActual-anyNeix
    println("$resultatEdat")





}