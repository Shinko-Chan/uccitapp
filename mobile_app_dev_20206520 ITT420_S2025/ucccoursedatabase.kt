package com.example.uccitapp

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class ucccoursedatabase(context: Context) : SQLiteOpenHelper(context, "courses.db", null, 1) {
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("CREATE TABLE courses (id INTEGER PRIMARY KEY, code TEXT, name TEXT, credits INTEGER, prereq TEXT, description TEXT)")

        db.execSQL("INSERT INTO courses (code, name, credits, prereq, description) VALUES ('IT101', 'Intro to IT', 3, '-', 'Basic intro to IT concepts.')")
        db.execSQL("INSERT INTO courses (code, name, credits, prereq, description) VALUES ('IT102', 'Programming Fundamentals', 3, 'IT101', 'Learn the basics of programming logic.')")
        db.execSQL("INSERT INTO courses (code, name, credits, prereq, description) VALUES ('IT201', 'Web Development', 3, 'IT102', 'Covers HTML, CSS, and JavaScript.')")
        db.execSQL("INSERT INTO courses (code, name, credits, prereq, description) VALUES ('IT202', 'Database Systems', 3, 'IT102', 'Introduction to relational databases and SQL.')")
        db.execSQL("INSERT INTO courses (code, name, credits, prereq, description) VALUES ('IT203', 'Networking Basics', 3, '-', 'Study of computer networks and protocols.')")
        db.execSQL("INSERT INTO courses (code, name, credits, prereq, description) VALUES ('IT204', 'Systems Analysis', 3, 'IT102', 'Understanding system development life cycles.')")
        db.execSQL("INSERT INTO courses (code, name, credits, prereq, description) VALUES ('IT205', 'Software Engineering', 3, 'IT204', 'Principles of designing and developing software.')")
        db.execSQL("INSERT INTO courses (code, name, credits, prereq, description) VALUES ('IT206', 'Mobile App Dev', 3, 'IT201', 'Developing mobile applications for Android.')")
        db.execSQL("INSERT INTO courses (code, name, credits, prereq, description) VALUES ('IT207', 'Cybersecurity', 3, '-', 'Fundamentals of protecting digital information.')")
        db.execSQL("INSERT INTO courses (code, name, credits, prereq, description) VALUES ('IT208', 'Cloud Computing', 3, 'IT202', 'Introduction to cloud infrastructure and services.')")
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS courses")
        onCreate(db)
    }
}