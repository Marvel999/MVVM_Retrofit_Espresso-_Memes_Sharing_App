package com.marvel999.memoapp.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.core.os.postDelayed
import com.marvel999.memoapp.R

class MainActivity : AppCompatActivity() {
    private val splashScreenTime=2000L;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed({
            val intent =Intent(this,MemesPage::class.java)
            startActivity(intent);
            finish();
        },splashScreenTime)

    }
}