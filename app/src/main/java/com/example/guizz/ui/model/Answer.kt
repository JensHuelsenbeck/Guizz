package com.example.guizz.ui.model

import java.util.UUID

data class Answer(
    val id: UUID = UUID.randomUUID(),
    val text: String,
    val isRight: Boolean
)
