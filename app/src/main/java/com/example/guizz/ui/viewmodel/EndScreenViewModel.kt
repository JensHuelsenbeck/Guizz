package com.example.guizz.ui.viewmodel

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import com.example.guizz.R
import com.example.guizz.ui.components.EndScreenHappy
import com.example.guizz.ui.components.EndScreenSad

class EndScreenViewModel: ViewModel() {

    @Composable
    fun ChangeScreen(viewModel: QuizViewModel, onNavigateToHome: () -> Unit) {
        Log.d("EndScreen", "Leerer EndScreen wurde geladen")
        if (viewModel.rightAnswers >= 10 ) {
            EndScreenHappy(
                onNavigateToHome = onNavigateToHome,
                quizViewModel = viewModel
            )
            Log.d("EndScreenHappy", "EndScreen wurde geladen")
        } else {
            EndScreenSad(
                onNavigateToHome = onNavigateToHome,
                quizViewModel = viewModel,
                gifRes = R.drawable.giphy

            )
            Log.d("EndScreenSad", "EndScreen wurde geladen")
        }
    }


}