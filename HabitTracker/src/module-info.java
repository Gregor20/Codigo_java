/**
 * 
 */
/**
 * 
 */
module HabitTracker {
	requires java.sql;
	requires javafx.graphics;
	
	requires javafx.controls;
	requires javafx.fxml;
	
	 exports clases;  // Exportar el paquete donde está UI.java
	 opens clases to javafx.graphics;  // Permitir que JavaFX acceda a clases
}