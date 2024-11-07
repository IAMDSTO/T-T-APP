package com.example.ttdef

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var registerButton: Button
    private lateinit var loginLink: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        emailEditText = findViewById(R.id.email)
        passwordEditText = findViewById(R.id.password)
        registerButton = findViewById(R.id.register_button)
        loginLink = findViewById(R.id.login_link)

        registerButton.setOnClickListener {
            // Lógica de registro aquí
            Toast.makeText(this, "Registrándose...", Toast.LENGTH_SHORT).show()
        }

        loginLink.setOnClickListener {
            // Navegar a la actividad de inicio de sesión
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}
