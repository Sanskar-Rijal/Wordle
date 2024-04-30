package com.example.wordle

import android.content.Context
import android.media.MediaPlayer
import android.provider.MediaStore.Audio.Media
import androidx.core.content.ContextCompat

object backgroundmusic {
    private var mediaPlayer:MediaPlayer?=null
    fun start(contex:Context , resid:Int)
    {
        if(mediaPlayer==null)
        {
            mediaPlayer=MediaPlayer.create(contex.applicationContext,resid)
            mediaPlayer?.start()
            mediaPlayer?.setVolume(0.2f,0.2f)
            mediaPlayer?.isLooping=true
        }
    }
    fun pause()
    {
        mediaPlayer?.pause()
    }
    fun resume()
    {
        mediaPlayer?.start()
    }
    fun stop()
    {
        mediaPlayer?.stop()
        mediaPlayer?.release()
        mediaPlayer=null
    }
}