package com.example.samplecalculator

import android.view.View
import androidx.annotation.Keep
import com.example.samplecalculator.databinding.ActivityMainBinding


@Keep
object Util {
    fun registerNumberButton(binding: ActivityMainBinding, listener: View.OnClickListener) {
        with(binding) {
            button0.setOnClickListener(listener)
            button1.setOnClickListener(listener)
            button2.setOnClickListener(listener)
            button3.setOnClickListener(listener)
            button4.setOnClickListener(listener)
            button5.setOnClickListener(listener)
            button6.setOnClickListener(listener)
            button7.setOnClickListener(listener)
            button8.setOnClickListener(listener)
            button9.setOnClickListener(listener)
            buttonClear.setOnClickListener(listener)
            buttonEquals.setOnClickListener(listener)
            buttonPlus.setOnClickListener(listener)
            buttonMinus.setOnClickListener(listener)
            buttonMultiply.setOnClickListener(listener)
            buttonDivide.setOnClickListener(listener)
        }
    }

    fun isArithmeticButton(id: Int) : Boolean =
        id == R.id.buttonPlus || id == R.id.buttonMinus
                || id == R.id.buttonMultiply || id == R.id.buttonDivide || id == R.id.buttonEquals
}
