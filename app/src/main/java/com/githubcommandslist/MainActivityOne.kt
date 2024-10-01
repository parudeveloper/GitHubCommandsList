package com.githubcommandslist

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.githubcommandslist.databinding.ActivityMainOneBinding

class MainActivityOne : AppCompatActivity() {
    lateinit var binding: ActivityMainOneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainOneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // This is added by Mallangi and committing
    }
}