package com.example.soosh.controller

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.example.soosh.utlities.EXTRA_LEAGUE
import com.example.soosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        nextBtn.setOnClickListener {
            if (selectedLeague != "") {
                val skills = Intent(this, SkillActivity::class.java)
                skills.putExtra(EXTRA_LEAGUE, selectedLeague)
                startActivity(skills)
            }
            else {
                val popup = Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT)
                popup.show()
            }
        }

        menToggleButton.setOnClickListener {
            womenToggleButton.isChecked = false
            coEdToggleButton.isChecked = false
            selectedLeague = "Mens"
        }

        womenToggleButton.setOnClickListener {
            menToggleButton.isChecked = false
            coEdToggleButton.isChecked = false
            selectedLeague = "Womens"
        }

        coEdToggleButton.setOnClickListener {
            menToggleButton.isChecked = false
            womenToggleButton.isChecked = false
            selectedLeague = "Co-ed"
        }

    }
}
