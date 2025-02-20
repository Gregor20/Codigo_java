package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HabitManager {
	public static void addHabit(int userId, String name) {
        String sql = "INSERT INTO habits(user_id, name, completed) VALUES(?, ?, 0)";
        try (Connection conn = Database.connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, userId);
            pstmt.setString(2, name);
            pstmt.executeUpdate();
            System.out.println("Hábito agregado con éxito");
        } catch (SQLException e) {
            System.out.println("Error al agregar hábito: " + e.getMessage());
        }
    }
/*
    public static void main(String[] args) {
        addHabit(2, "Utilizar Java hoy, mas de 1 hora");
    }
	*/
}
