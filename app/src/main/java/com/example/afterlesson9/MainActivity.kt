package com.example.afterlesson9

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.afterlesson9.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    companion object

    var listOfMotivation: List<String> = listOf(
        "You are the best student!",
        "Per aspera ad astra",
        "Try and try, and give reward",
        "Good boy!",
        "Excellent work!",
        "Cool, bro..."
    )

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        displayNexLabel()

        binding.btnUpdateMotiveLabel.setOnClickListener {
            displayNexLabel()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun displayNexLabel() {
        if (!listOfMotivation.isNullOrEmpty()) {
            var nextLabel = listOfMotivation.random()
            while (binding.tvMotiveLabel.text == nextLabel) {
                nextLabel = listOfMotivation.random()
            }
            binding.tvMotiveLabel.text = nextLabel
        } else binding.tvMotiveLabel.text = "No motivation for you, sorry..."
    }
}