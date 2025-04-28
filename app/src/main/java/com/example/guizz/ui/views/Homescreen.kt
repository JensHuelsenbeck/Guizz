package com.example.guizz.ui.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.guizz.R

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier) {
    Text(
        text = "Welcome to GUIZZ",
        style = MaterialTheme.typography.titleLarge,
        fontWeight = FontWeight.Bold
        )
    Spacer(Modifier.height(25.dp))
    Image(
        painter = painterResource(R.drawable.guenterweiss),
        contentDescription = "Guenther Lauch",
        modifier = Modifier
            .clip(shape = CircleShape)
    )
    Spacer(Modifier.height(25.dp))
    Text(
        text = "Presented by Guenther Lauch",
        style = MaterialTheme.typography.titleMedium,
        fontWeight = FontWeight.Bold
        )
    Spacer(Modifier.height(25.dp))
    Button(
        onClick = {},
    ) {
        Text(
            text = "Spielen",
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