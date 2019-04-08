package com.example.primenumberchecker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlin.math.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    fun isPrime(n: Int): Boolean {
        if (n % 2 == 0) return false
        val sqrtN : Double = sqrt(n.toDouble())
        var i = 3
        while (i <= sqrtN) {
            if (n % i === 0) return false
            i += 2
        }
        return true
    }

    override fun onClick(v: View?) {
        val inputNum: Int = inputNumber.text.toString().toInt()
        if(inputNum < 2) {
            decideText.text = "素数ではありません・・・"
            return
        }

        if (isPrime(inputNum)) {
            decideText.text = "素数です！！！！！！！！"
        } else {
            decideText.text = "素数ではありません・・・"
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(this)
    }
}
