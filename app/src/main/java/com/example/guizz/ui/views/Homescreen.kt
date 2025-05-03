package com.example.guizz.ui.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.guizz.R
import com.example.guizz.ui.viewmodel.QuizViewModel

@Composable
fun HomeScreen(
    onNavigationToQuizScreen: () -> Unit,
    quizViewModel: QuizViewModel,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {
        Column(
            modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                painter = painterResource(if (isSystemInDarkTheme()) R.drawable.welcome_black else R.drawable.welcome_white),
                contentDescription = "Guenther Lauch",
                modifier = Modifier
                    .fillMaxWidth()
                    .size(150.dp)
            )
            Spacer(Modifier.height(25.dp))
            Image(
                painter = painterResource(if (isSystemInDarkTheme()) R.drawable.guenterlauch_black else R.drawable.guenterlauch_white),
                contentDescription = "Guenther Lauch",
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .size(325.dp)
            )

            Image(
                painter = painterResource(if (isSystemInDarkTheme()) R.drawable.presented_black else R.drawable.presented_white),
                contentDescription = "Guenther Lauch",
                modifier = Modifier
                    .fillMaxWidth()
                    .size(100.dp)
            )
            Button(
                onClick = {
                    onNavigationToQuizScreen()
                    quizViewModel.endLauchGame()
                    quizViewModel.fetchQuestion()
                },
                modifier = modifier.padding(top = 90.dp)
            ) {
                Text(
                    text = "Spielen",
                    color = Color.White,
                    style = MaterialTheme.typography.titleLarge,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    modifier = modifier
                        .padding(8.dp)
                        .width(150.dp)
                )
            }
        }
        Image(
            painter = painterResource(R.drawable.tutorial),
            contentDescription = "Guenther Lauch",
            modifier = Modifier
                .size(180.dp)
                .offset(x = 240.dp, y = 180.dp)
        )
    }
}

