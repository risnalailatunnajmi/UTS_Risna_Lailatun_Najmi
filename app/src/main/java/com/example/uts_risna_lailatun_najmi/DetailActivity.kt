package com.example.uts_risna_lailatun_najmi

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val nabi = intent.getParcelableExtra<Nabi>(MainActivity.INTENT_PARCELABLE)

        val nameNabi = findViewById<TextView>(R.id.tv_name)
        val detNabi = findViewById<TextView>(R.id.tv_detail)

        nameNabi.text = nabi?.tv_name
        detNabi.text = nabi?.tv_detail
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}