package com.example.usuariosspinner // Asegúrate de que el nombre del paquete sea el correcto

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.example.ttdef.R

// Asegúrate de que el import de R sea el correcto

class UsuariosSpinner : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuarios_order)  // Asegúrate de que este es el layout correcto

        // Obtener el Spinner del layout
        val spinner: Spinner = findViewById(R.id.Spinner_rol)

        // Crear un ArrayAdapter para cargar los roles desde el array de strings
        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.roles_array, // Este es el recurso que definimos en strings.xml
            android.R.layout.simple_spinner_item
        )

        // Configurar el estilo del dropdown del Spinner
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Asignar el adaptador al Spinner
        spinner.adapter = adapter
    }
}
