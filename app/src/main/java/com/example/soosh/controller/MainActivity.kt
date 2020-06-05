package com.example.soosh.controller

import android.content.Intent
import android.os.Bundle
import com.example.soosh.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getStartedBtn.setOnClickListener {
            val leagueIntnt = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntnt)
        }

    }
}
