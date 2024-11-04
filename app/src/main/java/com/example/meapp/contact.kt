package com.example.meapp

import android.app.Dialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.meapp.flexActivity.Companion.KEY

class contact : AppCompatActivity() {

    lateinit var dialog : Dialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_contact)

            val details = intent.getStringExtra(flexActivity.KEY)

            val name1=findViewById<TextView>(R.id.name1)
            name1.text = details.toString()

        dialog =Dialog(this)
        dialog.setContentView(R.layout.custom_dialogue)
        dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.bg_alertbox))
        val btn=findViewById<Button>(R.id.phone1)
        var btnokay = dialog.findViewById<Button>(R.id.tickbtn)

        btnokay.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        btn.setOnClickListener {

            dialog.show()
//            val builder1 = AlertDialog.Builder(this)
//            builder1.setTitle("Thank you")
//            builder1.setMessage("My PA will contact you Soon!")
//            builder1.setIcon(R.drawable.baseline_thumb_up_24)
//            builder1.setPositiveButton("Okay") { dialogInterface, i ->
//                // Start MainActivity after the dialog is dismissed
//                val intent = Intent(this, MainActivity::class.java)
//                startActivity(intent)
//                finish() // Optionally, finish the current activity to remove it from the back stack
//            }
//            builder1.show() // Show the dialog
        }
        }
    }
