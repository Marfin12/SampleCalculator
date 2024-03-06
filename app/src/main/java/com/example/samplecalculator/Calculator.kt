package com.example.samplecalculator

class Calculator {
    companion object {
        @Volatile
        private var instance: Calculator? = null
        fun getInstance(): Calculator = instance ?: synchronized(this) {
            instance ?: Calculator()
        }.also {
            instance = it
        }
    }

    fun calculate(arithmeticButton: String) {

    }
}