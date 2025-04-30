package com.example.guizz.ui.components

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

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
            dismissButton = { TextButton(onClick = { onNavigateToEndScreen() }) { Text("Beenden") } },
            confirmButton = { TextButton(onClick = { onConfirm() }) { Text("Nächste Frage!") } },
            title = { Text("Richtige Antwort") },
            text = {
                Text(
                    "Willst du weiterspielen?" +
                            "\nRichtige Antworten: $rightAnswers"
                )
            },
            modifier = modifier
        )
    }
}
