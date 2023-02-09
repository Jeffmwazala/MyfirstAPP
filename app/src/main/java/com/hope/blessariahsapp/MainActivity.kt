package com.hope.blessariahsapp

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeCompilerApi
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.hope.blessariahsapp.ui.theme.BlessariahsAppTheme
import kotlin.String as String1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BlessariahsAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                   Jeff(message = "This is the day Enjoy", from ="from Jeff" )
                    }

                  }
                }
            }
        }
@Composable
fun Jeff(message:kotlin.String ,from:kotlin.String) {
    val image = painterResource(id= R.drawable.rhino)

Box() {
    Image(image, null, contentScale = ContentScale.FillHeight)
Column(
    modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally
) {
    Column() {
        Text(text = message, fontSize = 20.sp, color = Color.Red)
        Text(text = from, fontSize = 15.sp, color = Color.Black)
    }
}

}

}
@Preview
@Composable
fun Jeffpreview()
{
    Jeff(message="This is the day Enjoy", from= " from Jeff" )
}



