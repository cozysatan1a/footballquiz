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
        val question2 = quizData(
            2,
            "What is his name?",
            R.drawable.batistuta,
            "Gabriel Batistuta",
            "Luca Toni",
            "David Trezeguet",
            "Diego Forlan",
            1
        )
        val question3 = quizData(
            3,
            "What is his name?",
            R.drawable.samuel,
            "Esteban Cambiasso",
            "Javier Zanetti",
            "Antonio Conte",
            "Walter Samuel",
            4
        )
        val question4 = quizData(
            4,
            "What is his name?",
            R.drawable.serginho,
            "Marek Jankulovski",
            "Cafu",
            "Serginho",
            "Camoranesi",
            3
        )
        val question5 = quizData(
            5,
            "What is his name?",
            R.drawable.piszczek,
            "Lukas Piszczek",
            "Nuri Sahin",
            "Kevin Kampl",
            "Wout Weghorst",
            1
        )
        val question6 = quizData(
            6,
            "What is his name?",
            R.drawable.cavani_palermo,
            "Javier Pastore",
            "Fabio Quagliarella",
            "Gonzalo Higuain",
            "Edison Cavani",
            4
        )
        val question7 = quizData(
            7,
            "What is his name?",
            R.drawable.camoranesi,
            "Mauro Camoranesi",
            "Mauro Icardi",
            "Pablo Sarabia",
            "Hakan Calhanoglu",
            1
        )
        val question8 = quizData(
            8,
            "What is his name?",
            R.drawable.benyedder,
            "Wissam Ben Yedder",
            "Gabigol",
            "Myron Boadu",
            "Ismael Bennacer",
            1
        )
        val question9 = quizData(
            9,
            "What is his name",
            R.drawable.forlan,
            "Gonzalo Higuain",
            "Ruud Van Nistelrooy",
            "Thierry Henry",
            "Diego Forlan",
            4
        )
        val question10 = quizData(
            10,
            "What is his name",
            R.drawable.veron,
            "Andreas Iniesta",
            "Paul Scholes",
            "Diego Simeone",
            "Veron",
            4
        )



        questionList.add(question1)
        questionList.add(question2)
        questionList.add(question3)
        questionList.add(question4)
        questionList.add(question5)
        questionList.add(question6)
        questionList.add(question7)
        questionList.add(question8)
        questionList.add(question9)
        questionList.add(question10)



        return questionList
    }
}