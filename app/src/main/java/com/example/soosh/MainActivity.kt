package com.example.soosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
