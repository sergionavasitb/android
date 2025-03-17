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
fun calculaPropina() {
    var preuMenu: String by remember { mutableStateOf("") }
    var propina: String by remember { mutableStateOf("") }
    var resultado: Float? by remember { mutableStateOf(null) }
    var showText: Boolean by remember { mutableStateOf(false) }

    Column(
        Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        TextField(
            value = preuMenu,
            onValueChange = { preuMenu = it },
            label = { Text(text = "Preu del menu") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        TextField(
            value = propina,
            onValueChange = { propina = it },
            label = { Text(text = "Propina%") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Button(onClick = {
            val preuValor = preuMenu.toFloatOrNull() ?: 0f
            val propinaValor = propina.toFloatOrNull() ?: 0f
            resultado = (preuValor * propinaValor / 100)
            showText = true
        }) {
            Text("Calcular")
        }

        Spacer(Modifier.fillMaxSize(0.1f))

        if (showText) {
            Text("Propina: ${resultado ?: 0f}€")
        }
    }
}
