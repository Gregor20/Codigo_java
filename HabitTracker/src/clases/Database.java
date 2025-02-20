package clases;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	private static final String DB_PATH = System.getProperty("user.home") + "/HabitTracker/habits.db";

    public static Connection connect() {
        Connection conn = null;
        try {
            // Crear la carpeta HabitTracker en el usuario si no existe
            File dbFile = new File(DB_PATH);
            dbFile.getParentFile().mkdirs();  // Crea la carpeta si no existe

            conn = DriverManager.getConnection("jdbc:sqlite:" + DB_PATH);
            System.out.println("Conectado a la base de datos en: " + DB_PATH);
		} catch (SQLException e) {
			System.out.println("Error de conexión: " + e.getMessage());
		}
		
		return conn;
	}
	
	public static void createTables() {
		String sqlUsers = "CREATE TABLE IF NOT EXISTS users (id INTEGER PRIMARY KEY, name TEXT, email TEXT UNIQUE);";
		String sqlHabits = "CREATE TABLE IF NOT EXISTS habits (id INTEGER PRIMARY KEY, user_id INTEGER, name TEXT, completed INTEGER, FOREIGN KEY(user_id) REFERENCES users(id));";
		
		try (Connection conn = connect(); Statement stmt = conn.createStatement()) {
			stmt.execute(sqlUsers);
			stmt.execute(sqlHabits);
			System.out.println("Tablas creadas correctamente");
		} catch (SQLException e ) {
			System.out.println("Error al crear tablas: " + e.getMessage());
		}
	}
	
	//public static void main (String[] args) {
		//createTables();
	//}	
}
