package com.mic.hw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MCActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mcdonald_layout)
        findViewById<ImageView>(R.id.iv_backarrow).setOnClickListener{
            val intent= Intent(this,MainActivity::class.java)

            startActivity(intent)
        }
    }
}
