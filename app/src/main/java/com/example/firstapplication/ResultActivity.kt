package com.example.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // 値の受け取り
        val result = intent.getIntExtra("result", 0)
        val expression = intent.getStringExtra("expression")

        // パーツをプログラム上で使えるようにする
        val textExpressionP = findViewById<TextView>(R.id.textExpression)
        val textResultP = findViewById<TextView>(R.id.textResult)

        // テキストを表示する
        textExpressionP.text = expression
        textResultP.text = result.toString()
    }
}