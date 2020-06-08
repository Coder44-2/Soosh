package com.example.soosh.controller

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import com.example.soosh.Model.Player
import com.example.soosh.R
import com.example.soosh.utlities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("", "")

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        nextBtn.setOnClickListener {
            if (player.selectedLeague != "") {
                val skills = Intent(this, SkillActivity::class.java)
                skills.putExtra(EXTRA_PLAYER, player)
                startActivity(skills)
            }
            else {
                val popup = Toast.makeText(this, "Please select a league to continue.", Toast.LENGTH_LONG)
                popup.show()
            }
        }

        menToggleButton.setOnClickListener {
            womenToggleButton.isChecked = false
            coEdToggleButton.isChecked = false
            player.selectedLeague = "Mens"
        }

        womenToggleButton.setOnClickListener {
            menToggleButton.isChecked = false
            coEdToggleButton.isChecked = false
            player.selectedLeague = "Womens"
        }

        coEdToggleButton.setOnClickListener {
            menToggleButton.isChecked = false
            womenToggleButton.isChecked = false
            player.selectedLeague = "Co-ed"
        }

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null) {
            player = savedInstanceState.getParcelable<Player>(EXTRA_PLAYER)!!
        }
    }

}
