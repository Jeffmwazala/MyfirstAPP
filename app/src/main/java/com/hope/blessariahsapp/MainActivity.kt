package com.hope.blessariahsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.magnifier
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hope.blessariahsapp.ui.theme.BlessariahsAppTheme

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
                    finalCard()

                    }

                }
            }
        }
    }

    @Composable
    fun finalCard() {
        Column() {
            firstColumn("Hon.", "Jeff Mwazala")
            secondColumn("0715557051", "jeffmwazala@gmail.com", "@Jeffmwazala")
        }
    }

    @Composable
    fun firstColumn(title: String, name: kotlin.String) {
        Column() {
            mainImage()
            Text(text = title)
            Text(text = name)
        }
    }

    @Composable
    fun secondColumn(phone: String, email: String, twiter: String) {
        Column() {
            Row() {
                firstImage()
                Text(text = phone, color= Color.Cyan)
            }
            Row() {
                secondImage()
                Text(text = email, color= Color.Cyan)
            }
            Row() {
                thirdImage()
                Text(text = twiter)
            }
        }
    }

    @Composable
    fun mainImage() {
        val image = painterResource(id = R.drawable.rhino)
        Image(painter = image, contentDescription = null)
    }

    @Composable
    fun firstImage() {
        val image = painterResource(id = R.drawable.phone )
        Image(painter = image, contentDescription = null ,modifier = Modifier.height(30.dp) )
    }

    @Composable
    fun secondImage() {
        val image = painterResource(id = R.drawable.email)
        Image(painter = image, contentDescription = null ,modifier = Modifier.height(30.dp))
    }

    @Composable
    fun thirdImage() {
        val image = painterResource(id = R.drawable.twiter)
        Image(painter = image, contentDescription = null, modifier = Modifier.height(30.dp))
    }

@Composable
@Preview
fun imagePreview(){
    finalCard()
}




