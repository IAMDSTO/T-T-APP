package InicioUsuario

import InicioUsuario.EnviarPedido.UsuarioEnviarPedido
import InicioUsuario.RastrearPedido.UsuarioRastrearPedido
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ttdef.R

class InicioUsuario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // Habilitar el modo Edge to Edge
        setContentView(R.layout.activity_inicio_usuario)

        // Aquí configuramos correctamente los márgenes para el View con ID 'main'
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            // Aplica márgenes para los elementos de la pantalla utilizando WindowInsetsCompat
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)

            // Retorna los insets para que se sigan aplicando correctamente
            insets
        }

        // Referencia y eventos de los botones
        val botonEnviar: Button = findViewById(R.id.BotonEnviar)
        val botonRastrear: Button = findViewById(R.id.BotonRastrear)

        // Acción para el botón "Enviar Pedido"
        botonEnviar.setOnClickListener {
            // Inicia la actividad deseada al hacer clic en el botón Enviar Pedido
            val intent = Intent(this,UsuarioEnviarPedido::class.java)
            startActivity(intent)
        }

        // Acción para el botón "Rastrear Pedido"
        botonRastrear.setOnClickListener {
            // Inicia la actividad UsuarioRastrear al hacer clic en el botón Rastrear Pedido
            val intent = Intent(this, UsuarioRastrearPedido::class.java)
            startActivity(intent)
        }
    }
}
