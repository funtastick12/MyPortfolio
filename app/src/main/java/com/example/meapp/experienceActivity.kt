package com.example.meapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.cardview.widget.CardView
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.meapp.ui.theme.MeAppTheme

class experienceActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_experience)

        val git =findViewById<CardView>(R.id.cd1)
        val port =findViewById<CardView>(R.id.cd2)

        git.setOnClickListener {
            val intent =Intent(Intent.ACTION_VIEW)
            intent.data=(Uri.parse("https://github.com/funtastick12"))
            startActivity(intent)
        }

        port.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://docs.google.com/document/d/1-RjAEBBmkKsPc4Eqx58Il6lDiOCSX0Z253bWnpD4PJU/edit?usp=sharing")
           startActivity(intent)
        }


        val btintent= findViewById<Button>(R.id.button6)

        btintent.setOnClickListener {
            intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }

    }
}