package com.example.intent

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.intent.databinding.ActivityQuizBinding
import kotlin.math.log

class QuizActivity : AppCompatActivity() {
    private
lateinit var binding: ActivityQuizBinding
    var mCurrentPosition : Int = 1
    var mQuestionList : ArrayList<quizData>? = null
    var mSelectedOptionPosition : Int = 0

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
        binding.btnOptA.setOnClickListener {
            defaultOptionView()
            binding.btnOptA.background = ContextCompat.getDrawable(this, R.drawable.btn_option_selected)
            binding.btnOptA.setTextColor(ContextCompat.getColor(this, R.color.black))


        }
        binding.btnOptB.setOnClickListener {
            defaultOptionView()
            binding.btnOptB.background =
                ContextCompat.getDrawable(this, R.drawable.btn_option_selected)
            binding.btnOptB.setTextColor(ContextCompat.getColor(this, R.color.black))
        }
        binding.btnOptC.setOnClickListener {
            defaultOptionView()
            binding.btnOptC.background =
                ContextCompat.getDrawable(this, R.drawable.btn_option_selected)
            binding.btnOptC.setTextColor(ContextCompat.getColor(this, R.color.black))
        }
        binding.btnOptD.setOnClickListener {
            defaultOptionView()
            binding.btnOptD.background =
                ContextCompat.getDrawable(this, R.drawable.btn_option_selected)
            binding.btnOptD.setTextColor(ContextCompat.getColor(this, R.color.black))
        }






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
        defaultOptionView()

    }
    private fun defaultOptionView() {
        val options = ArrayList<Button>()
        options.add(0, binding.btnOptA)
        options.add(1, binding.btnOptB)
        options.add(2, binding.btnOptC)
        options.add(3, binding.btnOptD)

        for (option in options) {
            option.setTextColor(ContextCompat.getColor(this, R.color.white))
            option.background = ContextCompat.getDrawable(this,
                                                          R.drawable.btn_option_unselected  )
            option.typeface = Typeface.DEFAULT


        }
    }


}