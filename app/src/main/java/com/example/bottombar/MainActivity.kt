package com.example.bottombar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.bottombar.ui.theme.BottomBarTheme
import kotlin.math.absoluteValue

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
                  BottomBarScaffold()
                }
            }
        }
    }
}

@Composable
fun BottomBarScaffold()
{
    Scaffold(
       floatingActionButton= { FloatingActionButton(onClick = { /*TODO*/ }) {
       }
       },
        floatingActionButtonPosition = FabPosition.Center,
        bottomBar = { BottomNav()}
    )
    {}

}

@Composable
fun BottomNav()
{
    val chosenIndex by remember {mutableStateOf(0)}

    BottomNavigation(elevation = 20.dp,
            backgroundColor = Color.White)
    {
        BottomNavigationItem(icon = {Image(painterResource(id = R.drawable.smile),
            contentDescription = "smiling emoji" ,
            modifier= Modifier.size(24.dp),
            colorFilter = ColorFilter.tint(Color.Black))},
        label= {Text( "smile")},
        selected = (chosenIndex.absoluteValue==0),
            onClick = {(chosenIndex.absoluteValue==0)},
        )

        BottomNavigationItem(icon={
            Image(painterResource(id = R.drawable.user),
                contentDescription = "user" ,

                modifier= Modifier.size(20.dp))
        },
            label = {Text(text="profile")},
            selected = (chosenIndex.absoluteValue==1),
            onClick = {(chosenIndex.absoluteValue == 1) }
        )

        }
}
