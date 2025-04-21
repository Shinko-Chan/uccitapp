package com.example.uccitapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.uccitapp.databinding.ActivityCoursesBinding

class ucccourses : AppCompatActivity() {
    private lateinit var binding: ActivityCoursesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCoursesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dbHelper = ucccoursedatabase(this)
        val db = dbHelper.readableDatabase

        val cursor = db.rawQuery("SELECT * FROM courses", null)
        val builder = StringBuilder()

        while (cursor.moveToNext()) {
            builder.append("Code: ${cursor.getString(1)}\n")
            builder.append("Name: ${cursor.getString(2)}\n")
            builder.append("Credits: ${cursor.getInt(3)}\n")
            builder.append("Pre-req: ${cursor.getString(4)}\n")
            builder.append("Desc: ${cursor.getString(5)}\n\n")
        }

        cursor.close()
        binding.courseTextView.text = builder.toString()
    }
}
