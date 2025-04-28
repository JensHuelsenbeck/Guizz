package com.example.guizz.ui.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.guizz.ui.model.Answer

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun AnswerButton(
    answer: Answer,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {

    Card(
        modifier = Modifier.combinedClickable(
            onClick = onClick
        )
    ) {
        Text(
            text = "answer",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(20.dp)
                .width(200.dp)
        )
    }
}