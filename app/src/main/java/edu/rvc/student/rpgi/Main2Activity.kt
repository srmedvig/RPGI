package edu.rvc.student.rpgi

import android.content.Intent
import android.os.Build.VERSION_CODES.N
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup

class Main2Activity : AppCompatActivity() {

    lateinit var rgMorality : RadioGroup
    lateinit var btnGood : RadioButton
    lateinit var btnNeutral1 : RadioButton
    lateinit var btnEvil : RadioButton

    lateinit var rgEthics : RadioGroup
    lateinit var btnLawful : RadioButton
    lateinit var btnNeutral2 : RadioButton
    lateinit var btnChaotic : RadioButton

    lateinit var btnAlignment : Button
    lateinit var imgAlignment : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        rgMorality = findViewById(R.id.rgMorality) as RadioGroup
        btnGood = findViewById(R.id.btnGood) as RadioButton
        btnNeutral1 = findViewById(R.id.btnNeutral1) as RadioButton
        btnEvil = findViewById(R.id.btnEvil) as RadioButton

        rgEthics = findViewById(R.id.rgEthics) as RadioGroup
        btnLawful = findViewById(R.id.btnLawful) as RadioButton
        btnNeutral2 = findViewById(R.id.btnNeutral2) as RadioButton
        btnChaotic = findViewById(R.id.btnChaotic) as RadioButton

        btnAlignment = findViewById(R.id.btnAlignment) as Button
        imgAlignment = findViewById(R.id.imgAlignment) as ImageView

        var alignment = "No selected alignment."

        btnAlignment.setOnClickListener(View.OnClickListener {

            if (rgMorality.checkedRadioButtonId != -1 && rgEthics.checkedRadioButtonId != -1) {
                if (btnGood.isChecked && btnLawful.isChecked) {
                    imgAlignment.setImageResource(R.drawable.morality_lawfulgood)
                    alignment = "Lawful-Good"
                }
                if (btnGood.isChecked && btnNeutral2.isChecked) {
                    imgAlignment.setImageResource(R.drawable.morality_neutralgood)
                    alignment = "Neutral-Good"
                }
                if (btnGood.isChecked && btnChaotic.isChecked) {
                    imgAlignment.setImageResource(R.drawable.morality_chaoticgood)
                    alignment = "Chaotic-Good"
                }
                if (btnEvil.isChecked && btnLawful.isChecked) {
                    imgAlignment.setImageResource(R.drawable.morality_lawfulevil)
                    alignment = "Lawful-Evil"
                }
                if (btnEvil.isChecked && btnNeutral2.isChecked) {
                    imgAlignment.setImageResource(R.drawable.morality_neutralevil)
                    alignment = "Neutral-Evil"
                }
                if (btnEvil.isChecked && btnChaotic.isChecked) {
                    imgAlignment.setImageResource(R.drawable.morality_chaoticevil)
                    alignment = "Chaotic-Evil"
                }
                if (btnNeutral1.isChecked && btnLawful.isChecked) {
                    imgAlignment.setImageResource(R.drawable.morality_lawfulneutral)
                    alignment = "Lawful-Neutral"
                }
                if (btnNeutral1.isChecked && btnNeutral2.isChecked) {
                    imgAlignment.setImageResource(R.drawable.morality_neutraltrue)
                    alignment = "True Neutral"
                }
                if (btnNeutral1.isChecked && btnChaotic.isChecked) {
                    imgAlignment.setImageResource(R.drawable.morality_chaoticneutral)
                    alignment = "Chaotic-Neutral"
                }
            }
        })

        //send info to page 3

        var txtName: String = intent.getStringExtra("txtName")
        val btnPage3 = findViewById<Button>(R.id.btnPage3)

        btnPage3.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Main3Activity::class.java)
            intent.putExtra("txtName", txtName)
            intent.putExtra("alignment", alignment)
            startActivity(intent)
        })
    }
}
