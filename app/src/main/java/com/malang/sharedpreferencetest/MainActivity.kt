package com.malang.sharedpreferencetest

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("data", Preferences.data)

        saveButton.setOnClickListener {
            if (testEdit.text.toString().isBlank())
                Toast.makeText(this, "비어있음.", Toast.LENGTH_LONG).show()
            else {
                Preferences.data = testEdit.text.toString()
                Toast.makeText(this, Preferences.data, Toast.LENGTH_LONG).show()
            }
        }
    }
}