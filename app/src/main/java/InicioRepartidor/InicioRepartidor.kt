package InicioRepartidor

import InicioRepartidor.ActualizarPedidos.RepartidorActualizarPedidos
import InicioRepartidor.ListaEnvios.RepartidorListaEnvios
import Soporte.Soporte
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ttdef.R

class InicioRepartidor : AppCompatActivity() {
    private lateinit var botonListaEnvios: Button
    private lateinit var botonActualizarPedidos: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // Esta línea permite el estilo de pantalla completa
        setContentView(R.layout.activity_inicio_repartidor)

        // Ajusta los márgenes con los Insets del sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Configura la Toolbar
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar) // Establece la Toolbar como la ActionBar

        // Inicializa los botones
        botonListaEnvios = findViewById(R.id.BotonListaEnvios)
        botonActualizarPedidos = findViewById(R.id.BotonActualizarPedido)

        // Configurar el botón "Lista de Envíos"
        botonListaEnvios.setOnClickListener {
            irAListaDeEnvios() // Llamamos a la función para iniciar la actividad
        }

        // Configurar el botón "Actualizar Pedido"
        botonActualizarPedidos.setOnClickListener {
            irAActualizarPedidos() // Llamamos a la función para iniciar la actividad
        }
    }

    // Función para iniciar la actividad RepartidorListaEnvios
    private fun irAListaDeEnvios() {
        val intent = Intent(this, RepartidorListaEnvios::class.java)
        startActivity(intent)
    }

    // Función para iniciar la actividad RepartidorActualizarPedidos
    private fun irAActualizarPedidos() {
        val intent = Intent(this, RepartidorActualizarPedidos::class.java)
        startActivity(intent)
    }

    // Inflar el menú
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)  // Asegúrate de tener el archivo main_menu.xml en la carpeta res/menu
        return true
    }

    // Manejar la selección de elementos del menú
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.BotonActualizarPedido -> {
                val intent = Intent(this, RepartidorActualizarPedidos::class.java)
                startActivity(intent)
                true
            }
            R.id.BotonListaEnvios -> {
                val intent = Intent(this, RepartidorListaEnvios::class.java)
                startActivity(intent)
                true
            }
            R.id.action_3 -> {
                val intent = Intent(this, Soporte::class.java)
                startActivity(intent)
                true
            }
            R.id.action_4 -> {
                val intent = Intent(this, Soporte::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
