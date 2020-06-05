package com.example.soosh.controller

import android.os.Bundle
import com.example.soosh.utlities.EXTRA_LEAGUE
import com.example.soosh.R

class SkillActivity : BaseActivity() {

    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE)

    }
}