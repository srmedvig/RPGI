package edu.rvc.student.rpgi


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


class Main6Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        //name

        var txtName: String = intent.getStringExtra("txtName")
        val txtCharacter = findViewById<TextView>(R.id.txtCharacter)
        txtCharacter.text = txtName

        //alignment

        var alignment: String = intent.getStringExtra("alignment")
        val txtAlignment = findViewById<TextView>(R.id.txtAlignment)
        txtAlignment.text = alignment

        //weapon

        var weapon: String = intent.getStringExtra("weapon")
        val txtWeapon = findViewById<TextView>(R.id.txtWeapon)
        txtWeapon.text = weapon

        //tactics

        var tactics: String = intent.getStringExtra("tactics")
        val txtTactics = findViewById<TextView>(R.id.txtTactics)
        txtTactics.text = tactics

        //magic

        var magic: String = intent.getStringExtra("magic")
        val txtMagic = findViewById<TextView>(R.id.txtMagic)
        txtMagic.text = magic

        //restart

        val btnRestart = findViewById<Button>(R.id.btnRestart)
        btnRestart.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })

    }
}
