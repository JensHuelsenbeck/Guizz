package com.example.guizz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.guizz.ui.AppStart
import com.example.guizz.ui.theme.GuizzTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GuizzTheme {
                AppStart()
            }
        }
    }
}


/*
EndScreen -> Beleidigt Button, Button zum HomeScreen
BeleidigtScreen -> BUtton zum HomeScreen
Farben/Theme -> Einfärben der AnswerButton -> Animation (alphaAnimation)
50:50 Joker
 */