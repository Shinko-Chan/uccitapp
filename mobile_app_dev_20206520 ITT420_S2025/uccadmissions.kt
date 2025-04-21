package com.example.uccitapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.uccitapp.databinding.ActivityAdmissionsBinding

class uccadmissions : AppCompatActivity() {
    private lateinit var binding: ActivityAdmissionsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdmissionsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.admissionLink.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ucc.edu.jm/apply"))
            startActivity(browserIntent)
        }
    }
}
