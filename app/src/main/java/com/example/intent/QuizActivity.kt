package com.example.intent

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.intent.databinding.ActivityQuizBinding
import kotlin.math.log

class QuizActivity : AppCompatActivity() {
    private
lateinit var binding: ActivityQuizBinding
    var mCurrentPosition : Int = 1
    var mQuestionList : ArrayList<quizData>? = null
    var mSelectedOptionPosition : Int = 0
    var buttonCheckSelected : Boolean = false

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

        binding.btnSubmit.isEnabled= false

        binding.btnOptA.setOnClickListener {
            binding.btnSubmit.isEnabled = true
            defaultOptionView()

            binding.btnOptA.background = ContextCompat.getDrawable(this, R.drawable.btn_option_selected)
            binding.btnOptA.setTextColor(ContextCompat.getColor(this, R.color.black))
            mSelectedOptionPosition =1

        }
        binding.btnOptB.setOnClickListener {
            binding.btnSubmit.isEnabled = true
            defaultOptionView()
            mSelectedOptionPosition = 2
            binding.btnOptB.background =
                ContextCompat.getDrawable(this, R.drawable.btn_option_selected)
            binding.btnOptB.setTextColor(ContextCompat.getColor(this, R.color.black))
        }
        binding.btnOptC.setOnClickListener {
            binding.btnSubmit.isEnabled = true
            defaultOptionView()
            mSelectedOptionPosition = 3
            binding.btnOptC.background =
                ContextCompat.getDrawable(this, R.drawable.btn_option_selected)
            binding.btnOptC.setTextColor(ContextCompat.getColor(this, R.color.black))
        }
        binding.btnOptD.setOnClickListener {
            binding.btnSubmit.isEnabled = true
            defaultOptionView()
            mSelectedOptionPosition = 4
            binding.btnOptD.background =
                ContextCompat.getDrawable(this, R.drawable.btn_option_selected)
            binding.btnOptD.setTextColor(ContextCompat.getColor(this, R.color.black))
        }
        binding.btnSubmit.setOnClickListener{

            if (mSelectedOptionPosition == 0) {
                mCurrentPosition ++
                if (mCurrentPosition <= mQuestionList!!.size) {
                    setQuestion(mCurrentPosition)
                    binding.btnSubmit.isEnabled = false
                }
                else {
                    Toast.makeText(this, "Quiz completed", Toast.LENGTH_SHORT).show()
                }

            }
            else {
                Toast.makeText(this, "$mSelectedOptionPosition", Toast.LENGTH_SHORT).show()
                val question = mQuestionList!![mCurrentPosition - 1]
                if (mSelectedOptionPosition != question.optTrue) {
                    correctOptionView(mSelectedOptionPosition, R.drawable.btn_option_selected_wrong)
                    correctOptionView(question.optTrue, R.drawable.btn_option_selected_correct)
                }
                else {
                    correctOptionView(mSelectedOptionPosition, R.drawable.btn_option_selected_correct)
                }
                if (mCurrentPosition == mQuestionList!!.size) {
                    binding.btnSubmit.text = "FINISH"
                } else {
                    binding.btnSubmit.text = "NEXT QUESTION"
                }
                mSelectedOptionPosition = 0
            }

        }
        }
    private fun setQuestion(position : Int = 1 ) {
        mCurrentPosition = position
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
        mSelectedOptionPosition = 0
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

    private fun correctOptionView(answer : Int, drawableView : Int) {
        when (answer) {
            1 -> {
                binding.btnOptA.background = ContextCompat.getDrawable(this, drawableView)
            }
            2 -> {
                binding.btnOptB.background = ContextCompat.getDrawable(this, drawableView)
            }
            3 -> {
                binding.btnOptC.background = ContextCompat.getDrawable(this, drawableView)
            }
            4 -> {
                binding.btnOptD.background = ContextCompat.getDrawable(this, drawableView)
            }
        }
    }


}