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
        Calculator.getInstance().process(
            button.text.toString(),
        ) { result -> binding.textView.text = result }
    }
}
