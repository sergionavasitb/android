package com.example.myaplication

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.unit.sp

@Composable

fun Body(){
    var name:String by remember {mutableStateOf("")}
    var showtext: Boolean by remember { mutableStateOf(false) }
    Column (Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
        TextField(value = name, onValueChange = {name = it}, label = {Text("Enter your name")})
        Button(onClick= { showtext = true}){
            Text("Di hola")
        }
        Spacer(Modifier.fillMaxSize(0.1f))
        if (showtext) {
            Text("Hola $name", fontWeight = FontWeight.Bold, fontSize = 24.sp)
        }
    }

}