package com.example.guizz.ui.components

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
    viewModel: QuizViewModel,
    modifier: Modifier = Modifier,
) {

    var clickedAnswer by remember { mutableStateOf(false) }
    var showPopUp by remember { mutableStateOf(false) }
    var tempAnswer = Answer(text = "", isRight = false)

    LazyColumn {
        items(question.answers) { answer ->
            AnswerButton(
                answer = answer,
                onClickOnAnswer = {
                    if (answer.isRight) {
                        clickedAnswer = true
                        showPopUp = true
                        viewModel.rightAnswers += 1
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
                onNavigateToEndScreen(tempAnswer)
                showPopUp = false
            },
            onConfirm = {
                viewModel.loadNextQuestion()
                viewModel.deleteQuestion(question = question)
                showPopUp = false
                clickedAnswer = false
            },
            clickedAnswer = clickedAnswer,
            rightAnswers = viewModel.rightAnswers,
            modifier = modifier
        )
    }
}