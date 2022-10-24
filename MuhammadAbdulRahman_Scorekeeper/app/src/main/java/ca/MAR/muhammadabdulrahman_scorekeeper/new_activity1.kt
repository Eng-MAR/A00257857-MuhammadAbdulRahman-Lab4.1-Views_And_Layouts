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

    var australiascoreincrease = 3
    var australiascoredecrease = australiascoreincrease--
    var englandscoreincrease = 2
    var englandscoredecrease = englandscoreincrease--


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new1)


        var ausview = findViewById<TextView>(R.id.aview)

        var ai = findViewById<Button>(R.id.ausinc)
        ai.setOnClickListener {
            australiascoreincrease++
            ausview.setText("Current Goal Score is: " + "$australiascoreincrease")
        }

        var ad = findViewById<Button>(R.id.ausdec)
        ad.setOnClickListener {
            australiascoredecrease = australiascoreincrease--
            ausview.setText("Current Goal Score is: " + "$australiascoredecrease")
        }

        var engview = findViewById<TextView>(R.id.eview)

        var ei = findViewById<Button>(R.id.enginc)
        ei.setOnClickListener {
            englandscoreincrease++
            engview.setText("Current Goal Score is: " + "$englandscoreincrease")
        }

        var ed = findViewById<Button>(R.id.engdec)
        ed.setOnClickListener {
            englandscoredecrease = englandscoreincrease--
            engview.setText("Current Goal Score is: " + "$englandscoredecrease")
        }

        RadioGroup.OnCheckedChangeListener { group, checkedId ->
            val radio: RadioButton = findViewById(checkedId)
            Toast.makeText(
                applicationContext, " On checked change :" +
                        " ${radio.text}",
                Toast.LENGTH_SHORT
            ).show()
        }

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setTitle("Football Scores Are..")
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}
