package com.example.wordle

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.media.AudioManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.speech.tts.TextToSpeech
import android.text.Editable
import android.text.TextWatcher
import android.text.WordSegmentFinder
import android.util.Log
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.example.wordle.databinding.ActivityMainBinding
import org.w3c.dom.Text
import java.util.Locale

class MainActivity : AppCompatActivity(), TextToSpeech.OnInitListener {
    private var binding :ActivityMainBinding?=null
    //bug fix for text to speech
    private var count:Int=0
    private var arraylistofquestions:ArrayList<questions>?=null
    private var hint:String?=null
    private  var WORD:String=""
    private var bugfix:Boolean=true
    /**
     * using google text to speech for hints
     */
    private var tts:TextToSpeech?=null
    //getting name of user
    private var musername:String?=null

    /** writting code for timer
     */
    private var resetTimer:CountDownTimer?=null
    private var resetProgress:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        arraylistofquestions=constants.getquestions()
        if(bugfix) {
            selectWord()
           // bugfix=false
        }
        musername=intent.getStringExtra(constants.user_name)
        /**
         * implementing tts in mainactivit
         */
        tts= TextToSpeech(this,this)
        makeGameInactive()
        binding?.mat11?.isEnabled=true
        binding?.mat12?.isEnabled=true
        binding?.mat13?.isEnabled=true
        binding?.mat14?.isEnabled=true
        binding?.mat15?.isEnabled=true
        binding?.mat11?.requestFocus()
        keeppassingfocus()

