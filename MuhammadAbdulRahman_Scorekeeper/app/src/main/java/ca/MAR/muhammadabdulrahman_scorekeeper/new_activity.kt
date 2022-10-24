package ca.MAR.muhammadabdulrahman_scorekeeper

import android.content.Intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class new_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        val imagebuttonClick = findViewById<ImageButton>(R.id.imagebutton_click)
        imagebuttonClick.setOnClickListener {
            val intent = Intent(this, new_activity1::class.java)
            startActivity(intent)}

        val imagebutton1Click = findViewById<ImageButton>(R.id.imagebutton1_click)
        imagebutton1Click.setOnClickListener {
            val intent = Intent(this, new_activiity2::class.java)
            startActivity(intent)}

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setTitle("Select the Game")
    }
        override fun onSupportNavigateUp(): Boolean {
            onBackPressed()
            return super.onSupportNavigateUp()
        }
    }

