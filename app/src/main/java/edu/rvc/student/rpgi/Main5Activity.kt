package edu.rvc.student.rpgi

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import edu.rvc.student.rpgi.R.drawable.tactics
import kotlinx.android.synthetic.main.activity_main4.*

class Main5Activity : AppCompatActivity() {

    lateinit var rgMagic : RadioGroup
    lateinit var btnHoly : RadioButton
    lateinit var btnElemental : RadioButton
    lateinit var btnDark : RadioButton
    lateinit var btnHealing : RadioButton
    lateinit var btnMusic : RadioButton
    lateinit var btnNone : RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        rgMagic = findViewById(R.id.rgMagic) as RadioGroup
        btnHoly = findViewById(R.id.btnHoly) as RadioButton
        btnElemental = findViewById(R.id.btnElemental) as RadioButton
        btnDark = findViewById(R.id.btnDark) as RadioButton
        btnHealing = findViewById(R.id.btnHealing) as RadioButton
        btnMusic = findViewById(R.id.btnMusic) as RadioButton
        btnNone = findViewById(R.id.btnNone) as RadioButton

        var magic = "Not proficient at any particular type of magic."

        //send info to page 6

        var txtName: String = intent.getStringExtra("txtName")
        var alignment: String = intent.getStringExtra("alignment")
        var weapon: String = intent.getStringExtra("weapon")
        var tactics: String = intent.getStringExtra("tactics")

        val btnFinish = findViewById<Button>(R.id.btnFinish)

        btnFinish.setOnClickListener(View.OnClickListener {

            if (rgMagic.checkedRadioButtonId != -1) {
                if (btnHoly.isChecked)
                    magic = "Proficient with holy magic."
                if (btnElemental.isChecked)
                    magic = "Proficient with elemental magic."
                if (btnDark.isChecked)
                    magic = "Proficient with black magic."
                if (btnHealing.isChecked)
                    magic = "Proficient with the art of healing."
                if (btnMusic.isChecked)
                    magic = "Casts magic through music and song."
                if (btnNone.isChecked)
                    magic = "Not proficient at any particular type of magic."
            }

            val intent = Intent(this, Main6Activity::class.java)
            intent.putExtra("txtName", txtName)
            intent.putExtra("alignment", alignment)
            intent.putExtra("weapon", weapon)
            intent.putExtra("tactics", tactics)
            intent.putExtra("magic", magic)
            startActivity(intent)
        })

        //back button

        val btnBack = findViewById<Button>(R.id.btnBack)

        btnBack.setOnClickListener(View.OnClickListener {
            this.finish()
        })

    }
}
