package com.example.guizz.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.guizz.HomeScreenRoute
import com.example.guizz.QuizScreenRoute
import com.example.guizz.ui.views.HomeScreen
import com.example.guizz.ui.views.QuizScreen

@Composable
fun AppStart(
    modifier: Modifier = Modifier
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
                    QuizScreen(onNavigateToHomeScreen = { navController.navigate(HomeScreenRoute) })
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