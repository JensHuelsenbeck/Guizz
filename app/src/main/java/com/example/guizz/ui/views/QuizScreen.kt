package com.example.guizz.ui.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.guizz.ui.components.AnswerList
import com.example.guizz.ui.model.Answer
import com.example.guizz.ui.viewmodel.QuizViewModel

@Composable
fun QuizScreen(
    modifier: Modifier = Modifier,
    quizViewModel: QuizViewModel,
    onNavigateToEndScreen: (Answer) -> Unit

) {
    val question by quizViewModel.tempQuestion.collectAsState()

    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize()) {
        Spacer(Modifier.height(50.dp))
        Card {
            Text(
                text = question.text,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(20.dp)
                    .width(350.dp)

            )
        }
        Spacer(Modifier.height(50.dp))
        AnswerList(
            question = question,
            onNavigateToEndScreen =  onNavigateToEndScreen ,
            quizViewModel = quizViewModel
        )
    }
}



