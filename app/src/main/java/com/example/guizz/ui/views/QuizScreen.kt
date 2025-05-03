package com.example.guizz.ui.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.guizz.ui.components.AnswerList
import com.example.guizz.ui.model.Answer
import com.example.guizz.ui.viewmodel.QuizViewModel

@Composable
fun QuizScreen(
    quizViewModel: QuizViewModel,
    onNavigateToEndScreen: (Answer) -> Unit
) {
    val question by quizViewModel.tempQuestion.collectAsState()
    var activateFiftyFifty by remember { mutableStateOf(false) }


    LaunchedEffect(question) {
        activateFiftyFifty = false
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize()
    ) {
        Spacer(Modifier.height(50.dp))
        Card(
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer
            )
        ) {
            Text(
                text = question.text,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(20.dp)
                    .width(350.dp),
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.SemiBold
            )
        }

        Spacer(Modifier.height(50.dp))

        AnswerList(
            question = question,
            onNavigateToEndScreen = onNavigateToEndScreen,
            quizViewModel = quizViewModel,
            activateFiftyFifty = activateFiftyFifty
        )
        Spacer(Modifier.height(50.dp))
        if (!quizViewModel.wasJokerUsed) {
            Button(
                onClick = {
                    activateFiftyFifty = true
                    quizViewModel.wasJokerUsed = true
                },
                modifier = Modifier.padding(top = 90.dp)
            ) {
                Text(
                    text = "50:50",
                    color = Color.White,
                    style = MaterialTheme.typography.titleLarge,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(8.dp)
                        .width(150.dp)
                )
            }
        }
    }
}


