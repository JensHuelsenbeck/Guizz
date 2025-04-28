package com.example.guizz.ui.model

import java.util.UUID



data class Question(
    val id: UUID = UUID.randomUUID(),
    val text: String,
    val answers: List<Answer>,
    val alreadyAsked: Boolean = false
)

