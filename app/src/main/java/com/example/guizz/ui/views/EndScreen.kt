package com.example.guizz.ui.views

import android.util.Log
import androidx.compose.runtime.Composable
import com.example.guizz.R
import com.example.guizz.ui.components.EndScreenHappy
import com.example.guizz.ui.components.EndScreenSad
import com.example.guizz.ui.viewmodel.QuizViewModel

@Composable
fun EndScreen(
    onNavigateToHome: () -> Unit,
    quizViewModel: QuizViewModel
) {

    Log.d("EndScreen", "Leerer EndScreen wurde geladen")
    if (quizViewModel.rightAnswers >= 10 ) {
        EndScreenHappy(
            onNavigateToHome = onNavigateToHome,
            quizViewModel = quizViewModel
        )
        Log.d("EndScreenHappy", "EndScreen wurde geladen")
    } else {
        EndScreenSad(
            onNavigateToHome = onNavigateToHome,
            quizViewModel = quizViewModel,
            gifRes = R.drawable.giphy

            )
        Log.d("EndScreenSad", "EndScreen wurde geladen")
    }
}

