package com.bolachas.examesdelupa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvscore: android.widget.TextView = findViewById(R.id.tv_score)
        val tvcongratulations: android.widget.TextView = findViewById(R.id.tv_congratulations)
        val btnfinish: android.widget.Button = findViewById(R.id.btn_finish)
        val img: android.widget.ImageView = findViewById(R.id.id_end)
        val btnrestart: android.widget.Button = findViewById(R.id.btn_restart)

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        if(correctAnswers > 14){
            tvcongratulations.text = "Parabéns"
            img.setImageResource(R.drawable.asdrubal_success)
        } else {
            tvcongratulations.text = "Tente de novo"
            img.setImageResource(R.drawable.asdrubal_failure)
        }

        tvscore.text = "A sua pontuação é de $correctAnswers/$totalQuestions"
        btnfinish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        btnrestart.setOnClickListener{
            startActivity(Intent(this, QuizzPergunta::class.java))
            finish()
        }
    }
}