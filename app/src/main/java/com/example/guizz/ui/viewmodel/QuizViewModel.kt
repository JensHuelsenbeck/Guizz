package com.example.guizz.ui.viewmodel

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.guizz.ui.data.easyQuestionList
import com.example.guizz.ui.data.hardQuestionList
import com.example.guizz.ui.data.mediumQuestionList
import com.example.guizz.ui.model.Question
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class QuizViewModel : ViewModel() {

    private val _easyQuestions = MutableStateFlow(easyQuestionList)
    val easyQuestions = _easyQuestions.asStateFlow()

    private val _mediumQuestions = MutableStateFlow(mediumQuestionList)
    val mediumQuestions = _mediumQuestions.asStateFlow()

    private val _hardQuestions = MutableStateFlow(hardQuestionList)
    val hardQuestions = _hardQuestions.asStateFlow()

    var rightAnswers by mutableIntStateOf(0)

    private val _tempQuestion = MutableStateFlow(fetchQuestion())
    val tempQuestion: StateFlow<Question> = _tempQuestion

    fun loadNextQuestion() {
        _tempQuestion.value = fetchQuestion()
    }

    fun fetchQuestion(): Question {
        return when {
            rightAnswers <= 3 -> {
                Log.d("fetchedQuestion", "Easy wurde gefetched")
                easyQuestions.value.random()
            }

            rightAnswers <= 6 -> {
                Log.d("fetchedQuestion", "Medium wurde gefetched")
                mediumQuestions.value.random()
            }

            else -> {
                Log.d("fetchedQuestion", "Hard wurde gefetched")
                hardQuestions.value.random()
            }
        }
    }

    // Zum temporären Löschen, damit Frage nicht doppelt aufgerufen werden kann
    fun deleteQuestion(question: Question) {
        if (rightAnswers <= 3) {
            _easyQuestions.value -= question
            Log.d("deleteQuestion ", question.text + " wurde gelöscht")
        } else if (rightAnswers <= 6) {
            _mediumQuestions.value -= question
            Log.d("deleteQuestion ", question.text + " wurde gelöscht")
        } else {
            _hardQuestions.value -= question
            Log.d("deleteQuestion ", question.text + " wurde gelöscht")
        }
    }

    fun endLauchGame() {
        rightAnswers = 0
        Log.d("LauchGame ", "LauchGame.exe wurde resettet.")
    }
}
