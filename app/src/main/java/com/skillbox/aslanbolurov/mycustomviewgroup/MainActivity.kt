package com.skillbox.aslanbolurov.mycustomviewgroup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.skillbox.aslanbolurov.mycustomviewgroup.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.myCustomViewGroup.setTextForTopLine("Top Line configured from code")
        binding.myCustomViewGroup.setTextForBottomLine("Bottom Line configured from code")

    }
}