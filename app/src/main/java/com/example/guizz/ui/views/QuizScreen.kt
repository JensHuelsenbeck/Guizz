package com.example.guizz.ui.views

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun QuizScreen(
    modifier: Modifier = Modifier) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Card {
            Text(
                text = "Hier Frage einfügen",
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(20.dp)
                    .width(350.dp)
            )
        }
        Spacer(Modifier.height(20.dp))
        LazyColumn {

        }
    }
}

@Preview(showBackground = true, heightDp = 720, widthDp = 400)
@Composable
private fun QuizScreenPreview() {
    QuizScreen()
}