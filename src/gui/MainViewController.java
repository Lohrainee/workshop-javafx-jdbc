package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {
	
	@FXML
	private MenuItem menuItemSeller;
	
	@FXML
	private MenuItem menuItemDepartment;
	
	
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	public void onMenuItemSelleraction() {
		System.out.println ("onMenuItemSelleraction");
	}
	
	@FXML
	public void onMenuItemDepartmentaction() {
		System.out.println ("onMenuItemDepartmentaction");
	}
	
	@FXML
	public void onMenuItemAboutaction() {
		System.out.println ("onMenuItemAboutaction");
	}
	
	

	@Override
	public void initialize(URL uri, ResourceBundle rb) {

		
	}

}
