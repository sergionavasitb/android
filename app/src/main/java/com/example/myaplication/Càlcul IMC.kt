package com.example.myaplication

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
            calEdat()
            Text("Calcula")
        }
        Spacer(Modifier.fillMaxSize(0.1f))
        if (showtext) {
            Text("$nom", fontWeight = FontWeight.Bold, fontSize = 24.sp)
        }
    }

}

fun calculIMC(){


}

fun calEdat(any:String,){
    val anyActual: Int
    val anyNeix: Int


}