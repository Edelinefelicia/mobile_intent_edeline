package com.example.tugas100924

import android.graphics.Color
import android.os.Bundle
import android.text.Html
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tugas100924.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            val username = intent.getStringExtra("Username_login")
            val email = intent.getStringExtra("Email_login")
            val phone = intent.getStringExtra("Phone_login")

            val usernameHtml = "Welcome <font color='#525BFF'>$username</font>"
            val emailHtml = "Your <font color='#525BFF'>$email</font> has been activated"
            val phoneHtml = "Your <font color='#525BFF'>$phone</font> has been registered"

            // Menampilkan teks di TextView dengan warna biru
            binding.tvOutput.text = Html.fromHtml(usernameHtml)
            binding.tvOutput2.text = Html.fromHtml(emailHtml)
            binding.tvOutput3.text = Html.fromHtml(phoneHtml)

        }
    }
}

//tvOutput.text ="Welcome <font color='#525BFF'>$username</font>"
