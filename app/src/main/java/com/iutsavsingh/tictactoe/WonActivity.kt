package com.iutsavsingh.tictactoe

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Window
import android.view.WindowManager
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_won.*

class WonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.requestFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_won)

        val bundle = intent.extras
        var player: String = ""
        if (bundle != null) {
            player = bundle.getString("player")!!
        }

        if (player == "Tie") {
            textViewWon.text = "Match Tie!"
        } else {
            textViewWon.text = "${player} Won the Match!"
        }

        val anim = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom)
        textViewWon.startAnimation(anim)

        Handler(Looper.myLooper()!!).postDelayed({
            onBackPressed()
            finish()
        }, 2500)
    }
}