package com.example.mydiet

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class ResultActivity : AppCompatActivity() {

   companion object fun newIntent(intent: Intent, context: Context):Intent{
        return Intent(context, ResultActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
    }
}
