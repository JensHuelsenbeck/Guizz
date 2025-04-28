package com.example.guizz.ui.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.guizz.ui.components.AnswerButton
import com.example.guizz.ui.viewmodel.QuizViewModel

@Composable
fun QuizScreen(
    viewModel: QuizViewModel = viewModel(), modifier: Modifier = Modifier

) {

    val easyQuestion = viewModel.fetchQuestion()
    var clickedRightAnswer by remember { mutableStateOf(false) }

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Card {
            Text(
                text = "",
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(20.dp)
                    .width(350.dp)
            )
        }
        Spacer(Modifier.height(20.dp))
        LazyColumn {
            items(easyQuestion.value.answers) { answer ->
                AnswerButton(
                    answer = answer, onClick = {
                        if (answer.isRight) {
                            viewModel.fetchQuestion()
                            clickedRightAnswer = true
                        } else {

                        }
                    })

            }
        }
    }
}

@Preview(showBackground = true, heightDp = 720, widthDp = 400)
@Composable
private fun QuizScreenPreview() {
    QuizScreen()
}