package com.example.bottombar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.bottombar.ui.theme.BottomBarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomBarTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                  BottomBarr()
                }
            }
        }
    }
}

@Composable
fun BottomBarr()
{
    Scaffold(

        bottomBar = {

            BottomAppBar(
                contentPadding = PaddingValues(start = 20.dp, end= 20.dp) ,
                backgroundColor = Color.White,
                elevation = 20.dp
            )
            {

                Image(painterResource(id = R.drawable.smile),
                    contentDescription = "smiling emoji" ,

                    modifier= Modifier.size(24.dp),
                colorFilter = ColorFilter.tint(Color.Black))

                Spacer(modifier = Modifier.height(60.dp))

                Image(painterResource(id = R.drawable.user),
                    contentDescription = "user" ,

                    modifier= Modifier.size(20.dp))

            }
        }
    )
    {

    }
}

