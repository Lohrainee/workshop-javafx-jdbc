package gui.util;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Alerts {
	
	public static void showAlert (String Title, String header, String content, AlertType type) {
		Alert alert = new Alert (type);
		alert.setTitle(Title);
		alert.setHeaderText(header);
		alert.setContentText(content);
		alert.show();
	}

}
