package com.example.guizz.ui

import kotlinx.serialization.Serializable

@Serializable
object HomeScreenRoute

@Serializable
object QuizScreenRoute

@Serializable
data class EndScreenRoute(
    val text: String,
    val isRight: Boolean
)
