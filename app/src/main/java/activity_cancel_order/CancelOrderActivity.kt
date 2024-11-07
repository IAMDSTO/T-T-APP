package com.activity_cancel_order // Asegúrate de que el paquete sea correcto

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.ttdef.R


class CancelOrderActivity : AppCompatActivity() {

    private lateinit var clientNameEditText: EditText
    private lateinit var orderIdEditText: EditText
    private lateinit var reasonEditText: EditText // Nuevo EditText
    private lateinit var cancelButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cancel_order)

        // Inicializa los EditTexts y el botón
        clientNameEditText = findViewById(R.id.canc_cliente)
        orderIdEditText = findViewById(R.id.canc_id_pedido)
        reasonEditText = findViewById(R.id.canc_motivo) // Referencia al nuevo EditText
        cancelButton = findViewById(R.id.cancelButton)

        cancelButton.setOnClickListener {
            // Aquí puedes manejar la lógica para cancelar el pedido
            val clientName = clientNameEditText.text.toString()
            val orderId = orderIdEditText.text.toString()
            val reason = reasonEditText.text.toString() // Obtiene el comentario

            // Procesa la cancelación, muestra un mensaje, etc.
        }
    }
}
