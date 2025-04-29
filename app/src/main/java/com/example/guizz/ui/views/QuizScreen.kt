package com.example.guizz.ui.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.guizz.ui.components.AnswerButton
import com.example.guizz.ui.viewmodel.QuizViewModel

@Composable
fun QuizScreen(
    modifier: Modifier = Modifier,
    viewModel: QuizViewModel = viewModel(),
    onNavigateToHomeScreen: () -> Unit
) {

    val easyQuestion by viewModel.fetchQuestion().collectAsState()
    var clickedAnswer by remember { mutableStateOf(false) }
    var showPopUp by remember { mutableStateOf(false) }
    var rightAnswers by remember { mutableIntStateOf(0)  }

    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize()) {
        Spacer(Modifier.height(50.dp))
        Card {
            Text(
                text = easyQuestion.text,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(20.dp)
                    .width(350.dp)

            )
        }
        Spacer(Modifier.height(50.dp))
        LazyColumn {
            items(easyQuestion.answers) { answer ->
                AnswerButton(
                    answer = answer, onClick = {
                        if (answer.isRight) {
                            viewModel.fetchQuestion()
                            clickedAnswer = true
                            showPopUp = true
                            rightAnswers += 1

                        } else {
                            showPopUp = true
                        }
                    })
            }
        }
    }
    if (showPopUp) {
        PopUp(
            onDismissRequest = {
                onNavigateToHomeScreen()
                showPopUp = false
            },
            onConfirm = {
                viewModel.fetchQuestion()
                viewModel.deleteQuestion(question = easyQuestion)
                showPopUp = false
            },
            clickedAnswer = clickedAnswer,
            rightAnswers = rightAnswers,
            modifier = modifier
        )
    }
}

@Composable
fun PopUp(
    onDismissRequest: () -> Unit,
    onConfirm: () -> Unit,
    clickedAnswer: Boolean,
    rightAnswers: Int,
    modifier: Modifier = Modifier,
) {
    if (clickedAnswer) {
        AlertDialog(
            onDismissRequest = { },
            dismissButton = { TextButton(onClick = { onDismissRequest() }) { Text("Beenden") } },
            confirmButton = { TextButton(onClick = { onConfirm() }) { Text("Nächste Frage!") } },
            title = { Text("Richtige Antwort") },
            text = { Text("Willst du weiterspielen?" +
                    "\nRichtige Antworten: $rightAnswers") },
            modifier = modifier
        )
    } else {
        AlertDialog(
            onDismissRequest = { },
            confirmButton = { TextButton(onClick = { onDismissRequest() }) { Text("In die Schule gehen") } },
            title = { Text("Na? Auch nur Kreide geholt?") },
            text = { Text("Du Lauch hast verkackt. Dann fang mal von Vorne an." +
                    "Richtige Antworten: $rightAnswers") },
            modifier = modifier
        )
    }
}

