package com.githubcommandslist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.githubcommandslist.databinding.ActivityMainOneBinding

class MainActivityOne : AppCompatActivity() {
    lateinit var binding: ActivityMainOneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainOneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // This is added by Mallangi and committing

        // Mallangi 2nd commit
        // 3rd commit
    }
}