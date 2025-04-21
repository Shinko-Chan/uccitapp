package com.example.uccitapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.uccitapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.directoryButton.setOnClickListener {
            startActivity(Intent(this, uccdirectory::class.java))
        }

        binding.coursesButton.setOnClickListener {
            startActivity(Intent(this, ucccourses::class.java))
        }

        binding.admissionsButton.setOnClickListener {
            startActivity(Intent(this, uccadmissions::class.java))
        }

        binding.socialMediaButton.setOnClickListener {
            startActivity(Intent(this, uccmedia::class.java))
        }

        binding.emailFab.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:ithod@ucc.edu.jm")
                putExtra(Intent.EXTRA_SUBJECT, "Inquiry from UCC IT App")
            }
            startActivity(emailIntent)
        }
    }
}
