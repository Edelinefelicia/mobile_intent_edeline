package com.example.tugas100924

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tugas100924.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    companion object{
        const val EXTRA_NAME = "extra_name"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            val btnregis = binding.btnRegis
            val etusername = binding.etUserRegis
            val etemail = binding.etEmailRegis
            val etphone = binding.etPhoneRegis
            val etpass = binding.etPassRegis
            btnregis.setOnClickListener {
                val username = etusername.text.toString()
                val email = etemail.text.toString()
                val phone = etphone.text.toString()
                val password = etpass.text.toString()
                if (username.isEmpty() || email.isEmpty() || phone.isEmpty() || password.isEmpty()) {
                    Toast.makeText(
                        this@MainActivity,
                        "Please fill in all fields",
                        Toast.LENGTH_SHORT
                    ).show()
                    return@setOnClickListener
                }
                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                intent.putExtra("Username", username)
                intent.putExtra("Email", email)
                intent.putExtra("Phone", phone)
                intent.putExtra("Password", password)
                startActivity(intent)
            }
        }
    }
}