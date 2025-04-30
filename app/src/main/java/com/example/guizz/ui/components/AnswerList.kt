package com.example.guizz.ui.components

import android.util.Log
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.guizz.ui.model.Answer
import com.example.guizz.ui.model.Question
import com.example.guizz.ui.viewmodel.QuizViewModel


@Composable
fun AnswerList(
    question: Question,
    onNavigateToEndScreen: (Answer) -> Unit,
    quizViewModel: QuizViewModel,
    modifier: Modifier = Modifier,
) {

    var clickedAnswer by remember { mutableStateOf(false) }
    var showPopUp by remember { mutableStateOf(false) }
    var tempAnswer by remember { mutableStateOf<Answer?>(null) }

    LazyColumn {
        items(question.answers) { answer ->
            AnswerButton(
                answer = answer,
                onClickOnAnswer = {
                    if (answer.isRight) {
                        clickedAnswer = true
                        showPopUp = true

                        tempAnswer = answer
                    } else {
                        showPopUp = true
                        tempAnswer = answer


                    }
                },
                onNavigateToEndScreen = { onNavigateToEndScreen(answer) },
            )
        }
    }
    if (showPopUp) {
        PopUp(
            onNavigateToEndScreen = {
                onNavigateToEndScreen(tempAnswer!!)
                showPopUp = false


            },
            onConfirm = {
                quizViewModel.rightAnswers += 1
                quizViewModel.loadNextQuestion()
                quizViewModel.deleteQuestion(question = question)
                showPopUp = false
                clickedAnswer = false
                Log.d("PopUponConfirm", "Counter +1")
            },
            clickedAnswer = clickedAnswer,
            rightAnswers = quizViewModel.rightAnswers,
            modifier = modifier
        )
    }
}