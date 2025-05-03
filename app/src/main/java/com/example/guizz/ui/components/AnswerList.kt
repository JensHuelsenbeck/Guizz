package com.example.guizz.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.guizz.ui.model.Answer
import com.example.guizz.ui.model.AnswerState
import com.example.guizz.ui.model.Question
import com.example.guizz.ui.viewmodel.QuizViewModel

@Composable
fun AnswerList(
    question: Question,
    onNavigateToEndScreen: (Answer) -> Unit,
    quizViewModel: QuizViewModel,
    activateFiftyFifty: Boolean,
    modifier: Modifier = Modifier,
) {
    var clickedAnswer by remember { mutableStateOf(false) }
    var showPopUp by remember { mutableStateOf(false) }
    var tempAnswer by remember { mutableStateOf<Answer?>(null) }
    val shuffleList = remember(question) { question.answers.shuffled() }

    val removedAnswers = remember(question, activateFiftyFifty) {
        if (activateFiftyFifty) {
            question.answers.filter { !it.isRight }.shuffled().take(2)
        } else emptyList()
    }

    Column(
        modifier = modifier
            .padding(top = 8.dp)
            .padding(bottom = 24.dp)
    ) {
        shuffleList.forEach { answer ->
            val isRemoved = removedAnswers.contains(answer)

            val state = when {
                isRemoved -> AnswerState.REMOVED
                clickedAnswer -> if (answer == tempAnswer) AnswerState.DEFAULT else AnswerState.CLICKED
                else -> AnswerState.DEFAULT
            }

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
                currentState = state,
            )
        }
    }

    if (showPopUp) {
        PopUp(
            onNavigateToEndScreen = {
                onNavigateToEndScreen(tempAnswer!!)
                quizViewModel.rightAnswers += 1
                showPopUp = false
            },
            onConfirm = {
                quizViewModel.rightAnswers += 1
                quizViewModel.loadNextQuestion()
                quizViewModel.deleteQuestion(question = question)
                showPopUp = false
                clickedAnswer = false
            },
            clickedAnswer = clickedAnswer,
            rightAnswers = quizViewModel.rightAnswers,
            modifier = modifier
        )
    }
}