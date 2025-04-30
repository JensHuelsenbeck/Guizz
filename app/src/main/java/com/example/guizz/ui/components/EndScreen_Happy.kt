package com.example.guizz.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.guizz.R
import com.example.guizz.ui.viewmodel.EndScreenViewModel

@Composable
fun EndScreenHappy(
    onNavigateToHome: () -> Unit,
    modifier: Modifier = Modifier,
    endScreenViewModel: EndScreenViewModel,
) {

    if (endScreenViewModel.answer.isRight) {
        Column(
            modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(Modifier.height(25.dp))
            Image(
                painter = painterResource(if (isSystemInDarkTheme()) R.drawable.lauch_happy else R.drawable.lauch_happy),
                contentDescription = "Guenther Lauch",
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .size(325.dp)
            )
            Text(
                text = "HeRzLiChEn GlückWUNSCH !1!!111! !!",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )

            Text(
                text = "Dein Name ist Lauchus Maximus, erster seines Namens!" +
                        "\n Du hast 10 Fragen richtig beantwortet. Du geiler Lauch.",
                fontSize = 16.sp
            )

            Button(
                onClick = { onNavigateToHome() },
                modifier = modifier.padding(top = 90.dp)
            ) {
                Text(
                    text = "Nie wieder Schule!!!!111!1.",
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

@Preview
@Composable
private fun EndScreenPreview() {

}