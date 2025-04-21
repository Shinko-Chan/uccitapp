package com.example.uccitapp

import android.os.Bundle
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.example.uccitapp.databinding.ActivitySocialMediaBinding

class uccmedia : AppCompatActivity() {
    private lateinit var binding: ActivitySocialMediaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySocialMediaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.webView.webViewClient = WebViewClient()
        binding.webView.loadUrl("https://www.facebook.com/uccjamaica")
    }
}