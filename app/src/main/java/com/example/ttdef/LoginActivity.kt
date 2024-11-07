package com.example.ttdef

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button
    private lateinit var registerLink: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Asegúrate de que este sea el nombre correcto

        emailEditText = findViewById(R.id.email)
        passwordEditText = findViewById(R.id.password)
        loginButton = findViewById(R.id.login_button)
        registerLink = findViewById(R.id.register_link)

        loginButton.setOnClickListener {
            // Lógica de inicio de sesión aquí
            Toast.makeText(this, "Iniciando sesión...", Toast.LENGTH_SHORT).show()
            // Navegar a la actividad de administrador
            startActivity(Intent(this, AdminActivity::class.java))
        }

        registerLink.setOnClickListener {
            // Navegar a la actividad de registro
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}
