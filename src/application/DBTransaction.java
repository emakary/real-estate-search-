/*
Ehab Makary 
This calss is responsible for the DB transactions 
*/
package application;
import java.sql.*;

import model.User;

public class DBTransaction {

	private String query ="";
	private String db ="jdbc:mysql://localhost:3306/appartments";
	private String user ="root";
	private String password ="root";

	private Connection myConnection;
	private Statement myStatement ;
	private ResultSet rs;

	public void DbTransaction(){

	}
	
	// return a Resultset with the queried data 
	public ResultSet getResultSet(String query)
	{
		this.query=query;
		try 
		{
			myConnection = DriverManager.getConnection(db,user,password);
			myStatement = myConnection.createStatement();
			rs = myStatement.executeQuery(query);
		}
		catch (SQLException e )
		{
			System.out.println("something went wrong with DB connection");
			e.printStackTrace();
		}



		return this.rs;
	}
	
	
	// Closes the connection after the the quering the DB 
	public void closeCon(){
		try
		{
			myConnection.close();

		}

		catch (SQLException e )
		{
			System.out.println("something went wrong with closing DB connection");
			e.printStackTrace();
		}
	}

	
	//Update the table by using a User object 
	public void registerNew(User newuser){

		String query=" insert into user (email,fname,lname,phone,passord)"		
				+ " values (?,?,?,?,?)";
		try 
		{		
			myConnection = DriverManager.getConnection(db,user,password);
			PreparedStatement statement = myConnection.prepareStatement(query);

			statement.setString(1,newuser.getEmail());
			statement.setString(2,newuser.getfName());
			statement.setString(3,newuser.getlName());
			statement.setString(4,newuser.getPhone());
			statement.setString(5,newuser.getPass());
			statement.execute();
		}
		catch (SQLException e )
		{
			System.out.println("something went wrong writting to DB");
			e.printStackTrace();
		}

	}





}
