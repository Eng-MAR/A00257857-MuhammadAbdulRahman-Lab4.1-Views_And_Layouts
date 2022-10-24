package ca.MAR.muhammadabdulrahman_scorekeeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class new_activiity2 : AppCompatActivity() {

    var pakistanscoreincrease=43
    var pakistanscoredecrease=pakistanscoreincrease--
    var indiascoreincrease=23
    var indiascoredecrease=indiascoreincrease--

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new2)

        var pakview= findViewById<TextView>(R.id.pview)

        var pi = findViewById<Button>(R.id.pakinc)
        pi.setOnClickListener {
            pakistanscoreincrease++
            pakview.setText("Current Run Rate is: " + "$pakistanscoreincrease" + " runs per over(avg)")
        }

        var pd=findViewById<TextView>(R.id.pakdec)
        pd.setOnClickListener{
            pakistanscoredecrease=pakistanscoreincrease--
            pakview.setText("Current Run Rate is: " + "$pakistanscoredecrease" + " runs per over(avg)")
        }

        var indview= findViewById<TextView>(R.id.iview)

        var ii = findViewById<Button>(R.id.indinc)
        ii.setOnClickListener {
            indiascoreincrease++
            indview.setText("Current Run Rate is: " + "$indiascoreincrease" + " runs per over(avg)")
        }

        var id= findViewById<Button>(R.id.inddec)
        id.setOnClickListener{
            indiascoredecrease=indiascoreincrease--
            indview.setText("Current Run Rate is: " + "$indiascoredecrease" + " runs per over(avg)")
        }

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setTitle("Cricket Scores Are..")
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()

    }
}