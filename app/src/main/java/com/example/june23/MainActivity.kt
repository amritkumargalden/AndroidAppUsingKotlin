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
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            June23Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) 
                { innerPadding ->
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding) // Apply Scaffold padding to the container
                    ) {

                        Greeting(name = "Amrit")
//                        OnlineImage()
                        Paragraph()
                        Spacer(modifier = Modifier.height(16.dp))

                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
@Composable
fun Paragraph(){
    Text(
        text = "Lorem ipsum dolor sit amet>..<",
        color = Color.Blue,
        fontSize = 20.sp
    )
    Image(
        // 1. Point to your image file in the drawable directory
        painter = painterResource(id = R.drawable.luffy), 
        
        // 2. Set an accessibility description for screen readers (or null if decorative)
        contentDescription = "Luffy with wide arms", 
        
        // 3. Control sizing using standard Modifiers
        modifier = Modifier.size(200.dp), 
        
        // 4. Scale behavior (Crop, Fit, FillBounds etc.)
        contentScale = ContentScale.Crop


    )
    Text(
        text = "Its Monkey D. Luffy\n\tWarewa kaijou ko ni naru otoko da"
    )
    Text(
        text = "She said, \"Today is Tuesday\"." + 
                "Name: \"Amrit\"\n" +
                        "\t\t\t\t\t\tHello BIT studenst"
    )
}

@Composable
fun OnlineImage(){
    AsyncImage(
        model = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/Nao_Robot_%28Robocup_2016%29.jpg/960px-Nao_Robot_%28Robocup_2016%29.jpg", contentDescription = "Robot profile photo"
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    June23Theme {
        Greeting("Android")
    }
}