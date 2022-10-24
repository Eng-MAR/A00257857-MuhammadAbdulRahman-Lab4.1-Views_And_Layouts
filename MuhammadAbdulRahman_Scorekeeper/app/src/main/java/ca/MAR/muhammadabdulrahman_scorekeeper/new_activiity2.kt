package ca.MAR.muhammadabdulrahman_scorekeeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView

class new_activiity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new2)

// Calling Radio Buttons
        val rb1 = findViewById<RadioButton>(R.id.radioButton)
        val rb2 = findViewById<RadioButton>(R.id.radioButton2)

        rb1.setOnClickListener {
            var pakSc = 43      //Current Score Defined
            var pakview = findViewById<TextView>(R.id.pview)

            var pi = findViewById<Button>(R.id.pakinc)
            pi.setOnClickListener {

                pakview.setText("Current Run Rate is: " + pakSc++ + " runs per over(avg)")
            }

            var pd = findViewById<TextView>(R.id.pakdec)
            pd.setOnClickListener {
                pakview.setText("Current Run Rate is: " + pakSc-- + " runs per over(avg)")
            }
        }

        rb2.setOnClickListener {
            var indSc = 23      //Current Score Defined
            var indview = findViewById<TextView>(R.id.iview)

            var ii = findViewById<Button>(R.id.indinc)
            ii.setOnClickListener {

                indview.setText("Current Run Rate is: " + indSc++ + " runs per over(avg)")
            }

            var id = findViewById<TextView>(R.id.inddec)
            id.setOnClickListener {
                indview.setText("Current Run Rate is: " + indSc-- + " runs per over(avg)")
            }
        }
// Goto Previous page
            supportActionBar!!.setDisplayHomeAsUpEnabled(true)
            supportActionBar!!.setDisplayHomeAsUpEnabled(true)
            supportActionBar!!.setTitle("Cricket Scores Are..")

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()

    }
}