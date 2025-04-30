package com.example.guizz.ui

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.guizz.ui.viewmodel.QuizViewModel
import com.example.guizz.ui.views.EndScreen
import com.example.guizz.ui.views.HomeScreen
import com.example.guizz.ui.views.QuizScreen

@Composable
fun AppStart(
    modifier: Modifier = Modifier,
    quizViewModel: QuizViewModel = viewModel()
) {

    val navController = rememberNavController()

    Scaffold { innerPadding ->
        Column {
            Spacer(Modifier.height(80.dp))
            NavHost(
                navController = navController,
                startDestination = HomeScreenRoute,
                modifier = Modifier.padding(innerPadding)
            ) {
                composable<HomeScreenRoute> {
                    HomeScreen(onNavigationToQuizScreen = { navController.navigate(QuizScreenRoute) })
                }
                composable<QuizScreenRoute> {
                    QuizScreen(
                        quizViewModel = quizViewModel,
                        onNavigateToEndScreen = { answer ->
                            navController.navigate(
                                EndScreenRoute(
                                    text = answer.text,
                                    isRight = answer.isRight
                                )
                            )
                            Log.d(
                                "NavRoute -> ViewModel ", "Objekt wurde erstellt." +
                                        "text = ${answer.text}" +
                                        "isRight = ${answer.isRight}"
                            )

                        }
                    )
                }
                composable<EndScreenRoute> {
                    EndScreen(
                        onNavigateToHome = { navController.navigate(HomeScreenRoute) },
                        quizViewModel = quizViewModel
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun AppStartPreview() {
    AppStart()
}