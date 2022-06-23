package com.example.firstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // パーツをプログラム上で使えるようにする
        val addButtonP = findViewById<Button>(R.id.addButton)
        val subtractButtonP = findViewById<Button>(R.id.subtractButton)
        val multiplyButtonP = findViewById<Button>(R.id.multiplyButton)
        val enteredNumber1P = findViewById<EditText>(R.id.enteredNumber1)
        val enteredNumber2P = findViewById<EditText>(R.id.enteredNumber2)

        // 【和を求める】ボタンを押したときの動き
        addButtonP.setOnClickListener {
            // 入力した数字の処理
            val strNumber1 = enteredNumber1P.text.toString()
            val strNumber2 = enteredNumber2P.text.toString()

            // 入力された数字が空であるか判断する
            if (strNumber1.isEmpty()) {         // 数値1が空の時
                enteredNumber1P.setError("数値1を入力して下さい")
            } else if (strNumber2.isEmpty()) {  // 数値1が空じゃなく数値2が空の時
                enteredNumber2P.setError("数値2を入力してください")
            } else {    // 数値1も数値2も入力されている時
                val number1 = strNumber1.toInt()
                val number2 = strNumber2.toInt()

                // 計算結果
                val sum = number1 + number2

                // 説明用テキストの作成
                val expression = strNumber1 + "と" + strNumber2 + "の和は"

                // 画面遷移する
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("result", sum)
                intent.putExtra("expression", expression)
                startActivity(intent)
            }
        }

        // 【差を求める】ボタンを押したときの動き
        subtractButtonP.setOnClickListener {
            // 入力した数字の処理
            val strNumber1 = enteredNumber1P.text.toString()
            val strNumber2 = enteredNumber2P.text.toString()

            // 入力された数字が空であるか判断する
            if (strNumber1.isEmpty()) {         // 数値1が空の時
                enteredNumber1P.setError("数値1を入力して下さい")
            } else if (strNumber2.isEmpty()) {  // 数値1が空じゃなく数値2が空の時
                enteredNumber2P.setError("数値2を入力してください")
            } else {    // 数値1も数値2も入力されている時
                val number1 = strNumber1.toInt()
                val number2 = strNumber2.toInt()

                // 計算結果
                val difference = number1 - number2

                // 説明用テキストの作成
                val expression = strNumber1 + "と" + strNumber2 + "の差は"

                // 画面遷移する
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("result", difference)
                intent.putExtra("expression", expression)
                startActivity(intent)
            }
        }

        multiplyButtonP.setOnClickListener {
            // 入力した数字の処理
            val strNumber1 = enteredNumber1P.text.toString()
            val strNumber2 = enteredNumber2P.text.toString()

            // 入力された数字が空であるか判断する
            if (strNumber1.isEmpty()) {         // 数値1が空の時
                enteredNumber1P.setError("数値1を入力して下さい")
            } else if (strNumber2.isEmpty()) {  // 数値1が空じゃなく数値2が空の時
                enteredNumber2P.setError("数値2を入力してください")
            } else {    // 数値1も数値2も入力されている時
                val number1 = strNumber1.toInt()
                val number2 = strNumber2.toInt()

                // 計算結果
                val product = number1 * number2

                // 説明用テキストの作成
                val expression = strNumber1 + "と" + strNumber2 + "の積は"

                // 画面遷移する
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("result", product)
                intent.putExtra("expression", expression)
                startActivity(intent)
            }
        }

    }
}