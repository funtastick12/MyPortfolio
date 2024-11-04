package com.example.meapp

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.Switch
import android.widget.Toast
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
import com.example.meapp.databinding.ActivityMainBinding
import com.example.meapp.ui.theme.MeAppTheme

class MainActivity : ComponentActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        binding =ActivityMainBinding.inflate(layoutInflater)
        val buttonSkills = findViewById<Button>(R.id.button2)
        buttonSkills.setOnClickListener{
            intent = Intent(this, skillsActivity::class.java)
            startActivity(intent)
        }

        val buttonExperience = findViewById<Button>(R.id.button)
        buttonExperience.setOnClickListener{
            intent = Intent(this, experienceActivity::class.java)
            startActivity(intent)
        }

        val buttonEducation = findViewById<Button>(R.id.button3)
        buttonEducation.setOnClickListener{
            intent = Intent(this, educationActivity::class.java)
            startActivity(intent)
        }

        val buttonFlex = findViewById<Button>(R.id.button4)
        buttonFlex.setOnClickListener{
            intent = Intent(this, flexActivity::class.java)
            startActivity(intent)
        }

        val lt = findViewById<LinearLayout>(R.id.rlVar1)
        val swt = findViewById<Switch>(R.id.switch1)
        var isDarkMode = false

        swt.setOnClickListener {
            if (isDarkMode) {
                lt.setBackgroundResource(R.color.purple_200)
                Toast.makeText(applicationContext, "Light Mode", Toast.LENGTH_SHORT).show()
            } else {
                lt.setBackgroundResource(R.color.purple_700)
                Toast.makeText(applicationContext, "Dark Mode", Toast.LENGTH_SHORT).show()
            }
            // Toggle the mode
            isDarkMode = !isDarkMode
        }

        binding.textView12.setOnClickListener{
            intent = Intent(this, login::class.java)
            startActivity(intent)
        }

    }
}



//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    MeAppTheme {
//        Greeting("Android")
//    }
//}