package controller;

/*
Ehab Makary 
provide the login view using login FXML
*/


import java.sql.*;
import java.util.Properties;

import application.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.*;
import java.util.*;
import javax.activation.*;

public class LogIn {
	
 private User user;
 private DBTransaction dbt = new DBTransaction();	
 private ResultSet rs;

	
	
	@FXML
	private Button LogInButton, SingUpButton;
	@FXML
	private TextField Username ;
	@FXML
	private PasswordField Password ;
	@FXML
	private TextField FirstName ;
	@FXML
	private TextField SecondName ;
	@FXML
	private TextField Email ;
	@FXML
	private TextField Phone ;
	@FXML
	private PasswordField newPassword ;
	
	
	
	public void SignUp(ActionEvent event){
		
		user = new User(FirstName.getText(),SecondName.getText(),Email.getText()
				,Phone.getText(), newPassword.getText() );
		dbt.registerNew(user);	
		dbt.closeCon();
		changScene();
		
	}
	
	
	public void LogInClick(ActionEvent event){
		
      
		
		if (checkLogin( Username.getText(),Password.getText())){
		
			changScene();
		}
		
		else{
			System.out.print("HI");
			Username.setText("Error");
			Username.setStyle("-fx-text-inner-color: red;");
			Password.setText("Error");
			Password.setStyle("-fx-text-inner-color: red;");
		}

		
		
		
	}
	
	private boolean checkLogin(String email,String password)
	{
		
		String query = ("SELECT * FROM appartments.user where email=" +"'" +email+"'" + " and passord="+ "'" + password+"'"  );
		
		
		rs=dbt.getResultSet(query);
	
		
		try {
			if (!rs.next()){
				dbt.closeCon();
				return false;
			}
		} catch (SQLException e) {
			System.out.print("something oops");
			e.printStackTrace();
		}
		dbt.closeCon();
		return true;
	}

	private void changScene(){
		try {			
			
			Parent root = FXMLLoader.load(getClass().getResource("/application/Home.fxml"));
			Scene scene = new Scene(root);
			Stage stage = (Stage) LogInButton.getScene().getWindow();
			stage.setScene(scene);
			stage.show();
	
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	}
	
	

