package com.example.samplecalculator

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.example.samplecalculator.Util.isArithmeticButton
import com.example.samplecalculator.Util.registerNumberButton
import com.example.samplecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        registerNumberButton(binding) { view ->
            mapButton(view as AppCompatButton)
        }
    }

    private fun mapButton(button: AppCompatButton) {
        when {
            button.id == R.id.buttonClear -> {
                binding.textView.text = ""
            }

            isArithmeticButton(button.id) -> {
                processCalculate(button.text.toString())
            }

            else -> {
                displayNumber(button.text.toString())
            }
        }
    }

    private fun processCalculate(arith: String) {
        Calculator.getInstance().calculate(arith)
    }

    @SuppressLint("SetTextI18n")
    private fun displayNumber(number: String) {
        binding.textView.text = "${binding.textView.text}$number"
    }
}
