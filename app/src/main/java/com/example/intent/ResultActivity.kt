package com.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intent.databinding.ActivityResultBinding

private lateinit var binding: ActivityResultBinding
class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val bundle : Bundle? = intent.getBundleExtra("bundle")
        val mName = bundle?.getString("name", "a")
        val mScore = bundle?.getString("score","0/10")
        setResult(mName!!, mScore!!)

    }
}

private fun setResult(mName : String, mScore : String) {
    binding.tvResultName.text = mName
    binding.tvResultScore.text = "$mScore/10"
}