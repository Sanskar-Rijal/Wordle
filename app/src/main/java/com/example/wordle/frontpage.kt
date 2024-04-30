package com.example.wordle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.wordle.databinding.ActivityFrontpageBinding
import com.example.wordle.databinding.ActivityMainBinding

class frontpage : AppCompatActivity() {
    private var binding:ActivityFrontpageBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        backgroundmusic.start(this,R.raw.premireupdated)
        super.onCreate(savedInstanceState)
       supportActionBar?.hide()
        binding=ActivityFrontpageBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        binding?.buttonstart?.setOnClickListener {
            if(binding?.textEntered?.text!!.isNotEmpty())
            {
                val change =Intent(this,MainActivity::class.java)
                change.putExtra(constants.user_name,binding?.textEntered?.text.toString())
                startActivity(change)
                finish()
            }
            else
            {
                Toast.makeText(this,"Enter your name and click Start",Toast.LENGTH_SHORT).show()
            }
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
    override fun onDestroy() {
        super.onDestroy()
        binding=null
    }
}