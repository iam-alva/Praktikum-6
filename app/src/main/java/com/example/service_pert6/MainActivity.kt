package com.example.service_pert6

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_fb.setOnClickListener( { val i = Intent(Intent.ACTION_VIEW, Uri.parse( "http://www.facebook.com/STMIK AKAKOM Yogyakarta 14 langitinspirasi"))
            startActivity(i)
        })

        button_ig.setOnClickListener({ val i=Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com/langitinspirasi.co.id"))
            startActivity(i)
        })

        //Mendeklarasikan variabel MediaPlayer dan memanggil data mp3
        var MediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.dangdut)
        button_play.setOnClickListener { MediaPlayer?.start()
        }

        button_pause.setOnClickListener { MediaPlayer?.pause()
        }

        button_stop.setOnClickListener { MediaPlayer?.pause()
            MediaPlayer?.seekTo(0)}
    }
}
