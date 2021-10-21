package com.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.intent.databinding.ActivityQuizBinding
import kotlin.math.log

class QuizActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuizBinding
    var mCurrentPosition : Int = 1
    var mQuestionList : ArrayList<quizData>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val ss : String = intent.getStringExtra("send data").toString()

        val quizQuestion = Constants.getQuestion()
        Log.i("question size",  "${quizQuestion.size}")
        mQuestionList = Constants.getQuestion()
        setQuestion()


    }
    private fun setQuestion() {
        mCurrentPosition = 1
        val question = mQuestionList!![mCurrentPosition - 1]
        binding.txQuestionNumber.text = "Question $mCurrentPosition"
        binding.txQuestion.text = question.question
        binding.imgQuestionImage.setImageResource(question.image)
        binding.btnOptA.text = question.optA
        binding.btnOptB.text = question.optB
        binding.btnOptC.text = question.optC
        binding.btnOptD.text = question.optD

    }
}