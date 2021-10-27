package com.example.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.tv1.text = "activity"
        binding.btn1.setOnClickListener {
            Toast.makeText(this, "click btn", Toast.LENGTH_SHORT).show()
        }
        binding.img1.setImageResource(R.drawable.ic_launcher_background)


        //fragment
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.frag, OneFragment())
        transaction.commit()
    }
}