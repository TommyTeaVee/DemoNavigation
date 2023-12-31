package com.lixoten.demonavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.lixoten.demonavigation.ui.theme.DemoNavigationTheme

enum class AppDestinations(val title: String) {
    Start(title = "Start # Getting Started"),
    ScreenTwo(title = "# Introduction"),
    ScreenThree(title = "# Onboarding "),
    ScreenFour(title = "# Description"),
    ScreenFive(title= "# Conclusion"),
    Last(title = "Last # Final")
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DemoNavigationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    DemoApp()
                }
            }
        }
    }
}

@Composable
fun DemoApp() {
    DemoScreens()
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DemoNavigationTheme {
        DemoApp()
    }
}