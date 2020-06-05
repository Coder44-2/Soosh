package com.example.soosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.soosh.R
import com.example.soosh.utlities.EXTRA_CATEGORY
import com.example.soosh.utlities.EXTRA_LEAGUE
import kotlinx.android.synthetic.main.activity_finished.*

class FinishedActivity : BaseActivity() {

    var selectedLeague = ""
    var category = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finished)

        selectedLeague = intent.getStringExtra(EXTRA_LEAGUE)
        category = intent.getStringExtra(EXTRA_CATEGORY)
        searchTxt.text = "Looking for a ${selectedLeague.toLowerCase()} ${category.toLowerCase()} league near you."
    }
}