package com.example.uccitapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.uccitapp.databinding.ActivityDirectoryBinding

class uccdirectory : AppCompatActivity() {
    private lateinit var binding: ActivityDirectoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDirectoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.callButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:8762052869"))
            startActivity(intent)
        }

        binding.emailButton.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:princiss@stu.ucc.edu.jm")
                putExtra(Intent.EXTRA_SUBJECT, "Faculty Inquiry")
            }
            startActivity(emailIntent)
        }
    }
}