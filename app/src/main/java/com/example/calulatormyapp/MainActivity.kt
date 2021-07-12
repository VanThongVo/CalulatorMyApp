package com.example.calulatormyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var NewOp = true
    var OlNumber = ""
    var Op = "+"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun numberEvent(view: View) {
        if(NewOp)
            editText.setText("")
        NewOp = false
        var click = editText.text.toString()
        var select = view as Button
        when(select.id) {
            btn0.id -> {click += "0"}
            btn1.id -> {click += "1"}
            btn2.id -> {click += "2"}
            btn3.id -> {click += "3"}
            btn4.id -> {click += "4"}
            btn5.id -> {click += "5"}
            btn6.id -> {click += "6"}
            btn7.id -> {click += "7"}
            btn8.id -> {click += "8"}
            btn9.id -> {click += "9"}
            btnch.id -> {click += "."}
            
        }
        editText.setText(click)
    }

    fun operaEvent(view: View) {
        NewOp = true
        OlNumber = editText.text.toString()
        var select = view as Button
        when(select.id) {
            btnco.id -> {Op = "+"}
            btnt.id -> {Op = "-"}
            btnn.id -> {Op = "*"}
            btnc.id -> {Op = "/"}
        }
    }

    fun equalEvent(view: View) {
        var newnumber = editText.text.toString()
        var result = 0.0
        when(Op){
            "+" -> {result = OlNumber.toDouble() + newnumber.toDouble()}
            "*" -> {result = OlNumber.toDouble() * newnumber.toDouble()}
            "-" -> {result = OlNumber.toDouble() - newnumber.toDouble()}
            "/" -> {result = OlNumber.toDouble() / newnumber.toDouble()}
        }
        editText.setText(result.toString())
    }
    fun EcEvent(view: View) {
        editText.setText("0.")
        NewOp = true
    }
    fun percenEvent(view: View) {
        var no = editText.text.toString().toDouble()/100
        editText.setText(no.toString())
        NewOp = true
    }
}