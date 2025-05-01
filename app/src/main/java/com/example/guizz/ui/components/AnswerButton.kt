package com.example.guizz.ui.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.guizz.ui.model.Answer
import com.example.guizz.ui.model.AnswerState
import com.example.guizz.ui.theme.OnPrimaryContainerLight
import com.example.guizz.ui.theme.RightBackgroundDark
import com.example.guizz.ui.theme.RightBackgroundLight
import com.example.guizz.ui.theme.RightBorderDark
import com.example.guizz.ui.theme.RightBorderLight
import com.example.guizz.ui.theme.WrongBackgroundDark
import com.example.guizz.ui.theme.WrongBackgroundLight
import com.example.guizz.ui.theme.WrongBorderDark
import com.example.guizz.ui.theme.WrongBorderLight
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun AnswerButton(
    answer: Answer,
    onClickOnAnswer: () -> Unit,
    onNavigateToEndScreen: () -> Unit,
    modifier: Modifier = Modifier,
    currentState: AnswerState,
) {
    var state by remember { mutableStateOf(currentState) }

    val scope = rememberCoroutineScope()

    val isDark = isSystemInDarkTheme()

    val textColor = when (state) {
        AnswerState.DEFAULT -> MaterialTheme.colorScheme.onPrimaryContainer
        AnswerState.CLICKED -> if (isDark) Color.White else Color.Black
    }

    val backgroundColor = when (state) {
        AnswerState.DEFAULT -> MaterialTheme.colorScheme.primaryContainer

        AnswerState.CLICKED -> if (answer.isRight) {
            if (isDark) RightBackgroundDark else RightBackgroundLight
        } else {
            if (isDark) WrongBackgroundDark else WrongBackgroundLight
        }
    }
    // Rahmenfarbe
    val borderColor = when (state) {
        AnswerState.DEFAULT -> if (isDark) Color.Black else OnPrimaryContainerLight
        AnswerState.CLICKED -> if (answer.isRight) {
            if (isDark) RightBorderDark else RightBorderLight
        } else {
            if (isDark) WrongBorderDark else WrongBorderLight
        }
    }
    val shadowColor = if (isDark) borderColor else Color.Black

    Box(
        modifier = modifier
            .padding(bottom = 16.dp)
            .shadow(
                elevation = 10.dp,
                shape = RoundedCornerShape(16.dp),
                ambientColor = shadowColor,
                spotColor = shadowColor,
                clip = false
            )
            .border(
                width = 2.dp, color = borderColor, shape = RoundedCornerShape(16.dp)
            )
            .background(
                color = backgroundColor, shape = RoundedCornerShape(16.dp)
            )
            .combinedClickable(
                onClick = {
                    if (answer.isRight) {
                        // direkt den State setzten
                        state = AnswerState.CLICKED

                        // Verzögerung und dann Callback
                        scope.launch {
                            delay(2_000)                 // 2 Sekunden
                            onClickOnAnswer()
                            state = AnswerState.DEFAULT
                        }

                    } else {
                        state = AnswerState.CLICKED

                        scope.launch {
                            delay(2_000)                 // 2 Sekunden
                            onNavigateToEndScreen()
                            state = AnswerState.DEFAULT

                        }
                    }
                })
    ) {
        Text(
            text = answer.text,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(20.dp)
                .width(200.dp),
            style = MaterialTheme.typography.titleMedium,
            color = textColor
        )
    }
}
