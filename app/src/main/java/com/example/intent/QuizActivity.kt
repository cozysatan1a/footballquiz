package com.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.intent.databinding.ActivityQuizBinding
import kotlin.math.log

class QuizActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuizBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val ss : String = intent.getStringExtra("send data").toString()

        val quizQuestion = Constants.getQuestion()
        Log.i("question size",  "${quizQuestion.size}")



    }
}