package com.kreg.quizapp.helpers

import com.kreg.quizapp.model.Answer
import com.kreg.quizapp.model.Question
import com.kreg.quizapp.model.Test

var answer1 = Answer(
    isCorrect = false,
    text = "- 4 угла.")

var answer2 = Answer(
    isCorrect = false,
    text = "- Не знаю.")

var answer3 = Answer(
    isCorrect = true,
    text = "Посчитать количество уголовников в камере.")

var question1 = Question(
    text = "Сколько углов камере?",
    answers = listOf(answer1, answer2, answer3)
)
///////////////////////////////////////////////
var question2 = Question(
    text = "Вилкой в глаз или в жопу раз?",
    answers = listOf(
        Answer(
            isCorrect = false,
            text = "- В жопу раз."
        ),
        Answer(
            isCorrect = true,
            text = "- В тюрьме вилок нет."
        ),
        Answer(
            isCorrect = false,
            text = "- Что-то я здесь одноглазых не вижу."
        ),
    )
)
///////////////////////////////////////////////
var question3 = Question(
    text = "По каким понятиям живёшь?",
    answers = listOf(
        Answer(
            isCorrect = false,
            text = "- По воровским."
        ),
        Answer(
            isCorrect = false,
            text = "- По мусорским."
        ),
        Answer(
            isCorrect = true,
            text = "- По людским."
        ),
    )
)

val textExample = Test(
    score = 0,
    questions = listOf(question1, question2, question3)
)