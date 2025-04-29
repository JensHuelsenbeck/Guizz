package com.example.guizz.ui.viewmodel

import android.util.Log
import androidx.compose.material3.Text
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.guizz.ui.data.easyQuestionList
import com.example.guizz.ui.data.hardQuestionList
import com.example.guizz.ui.data.mediumQuestionList
import com.example.guizz.ui.model.Question
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn

class QuizViewModel : ViewModel() {



    private val _easyQuestions = MutableStateFlow(easyQuestionList)
    val easyQuestions = _easyQuestions.asStateFlow()

    private val _mediumQuestions = MutableStateFlow(mediumQuestionList)
    val mediumQuestions = _mediumQuestions.asStateFlow()

    private val _hardQuestions = MutableStateFlow(hardQuestionList)
    val hardQuestions = _hardQuestions.asStateFlow()

    var rightAnswers by mutableIntStateOf(0)

val tempQuestion = fetchQuestion()


    fun fetchQuestion(): StateFlow<Question> {
        if (rightAnswers <= 2) {
            val question = easyQuestions.map { questions ->
                questions.random()

            }
                .stateIn(
                    viewModelScope,
                    SharingStarted.WhileSubscribed(5000),
                    initialValue = easyQuestionList.random()
                )
            Log.d("fetchedQuestion ", "Easy wurde gefetched")
            return question
        } else if (rightAnswers <= 5) {
            val question = mediumQuestions.map { questions ->
                questions.random()
            }
                .stateIn(
                    viewModelScope,
                    SharingStarted.WhileSubscribed(5000),
                    initialValue = mediumQuestionList.random()
                )
            Log.d("fetchedQuestion ", "Medium wurde gefetched")
            return question
        } else {
            val question = hardQuestions.map { questions ->
                questions.random()
            }
                .stateIn(
                    viewModelScope,
                    SharingStarted.WhileSubscribed(5000),
                    initialValue = hardQuestionList.random()
                )
            Log.d("fetchedQuestion ", "Hard wurde gefetched")
            return question
        }
    }

    // Zum temporären Löschen, damit Frage nicht doppelt aufgerufen werden kann
    fun deleteQuestion(question: Question, rightAnswers: Int) {
        if (rightAnswers <= 3) {
            _easyQuestions.value -= question

                Log.d("deleteQuestion ", question.text + " wurde gelöscht")

        } else if (rightAnswers <= 6) {
            _mediumQuestions.value -= question
        } else {
            _hardQuestions.value -= question
        }


    }
}
