package com.example.guizz.ui.components

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight

@Composable
fun PopUp(
    onNavigateToEndScreen: () -> Unit,
    onConfirm: () -> Unit,
    clickedAnswer: Boolean,
    rightAnswers: Int,
    modifier: Modifier = Modifier,
) {
    if (clickedAnswer) {
        AlertDialog(
            onDismissRequest = { },
            dismissButton = {
                TextButton(onClick = { onNavigateToEndScreen() }) {
                    Text(
                        text = "Beenden",
                        fontWeight = FontWeight.Bold,
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
            },
            confirmButton = {
                TextButton(onClick = { onConfirm() }) {
                    Text(
                        text = "Nächste Frage!",
                        fontWeight = FontWeight.Bold,
                        style = MaterialTheme.typography.bodyLarge

                    )
                }
            },
            title = {
                Text(
                    text = "Richtige Antwort",
                    fontWeight = FontWeight.SemiBold,
                    style = MaterialTheme.typography.headlineMedium
                )
            },
            text = {
                Text(
                    text = "Willst du weiterspielen?" + "\nRichtige Antworten: ${rightAnswers + 1}",
                    style = MaterialTheme.typography.titleMedium
                )
            },
            modifier = modifier
        )
    }
}
