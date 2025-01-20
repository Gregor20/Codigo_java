package pack;
import javax.swing.*;

public class ejemplo_java_swing {

	public static void main(String[] args) {
	        // Crear un marco (ventana)
	        JFrame frame = new JFrame("Letras en la parte superior");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(400, 200);

	        // Crear una etiqueta con las letras
	        JLabel label = new JLabel("a b c d e f g h", SwingConstants.CENTER);

	        // Añadir la etiqueta a la parte superior del marco
	        frame.add(label, "North");

	        // Hacer visible la ventana
	        frame.setVisible(true);
	    }
	}

