import android.app.TimePickerDialog
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import java.util.*
import com.example.ttdef.R

class TimePickerActivity : AppCompatActivity() {

    private lateinit var horaEntregaEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pedidos_order)  // Asegúrate de que el nombre del XML sea el correcto

        horaEntregaEditText = findViewById(R.id.horaEntrega)

        // Manejador del evento al hacer clic en el EditText
        horaEntregaEditText.setOnClickListener {
            showTimePicker()
        }
    }

    private fun showTimePicker() {
        // Obtener la hora y minuto actuales
        val calendar = Calendar.getInstance()
        val hour = calendar.get(Calendar.HOUR_OF_DAY)
        val minute = calendar.get(Calendar.MINUTE)

        // Crear el TimePickerDialog
        val timePickerDialog = TimePickerDialog(
            this,
            { _, selectedHour, selectedMinute ->
                // Mostrar la hora seleccionada en el EditText
                val formattedTime = String.format("%02d:%02d", selectedHour, selectedMinute)
                horaEntregaEditText.setText(formattedTime)
            },
            hour, minute, true // true indica que se usará el formato 24 horas
        )
        timePickerDialog.show()
    }
}
