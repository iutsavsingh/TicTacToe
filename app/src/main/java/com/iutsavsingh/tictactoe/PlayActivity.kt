package com.iutsavsingh.tictactoe

import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_play.*

class PlayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.requestFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_play)

        val anim = AnimationUtils.loadAnimation(applicationContext, R.anim.move)
        txtGameOn.startAnimation(anim)

        var chance = "X"
        var board = arrayListOf<String>("", "", "", "", "", "", "", "", "")

        button0.setOnClickListener {
            if (board[0] != "")
            else if (chance == "X") {
                button0.text = "X"
                button0.setTextColor(resources.getColor(R.color.white))
                chance = "O"
                board[0] = "X"
            } else {
                button0.text = "O"
                button0.setTextColor(resources.getColor(R.color.white))
                chance = "X"
                board[0] = "O"
            }
            resultOut(board)
        }

        button1.setOnClickListener {
            if (board[1] != "")
            else if (chance == "X") {
                button1.text = "X"
                button0.setTextColor(resources.getColor(R.color.white))
                board[1] = "X"
                chance = "O"
            } else {
                button1.text = "O"
                button0.setTextColor(resources.getColor(R.color.white))
                board[1] = "O"
                chance = "X"
            }
            resultOut(board)
        }

        button2.setOnClickListener {
            if (board[2] != "")
            else if (chance == "X") {
                button2.text = "X"
                button0.setTextColor(resources.getColor(R.color.white))
                board[2] = "X"
                chance = "O"
            } else {
                button2.text = "O"
                button0.setTextColor(resources.getColor(R.color.white))
                board[2] = "O"
                chance = "X"
            }
            resultOut(board)
        }

        button3.setOnClickListener {
            if (board[3] != "")
            else if (chance == "X") {
                button3.text = "X"
                button0.setTextColor(resources.getColor(R.color.white))
                board[3] = "X"
                chance = "O"
            } else {
                button3.text = "O"
                button0.setTextColor(resources.getColor(R.color.white))
                board[3] = "O"
                chance = "X"
            }
            resultOut(board)
        }

        button4.setOnClickListener {
            if (board[4] != "")
            else if (chance == "X") {
                button4.text = "X"
                button0.setTextColor(resources.getColor(R.color.white))
                board[4] = "X"
                chance = "O"
            } else {
                button4.text = "O"
                button0.setTextColor(resources.getColor(R.color.white))
                board[4] = "O"
                chance = "X"
            }
            resultOut(board)
        }

        button5.setOnClickListener {
            if (board[5] != "")
            else if (chance == "X") {
                button5.text = "X"
                button0.setTextColor(resources.getColor(R.color.white))
                board[5] = "X"
                chance = "O"
            } else {
                button5.text = "O"
                button0.setTextColor(resources.getColor(R.color.white))
                board[5] = "O"
                chance = "X"
            }
            resultOut(board)
        }

        button6.setOnClickListener {
            if (board[6] != "")
            else if (chance == "X") {
                button6.text = "X"
                button0.setTextColor(resources.getColor(R.color.white))
                board[6] = "X"
                chance = "O"
            } else {
                button6.text = "O"
                button0.setTextColor(resources.getColor(R.color.white))
                board[6] = "O"
                chance = "X"
            }
            resultOut(board)
        }

        button7.setOnClickListener {
            if (board[7] != "")
            else if (chance == "X") {
                button7.text = "X"
                button0.setTextColor(resources.getColor(R.color.white))
                board[7] = "X"
                chance = "O"
            } else {
                button7.text = "O"
                button0.setTextColor(resources.getColor(R.color.white))
                board[7] = "O"
                chance = "X"
            }
            resultOut(board)
        }

        button8.setOnClickListener {
            if (board[8] != "")
            else if (chance == "X") {
                button8.text = "X"
                button0.setTextColor(resources.getColor(R.color.white))
                board[8] = "X"
                chance = "O"
            } else {
                button8.text = "O"
                button0.setTextColor(resources.getColor(R.color.white))
                board[8] = "O"
                chance = "X"
            }
            resultOut(board)
        }

        buttonReset.setOnClickListener {
            startActivity(Intent(this, PlayActivity::class.java))
            finish()
        }

        imgBack.setOnClickListener {
            finish()
        }
    }

    private fun resultOut(board: ArrayList<String>) {
        if (result(board, "X")) {
            val intent = Intent(this, WonActivity::class.java)
            intent.putExtra("player", "X")
            startActivity(intent)
            finish()
        } else if (result(board, "O")) {
            val intent = Intent(this, WonActivity::class.java)
            intent.putExtra("player", "O")
            startActivity(intent)
            finish()
        } else if (isBoardFull(board)) {
            val intent = Intent(this, WonActivity::class.java)
            intent.putExtra("player", "Tie")
            startActivity(intent)
            finish()
        }
    }

    private fun isBoardFull(board: ArrayList<String>): Boolean {
        for (i in board) {
            if (i != "X" && i != "O")
                return false
        }
        return true
    }

    private fun result(board: ArrayList<String>, s: String): Boolean =
        if (board[0] == s && board[1] == s && board[2] == s) true
        else if (board[3] == s && board[4] == s && board[5] == s) true
        else if (board[6] == s && board[7] == s && board[8] == s) true
        else if (board[0] == s && board[3] == s && board[6] == s) true
        else if (board[1] == s && board[4] == s && board[7] == s) true
        else if (board[2] == s && board[5] == s && board[8] == s) true
        else if (board[0] == s && board[4] == s && board[8] == s) true
        else board[2] == s && board[4] == s && board[6] == s

}