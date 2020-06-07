package com.example.soosh.controller

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.example.soosh.Model.Player
import com.example.soosh.R
import com.example.soosh.utlities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        finishBtn.setOnClickListener {
            if (player?.category != "") {
                val finished = Intent(this, FinishedActivity::class.java)
                finished.putExtra(EXTRA_PLAYER, player)
                startActivity(finished)
            }
            else {
                val popup = Toast.makeText(this, "Please select a category to continue.", Toast.LENGTH_LONG)
                popup.show()
            }
        }

        beginnerButton.setOnClickListener {
            ballerButton.isChecked = false
            player?.category = "Beginner"
        }

        ballerButton.setOnClickListener {
            beginnerButton.isChecked = false
            player?.category = "Baller"
        }

    }
}