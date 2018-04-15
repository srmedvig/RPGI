package edu.rvc.student.rpgi

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Main5Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)


        //send character name to page 6

        var txtName: String = intent.getStringExtra("txtName")
        val btnFinish = findViewById<Button>(R.id.btnFinish)

        btnFinish.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Main6Activity::class.java)
            intent.putExtra("txtName", txtName)
            startActivity(intent)
        })

        //back button

        val btnBack = findViewById<Button>(R.id.btnBack)

        btnBack.setOnClickListener(View.OnClickListener {
            this.finish()
        })

    }
}
