package edu.rvc.student.rpgi

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
//new imports
import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnBegin = findViewById<Button>(R.id.btnBegin)
        val txtName = findViewById<EditText>(R.id.txtName)

        btnBegin.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("SendName", txtName.text.toString())
            startActivity(intent)
        })


    }
}
