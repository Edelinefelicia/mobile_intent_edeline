package com.example.tugas100924

import android.app.ProgressDialog
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tugas100924.databinding.ActivityMain2Binding
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            btnLogin.setOnClickListener{
                val username_login = binding.etUserLogin.text.toString()
                val pass_login = binding.etPassLogin.text.toString()
                val username = intent.getStringExtra("Username")
                val password = intent.getStringExtra("Password")
                val email = intent.getStringExtra("Email")
                val phone = intent.getStringExtra("Phone")
                if(username == username_login && password == pass_login){
                    val intent = Intent(this@MainActivity2,MainActivity3::class.java)
                    intent.putExtra("Username_login", username)
                    intent.putExtra("Email_login", email)
                    intent.putExtra("Phone_login", phone)
                    startActivity(intent)
                    finish()
                }else{
                    Toast.makeText(
                        this@MainActivity2,
                        "Please check your input",
                        Toast.LENGTH_SHORT
                    ).show()
                    return@setOnClickListener
                }

            }

        }
    }
    private fun showLoading() {
        binding.progressBar.visibility = View.VISIBLE
    }

    private fun hideLoading() {
        binding.progressBar.visibility = View.GONE
    }
}