        binding?.mat15?.addTextChangedListener {
            validateRow(binding?.mat11,binding?.mat12,binding?.mat13,
                binding?.mat14,binding?.mat15)
            binding?.mat11?.isEnabled=false
            binding?.mat12?.isEnabled=false
            binding?.mat13?.isEnabled=false
            binding?.mat14?.isEnabled=false
            binding?.mat15?.isEnabled=false
        }
        binding?.mat25?.addTextChangedListener {
            validateRow(binding?.mat21,binding?.mat22,binding?.mat23,
                binding?.mat24,binding?.mat25)
            binding?.mat21?.isEnabled=false
            binding?.mat22?.isEnabled=false
            binding?.mat23?.isEnabled=false
            binding?.mat24?.isEnabled=false
            binding?.mat25?.isEnabled=false
        }
        binding?.mat35?.addTextChangedListener {
            validateRow(binding?.mat31,binding?.mat32,binding?.mat33,
                binding?.mat34,binding?.mat35)
            binding?.mat31?.isEnabled=false
            binding?.mat32?.isEnabled=false
            binding?.mat33?.isEnabled=false
            binding?.mat34?.isEnabled=false
            binding?.mat35?.isEnabled=false
        }
        binding?.mat45?.addTextChangedListener {
            validateRow(binding?.mat41,binding?.mat42,binding?.mat43,
                binding?.mat44,binding?.mat45)
            binding?.mat41?.isEnabled=false
            binding?.mat42?.isEnabled=false
            binding?.mat43?.isEnabled=false
            binding?.mat44?.isEnabled=false
            binding?.mat45?.isEnabled=false
        }
        binding?.mat55?.addTextChangedListener {
            validateRow(binding?.mat51,binding?.mat52,binding?.mat53,
                binding?.mat54,binding?.mat55)
            binding?.mat51?.isEnabled=false
            binding?.mat52?.isEnabled=false
            binding?.mat53?.isEnabled=false
            binding?.mat54?.isEnabled=false
            binding?.mat55?.isEnabled=false
        }
        binding?.mat65?.addTextChangedListener {
            validateRow(binding?.mat61,binding?.mat62,binding?.mat63,
                binding?.mat64,binding?.mat65)
            binding?.mat61?.isEnabled=false
            binding?.mat62?.isEnabled=false
            binding?.mat63?.isEnabled=false
            binding?.mat64?.isEnabled=false
            binding?.mat65?.isEnabled=false
        }
    }
    override fun onPause() {
        super.onPause()
        backgroundmusic.pause()
    }

    override fun onResume() {
        super.onResume()
        backgroundmusic.resume()
    }
    private fun keeppassingfocus()
    {
        //for first row
        passFocusToNextEditText(binding?.mat11,binding?.mat12)
        passFocusToNextEditText(binding?.mat12,binding?.mat13)
        passFocusToNextEditText(binding?.mat13,binding?.mat14)
        passFocusToNextEditText(binding?.mat14,binding?.mat15)

        //for second row
        passFocusToNextEditText(binding?.mat21,binding?.mat22)
        passFocusToNextEditText(binding?.mat22,binding?.mat23)
        passFocusToNextEditText(binding?.mat23,binding?.mat24)
        passFocusToNextEditText(binding?.mat24,binding?.mat25)
        //for third row
        passFocusToNextEditText(binding?.mat31,binding?.mat32)
        passFocusToNextEditText(binding?.mat32,binding?.mat33)
        passFocusToNextEditText(binding?.mat33,binding?.mat34)
        passFocusToNextEditText(binding?.mat34,binding?.mat35)
        //for fourth row
        passFocusToNextEditText(binding?.mat41,binding?.mat42)
        passFocusToNextEditText(binding?.mat42,binding?.mat43)
        passFocusToNextEditText(binding?.mat43,binding?.mat44)
        passFocusToNextEditText(binding?.mat44,binding?.mat45)
        //for fifth row
        passFocusToNextEditText(binding?.mat51,binding?.mat52)
        passFocusToNextEditText(binding?.mat52,binding?.mat53)
        passFocusToNextEditText(binding?.mat53,binding?.mat54)
        passFocusToNextEditText(binding?.mat54,binding?.mat55)
        //fort sixth row
        passFocusToNextEditText(binding?.mat61,binding?.mat62)
        passFocusToNextEditText(binding?.mat62,binding?.mat63)
        passFocusToNextEditText(binding?.mat63,binding?.mat64)
        passFocusToNextEditText(binding?.mat64,binding?.mat65)
    }
    private fun passFocusToNextEditText(
        edt1:EditText?,edt2:EditText?
    )
    {
        edt1?.addTextChangedListener(object :TextWatcher
        {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

            override fun afterTextChanged(s: Editable?) {
                if(s?.length==1)
                {
                    edt2?.requestFocus()
                }
            }

        })
        edt2?.setOnKeyListener { _, keyCode, event ->
            if (keyCode == KeyEvent.KEYCODE_DEL && event.action == KeyEvent.ACTION_DOWN && edt2.text.isEmpty())
            {
                edt1?.requestFocus()
                return@setOnKeyListener true // Consume the event
            }
            false // Let the event propagate if not backspace
        }
    }
    private fun selectWord() {
        val displayQuestion: questions = arraylistofquestions!!.random()
        WORD = displayQuestion.question
        hint = displayQuestion.hint
    }
    private fun validateRow
                (edt1:EditText?,
                 edt2:EditText?,
                 edt3:EditText?,
                 edt4:EditText?,
                 edt5:EditText?)
    {
        bugfix=false
        count++
        //setting up questions
        val edt1Text=edt1?.text.toString().uppercase()
        val edt2Text=edt2?.text.toString().uppercase()
        val edt3Text=edt3?.text.toString().uppercase()
        val edt4Text=edt4?.text.toString().uppercase()
        val edt5Text=edt5?.text.toString().uppercase()
        val word1= WORD[0].toString().uppercase()
        val word2= WORD[1].toString().uppercase()
        val word3= WORD[2].toString().uppercase()
        val word4= WORD[3].toString().uppercase()
        val word5= WORD[4].toString().uppercase()
        /*
       grey when wrong ->#3a3a3c
       yellow:b59f3b
       green:#538d4e
         */
        when (edt1Text) {
            word1 -> {
                edt1?.setBackgroundColor(Color.parseColor("#538d4e"))
            }
            word2, word3, word4, word5 -> {
                edt1?.setBackgroundColor(Color.parseColor("#b59f3b"))
            }
            else -> {
                edt1?.setBackgroundColor(Color.parseColor("#3a3a3c"))
            }
        }
        when (edt2Text) {
            word2 -> {
                edt2?.setBackgroundColor(Color.parseColor("#538d4e"))
            }
            word1, word3, word4, word5 -> {
                edt2?.setBackgroundColor(Color.parseColor("#b59f3b"))
            }
            else -> {
                edt2?.setBackgroundColor(Color.parseColor("#3a3a3c"))
            }
        }
        when (edt3Text) {
            word3 -> {
                edt3?.setBackgroundColor(Color.parseColor("#538d4e"))
            }
            word1, word2, word4, word5 -> {
                edt3?.setBackgroundColor(Color.parseColor("#b59f3b"))
            }
            else -> {
                edt3?.setBackgroundColor(Color.parseColor("#3a3a3c"))
            }
        }
        /**
         *  if(edt3Text==word1 ||
         *             edt3Text==word2 ||
         *             edt3Text==word4 ||
         *             edt3Text==word5)
         *         {
         *             edt3?.setBackgroundColor(Color.parseColor("#ffff00"))
         *         }
         *
         *         else if(edt3Text==word3)
         *         {
         *             edt3?.setBackgroundColor(Color.parseColor("#33cc33"))
         *         }
         *         else
         *         {
         *             edt3?.setBackgroundColor(Color.parseColor("#ff4d6d"))
         *         }
         */
        when (edt4Text) {
            word4 -> {
                edt4?.setBackgroundColor(Color.parseColor("#538d4e"))
            }
            word1, word3, word2, word5 -> {
                edt4?.setBackgroundColor(Color.parseColor("#b59f3b"))
            }
            else -> {
                edt4?.setBackgroundColor(Color.parseColor("#3a3a3c"))
            }
        }
        when (edt5Text) {
            word5 -> {
                edt5?.setBackgroundColor(Color.parseColor("#538d4e"))
            }
            word1, word3, word4, word2 -> {
                edt5?.setBackgroundColor(Color.parseColor("#b59f3b"))
            }
            else -> {
                edt5?.setBackgroundColor(Color.parseColor("#3a3a3c"))
            }
        }
        if(edt1Text ==word1 &&
            edt2Text==word2 &&
            edt3Text==word3 &&
            edt4Text==word4 &&
            edt5Text==word5)
        {
            binding?.lastMessage?.text= "Congratulations $musername,You guessed the word $WORD correctly."
            binding?.lastMessage?.visibility=View.VISIBLE
            Toast.makeText(this,"Chill for a sec. Once the timer's done, you're back in the game",Toast.LENGTH_LONG).show()
            //make gameinactive
            makeGameInactive()
            binding?.flLayout?.visibility=View.VISIBLE
            setupResetView()
            count=6
            return
        }
        if(count<6) {
            speakOut("Your guess was incorrect, so I will give you a hint. The meaning of the word is" + "$hint")
            moveCursorToNextEditText(edt5)
        }
        if(edt5?.id==R.id.mat_65)
        {
            binding?.lastMessage?.text= "$musername you lost,the word was $WORD"
            binding?.lastMessage?.visibility=View.VISIBLE
            Toast.makeText(this,"Chill for a sec. Once the timer's done, you're back in the game",Toast.LENGTH_LONG).show()
            //make gameinactive
            binding?.flLayout?.visibility=View.VISIBLE
            setupResetView()
        }
    }

    /**
     * function that moves the cursor to next postion when the row ends and the
     * guessed option is wrong.
     */
    private fun moveCursorToNextEditText(next:EditText?)
    {
        when (next?.id) {
            R.id.mat15 -> {
                binding?.mat21?.isEnabled=true
                binding?.mat22?.isEnabled=true
                binding?.mat23?.isEnabled=true
                binding?.mat24?.isEnabled=true
                binding?.mat25?.isEnabled=true
                binding?.mat21?.requestFocus()//goes to mat21
            }
            R.id.mat_25-> {
                binding?.mat31?.isEnabled=true
                binding?.mat32?.isEnabled=true
                binding?.mat33?.isEnabled=true
                binding?.mat34?.isEnabled=true
                binding?.mat35?.isEnabled=true
                binding?.mat31?.requestFocus()
            }
            R.id.mat_35-> {
                binding?.mat41?.isEnabled=true
                binding?.mat42?.isEnabled=true
                binding?.mat43?.isEnabled=true
                binding?.mat44?.isEnabled=true
                binding?.mat45?.isEnabled=true
                binding?.mat41?.requestFocus()
            }
            R.id.mat_45-> {
                binding?.mat51?.isEnabled=true
                binding?.mat52?.isEnabled=true
                binding?.mat53?.isEnabled=true
                binding?.mat54?.isEnabled=true
                binding?.mat55?.isEnabled=true
                binding?.mat51?.requestFocus()
            }
            R.id.mat_55-> {
                binding?.mat61?.isEnabled=true
                binding?.mat62?.isEnabled=true
                binding?.mat63?.isEnabled=true
                binding?.mat64?.isEnabled=true
                binding?.mat65?.isEnabled=true
                binding?.mat61?.requestFocus()
            }
            // Add similar cases for other rows
        }
    }
    private fun makeGameInactive()
    {
        binding?.mat11?.isEnabled=false
        binding?.mat12?.isEnabled=false
        binding?.mat13?.isEnabled=false
        binding?.mat14?.isEnabled=false
        binding?.mat15?.isEnabled=false

        binding?.mat21?.isEnabled=false
        binding?.mat22?.isEnabled=false
        binding?.mat23?.isEnabled=false
        binding?.mat24?.isEnabled=false
        binding?.mat25?.isEnabled=false

        binding?.mat31?.isEnabled=false
        binding?.mat32?.isEnabled=false
        binding?.mat33?.isEnabled=false
        binding?.mat34?.isEnabled=false
        binding?.mat35?.isEnabled=false

        binding?.mat41?.isEnabled=false
        binding?.mat42?.isEnabled=false
        binding?.mat43?.isEnabled=false
        binding?.mat44?.isEnabled=false
        binding?.mat45?.isEnabled=false

        binding?.mat51?.isEnabled=false
        binding?.mat52?.isEnabled=false
        binding?.mat53?.isEnabled=false
        binding?.mat54?.isEnabled=false
        binding?.mat55?.isEnabled=false

        binding?.mat61?.isEnabled=false
        binding?.mat62?.isEnabled=false
        binding?.mat63?.isEnabled=false
        binding?.mat64?.isEnabled=false
        binding?.mat65?.isEnabled=false
    }
    //destroying since we used bindings
    override fun onDestroy() {
        super.onDestroy()
        if(tts !=null)
        {
            tts?.stop()
            tts?.shutdown()
        }
        if(resetTimer!=null)
        {
            resetTimer?.cancel()
            resetProgress=0
        }
        binding=null
    }

    override fun onInit(status: Int) {
        if(status== TextToSpeech.SUCCESS) {
            val result = tts!!.setLanguage(Locale.ENGLISH)
            if (result == TextToSpeech.LANG_MISSING_DATA ||
                result == TextToSpeech.LANG_NOT_SUPPORTED
            ) {
                Log.e("TTS", "The language specified is not supported")
            }
            tts?.setSpeechRate(0.8f)
        }
        else
        {
            Log.e("TTS","initialization failed")
        }
    }
    private fun speakOut(text:String)
    {
        tts?.speak(text,TextToSpeech.QUEUE_FLUSH,null,"")
    }
    /**
     * setting up functions for timers
     */
    private fun setupResetView()
    {
        if(resetTimer !=null)
        {
            resetTimer?.cancel()
            resetProgress=0
        }
        setRestProgressBar()
    }
    private fun setRestProgressBar()
    {
        binding?.progressbar?.progress=resetProgress
        resetTimer=object :CountDownTimer(10000,1000)
        {
            override fun onTick(millisUntilFinished: Long) {
                binding?.progressbar?.progress=10-resetProgress
                binding?.tvTimer?.text=(10-resetProgress).toString()
                resetProgress++
            }

            override fun onFinish() {
                val intent =Intent(this@MainActivity,frontpage::class.java)
                startActivity(intent)
                finish()
            }

        }.start()
    }
}