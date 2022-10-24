package ca.MAR.muhammadabdulrahman_scorekeeper

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast


class new_activity1 : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new1)
// Calling Radio Buttons
        val rb3 = findViewById<RadioButton>(R.id.ausradioButton)
        val rb4 = findViewById<RadioButton>(R.id.engradioButton)

        rb3.setOnClickListener {
            var ausSc = 3       //Current Score Defined
            var ausview = findViewById<TextView>(R.id.aview)

            var ai = findViewById<Button>(R.id.ausinc)
            ai.setOnClickListener {

                ausview.setText("Current Goal Score is: " + ausSc++)  //Score Increase
            }

            var ad = findViewById<TextView>(R.id.ausdec)
            ad.setOnClickListener {
                ausview.setText("Current Goal Score is: " + ausSc--)  //Score Decreased
            }
        }
        rb4.setOnClickListener {
            var engSc = 7       //Current Score Defined
            var engview = findViewById<TextView>(R.id.eview)

            var ei = findViewById<Button>(R.id.enginc)
            ei.setOnClickListener {

                engview.setText("Current Goal Score is: " + engSc++)  //Score Increase
            }

            var ed = findViewById<TextView>(R.id.ausdec)
            ed.setOnClickListener {
                engview.setText("Current Goal Score is: " + engSc--)  //Score Decreased
            }
        }
//Go To Previous Page
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setTitle("FootBall Scores Are..")
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}
