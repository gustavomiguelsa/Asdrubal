package com.bolachas.examesdelupa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Para retirar a barra no topo
        //window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val lupabutton: android.widget.Button = findViewById(R.id.btn_lupa)
        val icnfbutton: android.widget.Button = findViewById(R.id.btn_icnf)
        
        lupabutton.setOnClickListener {

            Log.i("Button value", "$lupabutton")

            val intent = Intent(this, QuizzPergunta::class.java)


            startActivity(intent)
            //finish()
        }

        icnfbutton.setOnClickListener {

            Log.i("Button value", "$icnfbutton")

            val intent = Intent(this, QuizzPerguntaICNF::class.java)


            startActivity(intent)
            //finish()
        }
    }
}