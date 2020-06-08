package com.example.soosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.soosh.Model.Player
import com.example.soosh.R
import com.example.soosh.utlities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finished.*

class FinishedActivity : BaseActivity() {

    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finished)

        player = intent.getParcelableExtra(EXTRA_PLAYER)
        searchTxt.text = "Looking for a ${player.selectedLeague?.toLowerCase()} ${player.category?.toLowerCase()} league near you."

    }
}