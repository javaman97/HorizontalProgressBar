package com.example.horizontalprogressbar

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val progressBar=findViewById<ProgressBar>(R.id.progressBar)
        progressBar.max=1000

        val currentProgress=600

        ObjectAnimator.ofInt(progressBar,"progress",currentProgress)
            .setDuration(2000)
            .start()

    }
}