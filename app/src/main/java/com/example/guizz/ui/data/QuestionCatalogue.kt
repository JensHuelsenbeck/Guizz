package com.example.guizz.ui.data


import com.example.guizz.ui.model.Answer

import com.example.guizz.ui.model.Question

val easyQuestionList = listOf<Question>(

    Question(
        text = "Wie heißt die Hauptstadt von Deutschland",
        answers = listOf(
            Answer(text = "Berlin", isRight = true),
            Answer(text = "Hamburg", isRight = false),
            Answer(text = "Bern", isRight = false),
            Answer(text = "Madrid", isRight = false)
        )
    ),
    Question(
        text = "Wie heißt die Hauptstadt von Frankreich",
        answers = listOf(
            Answer(text = "Berlin", isRight = false),
            Answer(text = "Hamburg", isRight = false),
            Answer(text = "Bern", isRight = false),
            Answer(text = "Paris", isRight = true)
        )
    )
)

val mediumQuestionList = listOf<Question>()

val hardQuestionList = listOf<Question>()