package com.example.guizz.ui.views

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
    quizViewModel: QuizViewModel = viewModel()
) {

    if (endScreenViewModel.answer.isRight) {
        EndScreenHappy(
            onNavigateToHome = onNavigateToHome,
            endScreenViewModel = endScreenViewModel
        )
    } else {
        EndScreenSad(
            onNavigateToHome = onNavigateToHome,
            endScreenViewModel = endScreenViewModel,
            quizViewModel = quizViewModel
        )
    }
}

@Preview
@Composable
private fun EndScreenPreview() {

}