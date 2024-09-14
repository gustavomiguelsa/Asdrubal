package com.bolachas.examesdelupa

import android.R.attr
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat
import android.R.attr.button
import android.annotation.SuppressLint
import android.widget.ImageView


class QuizzPergunta : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition:Int = 1
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0
    private var mCorrectAnswers: Int = 0
    private var numbers: MutableList<Int>? = mutableListOf()
    private var repeat_numbers: MutableList<Int>? = mutableListOf()
    private val testSize: Int = 20
    private var clicked: Boolean = false
    private var repeating: Boolean = false



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quizz_pergunta)

        val tvoptionone: TextView = findViewById(R.id.tv_option_one)
        val tvoptiontwo: TextView = findViewById(R.id.tv_option_two)
        val tvoptionthree: TextView = findViewById(R.id.tv_option_three)
        val btnsubmit: Button = findViewById(R.id.btn_submit)


        mQuestionsList = Constants.getQuestions()

        val rnd = (0..mQuestionsList!!.size-1).random()
        numbers?.add(rnd)

        Log.d("initial list", numbers.toString());

        btnsubmit.setEnabled(false);
        setQuestion(rnd)

        tvoptionone.setOnClickListener(this)
        tvoptiontwo.setOnClickListener(this)
        tvoptionthree.setOnClickListener(this)
        btnsubmit.setOnClickListener(this)
    }


    private fun setQuestion(rnd: Int){

        val tvoptionone: TextView = findViewById(R.id.tv_option_one)
        val tvoptiontwo: TextView = findViewById(R.id.tv_option_two)
        val tvoptionthree: TextView = findViewById(R.id.tv_option_three)
        val btnsubmit: Button = findViewById(R.id.btn_submit)



        val question = mQuestionsList!![rnd]


        defaultOptionsView()

        if(mCurrentPosition == testSize){ //mQuestionsList!!.size){
            btnsubmit.text = "Terminar"
        }else{
            btnsubmit.text = "Submeter"
        }

        val progressBar: ProgressBar = findViewById(R.id.progressBar)
        val tvprogress: TextView = findViewById(R.id.tv_progress)
        val tvquestion: TextView = findViewById(R.id.tv_question)

        val ivimage: android.widget.ImageView = findViewById(R.id.iv_image)



        progressBar.progress = mCurrentPosition
        tvprogress.text = "$mCurrentPosition/$testSize"

        tvquestion.text = question!!.question

        if(question.image != R.drawable.transparent) {
            ivimage.visibility = View.VISIBLE
            ivimage.setImageResource((question.image))
        }

        tvoptionone.text = question.optionOne
        tvoptiontwo.text = question.optionTwo
        tvoptionthree.text = question.optionThree
    }

    private fun defaultOptionsView(){

        val tvoptionone: TextView = findViewById(R.id.tv_option_one)
        val tvoptiontwo: TextView = findViewById(R.id.tv_option_two)
        val tvoptionthree: TextView = findViewById(R.id.tv_option_three)

        val options = ArrayList<TextView>()
        options.add(0, tvoptionone)
        options.add(1, tvoptiontwo)
        options.add(2, tvoptionthree)

        for (option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg
            )
        }
    }

    override fun onClick(v: View?) {

        val ivimage: ImageView = findViewById(R.id.iv_image)
        val tvoptionone: TextView = findViewById(R.id.tv_option_one)
        val tvoptiontwo: TextView = findViewById(R.id.tv_option_two)
        val tvoptionthree: TextView = findViewById(R.id.tv_option_three)
        val btnsubmit: Button = findViewById(R.id.btn_submit)
        var rnd = -1


        when(v?.id){
            R.id.tv_option_one -> {
                if (clicked == false){
                    selectedOptionView(tvoptionone, 1)
                btnsubmit.setEnabled(true);
                }
            }
            R.id.tv_option_two ->{
                if(clicked == false) {
                    selectedOptionView(tvoptiontwo, 2)
                    btnsubmit.setEnabled(true);
                }
            }
            R.id.tv_option_three ->{
                if(clicked == false) {
                    selectedOptionView(tvoptionthree, 3)
                    btnsubmit.setEnabled(true);
                }
            }
            R.id.btn_submit ->{

                //Garantir que o utilizador não pode mudar a opção escolhida depois de já ter submetido
                if(clicked == false){
                    clicked = true
                } else {
                    clicked = false
                }

                if(mSelectedOptionPosition == 0){
                    mCurrentPosition++

                    Log.d("Repeating", repeating.toString());


                    when{
                        mCurrentPosition <= testSize && !repeating ->{
                            //Garantir que a pergunta aleatória não foi já feita
                            do {
                                rnd = (0..mQuestionsList!!.size-1).random()
                            } while (numbers?.contains(rnd) == true)
                            numbers?.add(rnd)

                            ivimage.visibility = View.GONE
                            btnsubmit.setEnabled(false);
                            setQuestion(rnd)
                        }else ->{
                            mCurrentPosition = testSize - repeat_numbers?.size!! + 1
                            if((repeat_numbers?.size ==  0)) {
                                val intent = Intent(this, ResultActivity::class.java)
                                intent.putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswers)
                                intent.putExtra(Constants.TOTAL_QUESTIONS, testSize)
                                numbers?.clear() //Limpar lista de perguntas
                                repeat_numbers?.clear()
                                repeating = false
                                startActivity(intent)
                                finish()
                            } else {
                                repeating = true

                                repeat_numbers?.let { setQuestion(it.first()) }
                            }
                        }
                    }
                }else{
                    Log.d("list", numbers.toString());
                    val question: Question = if(!repeating){
                        numbers?.let { mQuestionsList?.get(it.last()) }!!
                    } else {
                        repeat_numbers?.let { mQuestionsList?.get(it.first()) }!!
                    }

                    if(question!!.correctAnswer != mSelectedOptionPosition){

                        if(!repeating) {
                            numbers?.let { repeat_numbers?.add(it.last()) }
                        }
                        answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                    } else {
                        if(repeating) {
                            repeat_numbers?.removeFirst()
                        } else {
                            mCorrectAnswers++
                        }
                    }
                    answerView(question.correctAnswer, R.drawable.correct_option_border_bg)

                    if(mCurrentPosition == testSize){
                        btnsubmit.text = "Terminar"
                    }else{
                        btnsubmit.text = "Continuar"
                    }
                    mSelectedOptionPosition = 0
                }
            }
        }

    }

    private fun answerView(answer: Int, drawableView: Int){

        val tvoptionone: TextView = findViewById(R.id.tv_option_one)
        val tvoptiontwo: TextView = findViewById(R.id.tv_option_two)
        val tvoptionthree: TextView = findViewById(R.id.tv_option_three)

        when(answer){
            1 ->{
                tvoptionone.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
            2 ->{
                tvoptiontwo.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
            3 ->{
                tvoptionthree.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
        }
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int){

        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_option_border_bg
        )
    }
}
