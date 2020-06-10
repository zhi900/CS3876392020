package com.example.hellotoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    public void showToast(view: View) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                                                    Toast.LENGTH_SHORT);
    }
    public void countUp(view: View) {

    }
}