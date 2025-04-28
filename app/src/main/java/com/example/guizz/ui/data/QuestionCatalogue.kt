package com.example.guizz.ui.data


import com.example.guizz.ui.model.Answer
import com.example.guizz.ui.model.Difficulty
import com.example.guizz.ui.model.Question

val Questions = listOf<Question>(

    Question(
        text = "Was ist die Hauptstadt von Deutschland?",
        answers = listOf(
            "München" to false,
            "Berlin" to true,
            "Frankfurt" to false,
            "Hamburg" to false
        ),
        difficulty = Difficulty.EINFACH
    )
)
