package com.example.guizz.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.guizz.R
import com.example.guizz.ui.viewmodel.EndScreenViewModel
import com.example.guizz.ui.viewmodel.QuizViewModel

@Composable
fun EndScreenSad(
    onNavigateToHome: () -> Unit,
    modifier: Modifier = Modifier,
    endScreenViewModel: EndScreenViewModel,
    quizViewModel: QuizViewModel
) {

    var isOffended by remember { mutableStateOf(false) }

    if (endScreenViewModel.answer.isRight) {
        Column(
            modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(Modifier.height(25.dp))
            Image(
                painter = painterResource(if (isSystemInDarkTheme()) R.drawable.lauch_sad else R.drawable.lauch_sad),
                contentDescription = "Guenther Lauch",
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .size(325.dp)
            )
            Text(
                text = "Na? Auch nur Kreide geholt?",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )

            Text(
                text = "Du Lauch hast verkackt. Dann fang mal von Vorne an." +
                        "\n Du hast ${quizViewModel.rightAnswers} Fragen richtig beantwortet.",
                fontSize = 16.sp
            )
            Row {
                Button(
                    onClick = { onNavigateToHome() },
                    modifier = modifier.padding(top = 90.dp)
                ) {
                    Text(
                        text = "Zurück in die Schule!",
                        color = Color.White,
                        style = MaterialTheme.typography.titleLarge,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        modifier = modifier
                            .padding(8.dp)
                            .width(150.dp)
                    )
                }
                Button(
                    onClick = { isOffended = true },
                    modifier = modifier.padding(top = 90.dp)
                ) {
                    Text(
                        text = "Na? Beleidigt?.",
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
        }
    }
    if (isOffended)
        AlertDialog(
            onDismissRequest = { },
            confirmButton = {
                TextButton(onClick = {
                    onNavigateToHome()
                    isOffended = false
                }) { Text("In die Schule gehen") }
            },
            title = { Text("Na? Auch nur Kreide geholt?") },
            text = {
                Text(
                    "Du Lauch hast verkackt. Dann fang mal von Vorne an." +
                            "\nDu hast ${quizViewModel.rightAnswers} Fragen richtig beantwortet."
                )
            },
            modifier = modifier
        )
}




