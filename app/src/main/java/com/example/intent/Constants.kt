package com.example.intent

object Constants {
    fun getQuestion() : ArrayList<quizData> {
        val questionList = ArrayList<quizData>()
        val question1 = quizData (
            1,
            "What is his name?",
            R.drawable.r9,
            "Ronaldo Nazario de Lima",
            "Ronaldo Luís Nazário de Lima",
            "Cristiano Ronaldo dos Santos Aveiro",
            "Ronaldo Aparecido Rodrigues",
            2
                )
        questionList.add(question1)
        return questionList
    }
}