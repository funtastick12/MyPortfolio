package com.example.meapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import de.hdodenhof.circleimageview.CircleImageView

class eachskill : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_eachskill)

        val name = intent.getStringExtra("name")
        val level = intent.getStringExtra("level")
        val img = intent.getIntExtra("image", R.drawable.java)
        val year = intent.getIntExtra("year",2003)
        val des = intent.getStringExtra("description")

        val tvname = findViewById<TextView>(R.id.tvname)
        val tvlevel = findViewById<TextView>(R.id.tvlevel)
        val tvimg = findViewById<CircleImageView>(R.id.profile_image)
        val tvyear = findViewById<TextView>(R.id.tvyear)
        val tvdes = findViewById<TextView>(R.id.tvdes)


        tvname.text=name
        tvyear.text=year.toString()
        tvdes.text=des
        tvlevel.text=level
        tvimg.setImageResource(img)
    }
}