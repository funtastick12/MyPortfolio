package com.example.meapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.meapp.ui.theme.MeAppTheme
import android.widget.EditText
import android.widget.Toast


class flexActivity : ComponentActivity() {

    companion object{
        const val KEY= "com.example.meapp.flexActivity.key"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_flex)

        val btncontact = findViewById<Button>(R.id.cont)
        val edt1 = findViewById<EditText>(R.id.edt1)
        val edt2 = findViewById<EditText>(R.id.edt2)
        val email = findViewById<EditText>(R.id.email)
        val phone = findViewById<EditText>(R.id.phone)

        btncontact.setOnClickListener {
            val msg1 = "First Name: ${edt1.text}\nLast Name: ${edt2.text}\nE Mail: ${email.text}\nPhone Number: ${phone.text}"

            intent =Intent(this,contact::class.java)
            intent.putExtra(KEY,msg1)
            startActivity(intent)
        }
    }
}