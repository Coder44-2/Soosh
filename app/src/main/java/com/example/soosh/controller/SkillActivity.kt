package com.example.soosh.controller

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.example.soosh.utlities.EXTRA_LEAGUE
import com.example.soosh.R
import com.example.soosh.utlities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var category = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE)

        finishBtn.setOnClickListener {
            if (category != "") {
                var finished = Intent(this, FinishedActivity::class.java)
                finished.putExtra(EXTRA_LEAGUE, league)
                finished.putExtra(EXTRA_CATEGORY, category)
                startActivity(finished)
            }
            else {
                val popup = Toast.makeText(this, "Please select a category to continue.", Toast.LENGTH_LONG)
                popup.show()
            }
        }

        beginnerButton.setOnClickListener {
            ballerButton.isChecked = false
            category = "Beginner"
        }

        ballerButton.setOnClickListener {
            beginnerButton.isChecked = false
            category = "Baller"
        }

    }
}