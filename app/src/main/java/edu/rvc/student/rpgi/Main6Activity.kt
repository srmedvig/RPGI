package edu.rvc.student.rpgi


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main6.*


class Main6Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)


        var txtName: String = intent.getStringExtra("txtName")
        val txtCharacter = findViewById<TextView>(R.id.txtCharacter)
        txtCharacter.text = txtName


        val btnRestart = findViewById<Button>(R.id.btnRestart)
        btnRestart.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })

    }
}
