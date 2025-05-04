package com.example.guizz.ui.views

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.guizz.ui.viewmodel.EndScreenViewModel
import com.example.guizz.ui.viewmodel.QuizViewModel

@Composable
fun EndScreen(
    onNavigateToHome: () -> Unit,
    quizViewModel: QuizViewModel,
    endScreenViewModel: EndScreenViewModel = viewModel()
) {
    endScreenViewModel.ChangeScreen(
        viewModel = quizViewModel,
        onNavigateToHome = onNavigateToHome
    )
}

