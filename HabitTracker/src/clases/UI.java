package clases;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class UI extends Application{

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Habit Tracker");
		Label label = new Label ("Bienvenido al Habit Tracker");
		StackPane root = new StackPane();
		root.getChildren().add(label);
		
		Scene scene = new Scene (root, 400, 300);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main (String[] args) {
		Database.createTables();
		launch(args);
		//HabitManager.addHabit(3, "jugar al futbol 30 minutos");
	}

	
	
	
}
