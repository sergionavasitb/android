package com.example.myaplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.myaplication.ui.theme.MyAplicationTheme

class Main : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyAplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    /*Act4(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )*/
                    Act1(modifier = Modifier.padding(innerPadding)
                    )

                }
            }
        }
    }
}
@Composable
fun Act1(modifier: Modifier){}
//eejrcico4
@Composable
fun Act4(name: String, modifier: Modifier = Modifier) {
    ConstraintLayout(modifier.fillMaxSize()) {

        val (boxRed, boxYellow, boxGreen, boxCyan, boxMagenta) = createRefs()
        Box(modifier = Modifier
            .size(120.dp)
            .background(Color.Red)
            .constrainAs(boxRed) {
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            })
        Box(modifier = Modifier
            .size(120.dp)
            .background(Color.Yellow)
            .constrainAs(boxYellow) {
                bottom.linkTo(boxRed.top)
                end.linkTo(boxRed.start)
            })
        Box(modifier = Modifier
            .size(120.dp)
            .background(Color.Green)
            .constrainAs(boxGreen) {
                top.linkTo(boxRed.bottom)
                start.linkTo(boxRed.end)
            })
        Box(modifier = Modifier
            .size(120.dp)
            .background(Color.Cyan)
            .constrainAs(boxCyan) {
                top.linkTo(boxRed.bottom)
                end.linkTo(boxRed.start)

            })
        Box(modifier = Modifier
            .size(120.dp)
            .background(Color.Magenta)
            .constrainAs(boxMagenta) {
                bottom.linkTo(boxRed.top)
                start.linkTo(boxRed.end)
            })

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Act4Preview() {
    MyAplicationTheme {
        Act1(modifier = Modifier)
       // Act4("Android")
    }
}
