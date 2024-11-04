package com.example.meapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
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

class skillsActivity : ComponentActivity() {
    lateinit var userarray : ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_skills)

        val name = arrayOf("Java", "Python", "C Prog", "Kotlin", "Webdev", "Flutter")
        val level = arrayOf("Level 10", "Level 1", "Level 8", "Level 7","Level 9", "Level 5" )
        val year = intArrayOf(2022,2019,2023,2023,2018,2024)
        val description = arrayOf("Grandmaster", "Noob", "Pretty Good", "Almost there", "Kinda Legend", "I hate this shit")
        val img = intArrayOf(R.drawable.java, R.drawable.python,R.drawable.cprog,R.drawable.kotlin,R.drawable.webdev,R.drawable.flutter)

        userarray =ArrayList()

        for (each in name.indices){
            val user = User(name[each],level[each],year[each],description[each],img[each])
            userarray.add(user)
        }

        val listview = findViewById<ListView>(R.id.lv)
        listview.isClickable=true
        listview.adapter = myadapter(this, userarray)

        listview.setOnItemClickListener { adapterView, view, i, l ->

            val skname = name[i]
            val skyear = year[i]
            val skimg = img[i]
            val sklevel = level[i]
            val skdes = description[i]

            val intent = Intent(this,eachskill::class.java)
            intent.putExtra("name", skname)
            intent.putExtra("level",sklevel)
            intent.putExtra("image",skimg)
            intent.putExtra("year", skyear)
            intent.putExtra("description",skdes)

            startActivity(intent)

        }
    }
}