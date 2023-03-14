package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var buttonBinary: Button
    lateinit var buttonOctal: Button
    lateinit var buttonDecimal: Button
    lateinit var buttonHexaDecimal: Button
    lateinit var enterTextNumberOrLetter: TextView
    lateinit var clearButton: Button
    lateinit var from: TextView
    lateinit var to: TextView
    lateinit var equal: Button
    lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()

        addCallbacks()

    }

    private fun addCallbacks() {
        clearButton.setOnClickListener {
            clearInput()
        }
        buttonBinary.setOnClickListener {
            fromTo((it as Button))
        }
        buttonOctal.setOnClickListener {
            fromTo((it as Button))
        }
        buttonDecimal.setOnClickListener {
            fromTo((it as Button))
        }
        buttonHexaDecimal.setOnClickListener {
            fromTo((it as Button))
        }
        equal.setOnClickListener {

        }
    }



    private fun fromTo(v: Button) {
        if (from.text.toString() == "") {
            from.text = v.text
        } else if (to.text.toString() == "") {
            to.text = v.text
        }
    }

    private fun initView() {
        buttonBinary = findViewById(R.id.btn_binary)
        buttonOctal = findViewById(R.id.btn_octal)
        buttonDecimal = findViewById(R.id.btn_decimal)
        buttonHexaDecimal = findViewById(R.id.btn_hexa_decimal)
        enterTextNumberOrLetter = findViewById(R.id.enter_the_number)
        clearButton = findViewById(R.id.btn_clear)
        from = findViewById(R.id.from)
        to = findViewById(R.id.to)
        equal = findViewById(R.id.equal)
        result = findViewById(R.id.result)
    }

    fun clearInput() {
        enterTextNumberOrLetter.text = ""
        from.text = ""
        to.text = ""
    }

    fun onClickNumberOrLetter(v: View) {
        val newNumberOrLetter = (v as Button).text.toString()
        val oldNumberOrLetter = enterTextNumberOrLetter.text.toString()
        val newTextNumberOrLetter = oldNumberOrLetter + newNumberOrLetter
        enterTextNumberOrLetter.text = newTextNumberOrLetter
    }


}