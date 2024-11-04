package com.example.meapp

import android.annotation.SuppressLint
import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class myadapter(private val context: Activity, private val users: ArrayList<User>) : BaseAdapter() {

    override fun getCount(): Int {
        return users.size
    }

    override fun getItem(position: Int): Any {
        return users[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = convertView ?: LayoutInflater.from(context).inflate(R.layout.eachelement, parent, false)

        val image = view.findViewById<CircleImageView>(R.id.profile_image)
        val name = view.findViewById<TextView>(R.id.textView5)
        val level = view.findViewById<TextView>(R.id.textView15)
        val year = view.findViewById<TextView>(R.id.time)


        val user = users[position]

        name.text = user.name
        level.text = user.level
        year.text = user.year.toString()
        image.setImageResource(user.img)

        return view
    }
}
