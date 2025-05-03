package com.example.guizz.ui.components

import android.os.Build
import android.util.Log
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.ImageLoader
import coil.compose.rememberAsyncImagePainter
import coil.decode.GifDecoder
import coil.decode.ImageDecoderDecoder
import coil.request.ImageRequest
import com.example.guizz.R
import com.example.guizz.ui.viewmodel.QuizViewModel

@Composable
fun EndScreenSad(
    onNavigateToHome: () -> Unit,
    modifier: Modifier = Modifier,
    quizViewModel: QuizViewModel,
    @DrawableRes gifRes: Int = R.drawable.giphy
) {
    var isOffended by remember { mutableStateOf(false) }
    val context = LocalContext.current

    // Custom ImageLoader mit GIF-Support
    val imageLoader = ImageLoader.Builder(context).components {
        if (Build.VERSION.SDK_INT >= 28) {
            add(ImageDecoderDecoder.Factory())
        } else {
            add(GifDecoder.Factory())
        }
    }.build()

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
            style = MaterialTheme.typography.titleLarge,
            modifier = modifier.padding(top = 24.dp)
        )

        Text(
            text = "Du Lauch hast verkackt. Dann fang mal von Vorne an." + "\nDu hast ${quizViewModel.rightAnswers} Fragen richtig beantwortet.",
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            style = MaterialTheme.typography.bodyLarge,
            modifier = modifier.padding(top = 8.dp)
        )

        Button(
            onClick = {
                onNavigateToHome()
                quizViewModel.endLauchGame()
            }, modifier = modifier
                .padding(top = 180.dp)
                .width(300.dp)
        ) {
            Text(
                text = "Zurück in die Schule!",
                color = Color.White,
                style = MaterialTheme.typography.titleLarge,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.ExtraBold,
                modifier = modifier.padding(8.dp)
            )
        }
        Button(
            onClick = { isOffended = true }, modifier = modifier
                .padding(top = 16.dp)
                .width(300.dp)
        ) {
            Text(
                text = "Na, beleidigt?",
                color = Color.White,
                style = MaterialTheme.typography.titleLarge,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                modifier = modifier.padding(8.dp)
            )
        }
    }

    if (isOffended) AlertDialog(
        onDismissRequest = { },
        confirmButton = {
            Row(
                modifier = modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center
            ) {
                TextButton(onClick = {
                    onNavigateToHome()
                    isOffended = false
                }) {
                    Text(
                        "Nach Hause gehen",
                        fontWeight = FontWeight.Bold,
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
            }
        },
        text = {
            val painter = rememberAsyncImagePainter(
                model = ImageRequest.Builder(context).data(gifRes).build(),
                imageLoader = imageLoader
            )

            Image(
                painter = painter,
                contentDescription = "Lade GIF …",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .clip(RoundedCornerShape(8.dp))
            )
        },
        modifier = modifier,
    )
    Log.d("Answer Sad Counter", "Counter = ${quizViewModel.rightAnswers}")
}




