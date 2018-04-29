package edu.rvc.student.rpgi

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup

class Main4Activity : AppCompatActivity() {

    lateinit var rgTactics : RadioGroup
    lateinit var btnTavern : RadioButton
    lateinit var btnDistance : RadioButton
    lateinit var btnFrontlines : RadioButton
    lateinit var btnHidden : RadioButton
    lateinit var btnMedic : RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        rgTactics = findViewById(R.id.rgTactics) as RadioGroup
        btnTavern = findViewById(R.id.btnTavern) as RadioButton
        btnDistance = findViewById(R.id.btnDistance) as RadioButton
        btnFrontlines = findViewById(R.id.btnFrontlines) as RadioButton
        btnHidden = findViewById(R.id.btnHidden) as RadioButton
        btnMedic = findViewById(R.id.btnMedic) as RadioButton

        var tactics = "No preferred battle tactics."

        //send info to page 5

        var txtName: String = intent.getStringExtra("txtName")
        var alignment: String = intent.getStringExtra("alignment")
        var weapon: String = intent.getStringExtra("weapon")

        val btnPage5 = findViewById<Button>(R.id.btnPage5)

        btnPage5.setOnClickListener(View.OnClickListener {

            if (rgTactics.checkedRadioButtonId != -1) {
                if (btnTavern.isChecked)
                    tactics = "No tactics; prefers wait for the fighting to end."
                if (btnDistance.isChecked)
                    tactics = "Prefers to attack from a safe distance."
                if (btnFrontlines.isChecked)
                    tactics = "Prefers to fight on the frontlines."
                if (btnHidden.isChecked)
                    tactics = "Prefers to remain hidden while awaiting an opportunity."
                if (btnMedic.isChecked)
                    tactics = "Prefers not to fight but to aid those in need."
            }

            val intent = Intent(this, Main5Activity::class.java)
            intent.putExtra("txtName", txtName)
            intent.putExtra("alignment", alignment)
            intent.putExtra("weapon", weapon)
            intent.putExtra("tactics", tactics)
            startActivity(intent)
        })

        //back button

        val btnBack = findViewById<Button>(R.id.btnBack)

        btnBack.setOnClickListener(View.OnClickListener {
            this.finish()
        })

    }
}
