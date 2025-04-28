package com.example.guizz.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.guizz.ui.data.Questions
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class QuizViewModel:ViewModel() {

    private val _questions = MutableStateFlow(Questions)
    val questions = _questions.asStateFlow()
}