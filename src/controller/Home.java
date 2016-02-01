/*
Ehab Makary 
provide the home view using home FXML
*/


package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Home {
	
	@FXML
	private Button SearchButton;
	private TextField Location;
	private MenuButton PriceMin, PriceMax, BedMin, BathMin;
	
	@FXML
	public void Search(ActionEvent event){
		//Add SQL Query using data entered
		//If nothing entered show all apartments
		//Transfer Scene to Search
		
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/application/Search.fxml"));
			Scene scene = new Scene(root);
			Stage stage = (Stage) SearchButton.getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
