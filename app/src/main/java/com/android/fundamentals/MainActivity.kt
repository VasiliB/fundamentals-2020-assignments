package com.android.fundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.fundamentals.workshop01.WS01ActorsFragment
import com.android.fundamentals.workshop02.WS02ActorsFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    // TODO: Change fragment according to the workshop #
                    .replace(R.id.container, WS02ActorsFragment.newInstance())
                    .commit()
        }
    }
}