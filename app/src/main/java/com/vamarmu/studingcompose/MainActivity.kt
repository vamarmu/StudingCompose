package com.vamarmu.studingcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import com.vamarmu.studingcompose.ui.theme.StudingComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StudingComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android",Modifier.background(Color.Green))
                    Greeting("PAPAPAPAPP")
                    Greeting("weeeeeeeeee")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String,modifier: Modifier=Modifier) {

    Text(text = "$name!",modifier = modifier)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Column(
        modifier = Modifier
            .border(Dp(2f), Color.Blue)
            .fillMaxSize()
            .padding(Dp(5f)),
    ) {
        Row(

            modifier = Modifier
                .border(Dp(2f), Color.Blue)
                .width(Dp(200f))
                .height(Dp(300f))
                .background(Color.Yellow)
                .weight(1f)
        ) {
            Greeting("Android",
                Modifier
                    .background(Color.Green)
                    .fillMaxWidth())
            Greeting("PAPAPAPAPPA",Modifier.fillMaxWidth())
            Greeting("weeeeeeeeee")
        }
        Column(
            verticalArrangement= Arrangement.SpaceEvenly,
            horizontalAlignment= Alignment.CenterHorizontally,
            modifier = Modifier
            .border(Dp(2f), Color.Blue)
            .width(Dp(100f))
            .height(Dp(100f))
                .background(Color.Cyan)
                .weight(3f)
        ) {
            Greeting("Android",
                Modifier
                    .background(Color.Green)
                    .fillMaxWidth())
            Greeting("PAPAPAPAPPA",Modifier.fillMaxWidth())
            Greeting("weeeeeeeeee")
        }

    }
}