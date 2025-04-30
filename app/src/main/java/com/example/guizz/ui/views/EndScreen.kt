package com.example.guizz.ui.views

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.guizz.ui.components.EndScreenHappy
import com.example.guizz.ui.components.EndScreenSad
import com.example.guizz.ui.viewmodel.EndScreenViewModel
import com.example.guizz.ui.viewmodel.QuizViewModel

@Composable
fun EndScreen(
    onNavigateToHome: () -> Unit,
    modifier: Modifier = Modifier,
    endScreenViewModel: EndScreenViewModel = viewModel(),
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
            endScreenViewModel = endScreenViewModel,
            quizViewModel = quizViewModel
        )
        Log.d("EndScreenSad", "EndScreen wurde geladen")
    }
}

