package edu.rvc.student.rpgi

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_main6.view.*

class Main3Activity : AppCompatActivity() {

    lateinit var rgWeaponry : RadioGroup
    lateinit var btnLight : RadioButton
    lateinit var btnHeavy : RadioButton
    lateinit var btnRanged : RadioButton
    lateinit var btnUnarmed : RadioButton
    lateinit var btnLover : RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        rgWeaponry = findViewById(R.id.rgWeaponry) as RadioGroup
        btnLight = findViewById(R.id.btnLight) as RadioButton
        btnHeavy = findViewById(R.id.btnHeavy) as RadioButton
        btnRanged = findViewById(R.id.btnRanged) as RadioButton
        btnUnarmed = findViewById(R.id.btnUnarmed) as RadioButton
        btnLover = findViewById(R.id.btnLover) as RadioButton

        var weapon = "No weaponry selected."

        //send info to page 4

        var txtName: String = intent.getStringExtra("txtName")
        var alignment: String = intent.getStringExtra("alignment")

        val btnPage4 = findViewById<Button>(R.id.btnPage4)

        btnPage4.setOnClickListener(View.OnClickListener {

            if (rgWeaponry.checkedRadioButtonId != -1) {
                if (btnLight.isChecked)
                    weapon = "Light melee weaponry specialist."
                if (btnHeavy.isChecked)
                    weapon = "Heavy melee weaponry specialist."
                if (btnRanged.isChecked)
                    weapon = "Ranged weapons specialist."
                if (btnUnarmed.isChecked)
                    weapon = "Unarmed combat specialist."
                if (btnLover.isChecked)
                    weapon = "Not a capable fighter."
            }

            val intent = Intent(this, Main4Activity::class.java)
            intent.putExtra("txtName", txtName)
            intent.putExtra("alignment", alignment)
            intent.putExtra("weapon", weapon)
            startActivity(intent)
        })

        //back button

        val btnBack = findViewById<Button>(R.id.btnBack)

        btnBack.setOnClickListener(View.OnClickListener {
            this.finish()
        })

    }

}
