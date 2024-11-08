import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        const val DATABASE_NAME = "app_database.db"  // Nombre de la base de datos
        const val DATABASE_VERSION = 1  // Versión de la base de datos
    }

    override fun onCreate(db: SQLiteDatabase?) {
        // Aquí se crea la tabla de usuarios
        val CREATE_TABLE_USERS = "CREATE TABLE users (id INTEGER PRIMARY KEY AUTOINCREMENT, username TEXT, password TEXT)"
        db?.execSQL(CREATE_TABLE_USERS)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        // Cuando la base de datos se actualiza, elimina y recrea la tabla
        db?.execSQL("DROP TABLE IF EXISTS users")
        onCreate(db)
    }
}
