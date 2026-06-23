package com.example.june23

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.example.june23.ui.theme.June23Theme
import androidx.compose.foundation.layout.Column


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            June23Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding) // Apply Scaffold padding to the container
                    ) {
                        greeting(name = "Amrit")
                        paragraph()
                    }
                }
            }
        }
    }
}

@Composable
fun greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
@Composable
fun paragraph(){
    Text(
        text = "lorem45",
        color = Color.Blue,
        fontSize = 20.sp
    )
}
@Preview(showBackground = true)
@Composable
fun greetingPreview() {
    June23Theme {
        greeting("Android")
    }
}