package com.example.usuariosspinner

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.example.ttdef.R

class PedidosSpinner : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuarios_order)  // Asegúrate de que este es el layout correcto

        // Obtener el Spinner del layout
        val spinner: Spinner = findViewById(R.id.asignar_repartidor)

        // Crear un ArrayAdapter vacío (sin datos)
        val emptyAdapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_spinner_item,
            emptyList() // Lista vacía
        )

        // Configurar el estilo del dropdown del Spinner
        emptyAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Asignar el adaptador al Spinner
        spinner.adapter = emptyAdapter
    }
}
