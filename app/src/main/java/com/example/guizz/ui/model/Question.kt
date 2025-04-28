package com.example.guizz.ui.model

import java.util.UUID

enum class Difficulty { EINFACH, MITTEL, SCHWER, SEHR_SCHWER }

data class Question(
    val text: String,
    val answers: List<Pair<String, Boolean>>,
    val difficulty: Difficulty
)

