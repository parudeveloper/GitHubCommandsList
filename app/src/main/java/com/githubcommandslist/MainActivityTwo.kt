package com.githubcommandslist

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.githubcommandslist.databinding.ActivityMainTwoBinding

class MainActivityTwo : AppCompatActivity() {
    lateinit var binding: ActivityMainTwoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}