package com.example.guizz.ui.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.navigation.toRoute
import com.example.guizz.ui.EndScreenRoute
import com.example.guizz.ui.model.Answer

class EndScreenViewModel(
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val args = savedStateHandle.toRoute<EndScreenRoute>()
    val answer = Answer(
        text = args.text,
        isRight = args.isRight,
    )
}
