package com.example.practicumexam

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import android.widget.TextView
import android.widget.Toast
import android.widget.EditText
import android.widget.Button
import android.widget.LinearLayout
import androidx.cardview.widget.CardView
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v , insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left , systemBars.top , systemBars.right , systemBars.bottom)
            insets
        }

        private lateinit var nextButton: Button // Declare Button
        private lateinit var exitButton: Button // Declare Button
        private lateinit var addToPlaylistButton: Button // Declare Button


        val addToPlaylistButton: DetailedActivity = findViewById(R.id.addToPlaylistButton) //  Replaced with button's ID

        //a click listener for the button
        addToPlaylistButton.setOnClickListener {
            // 3. Show a toast message
            Toast.makeText(this , "adding..." , Toast.LENGTH_SHORT).show()

            // 4. Starts the |DetailActivity
            val intent = Intent(this , DetailedActivity::class.java) // Replace Activity if needed.
            startActivity(intent)
    }

}
