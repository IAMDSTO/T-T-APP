package com.example.ttdef

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.GridLayout
import androidx.appcompat.app.AppCompatActivity
import com.activity_cancel_order.CancelOrderActivity
import com.example.usuariosspinner.PedidosOrderActivity

class AdminActivity : AppCompatActivity() {

    private lateinit var menuButton: Button
    private lateinit var menuOptions: GridLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin)


        // Manejar clic en el botón "Usuarios"
        findViewById<Button>(R.id.button_users).setOnClickListener {
            val intent = Intent(this, UsuariosOrderActivity::class.java)
            startActivity(intent)
        }

        // Manejar clic en el botón "Pedidos"
        findViewById<Button>(R.id.button_orders).setOnClickListener {
            val intent = Intent(this, PedidosOrderActivity::class.java)
            startActivity(intent)
        }

        // Manejar clic en el botón "Cancelación"
        findViewById<Button>(R.id.button_cancellations).setOnClickListener {
            val intent = Intent(this, CancelOrderActivity::class.java)
            startActivity(intent)
        }
    }
}
