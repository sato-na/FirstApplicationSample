package com.example.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivityDivision : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_division)

        // 値の受け取り
        val quotient = intent.getIntExtra("quotient", 0)
        val remainder = intent.getIntExtra("remainder", 0)
        val expression = intent.getStringExtra("expression")

        // パーツをプログラム上で使えるようにする
        val textExpressionP = findViewById<TextView>(R.id.textExpressionDivision)
        val textResultP = findViewById<TextView>(R.id.textResultDivision)

        // テキストを表示する
        textExpressionP.text = expression
        textResultP.text = "商は" + quotient.toString() + " 余りは" + remainder.toString()

    }
}