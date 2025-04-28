package com.example.guizz.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.guizz.ui.data.easyQuestionList
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn

class QuizViewModel:ViewModel() {


    private val _easyQuestions = MutableStateFlow(easyQuestionList)
    // Liste aller einfachen Fragen
    val easyQuestions = _easyQuestions.asStateFlow()
    // Eine einzelne Frage
    val easyQuestion = easyQuestions.map { questions ->
        questions.random()
    }.stateIn(
        viewModelScope,
        SharingStarted.WhileSubscribed(5000),
        initialValue = easyQuestionList.random()
    )


}