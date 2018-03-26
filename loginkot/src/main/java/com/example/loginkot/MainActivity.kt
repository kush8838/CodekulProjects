package com.example.loginkot

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BtnOk.setOnClickListener {
            var name=etUserName.text.toString()
            var pass=etPass.text.toString()
            if (name==pass) {
                etRes.setText("Success")
            }
            else {
                etRes.setText("Fail")
            }
        }
    }
}
