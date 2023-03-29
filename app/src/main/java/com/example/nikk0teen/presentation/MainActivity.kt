package com.example.nikk0teen.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.nikk0teen.R
import com.example.nikk0teen.presentation.fragments.MainFragment

//import com.example.nikk0teen.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(
            R.id.fragmentContainer,
            MainFragment()
        ).commit()
    }

}