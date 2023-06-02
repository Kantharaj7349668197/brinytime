package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class practice1 {
//to fetch the data from musql
	public static void main(String[] args) throws SQLException {
		Driver driver;
		Connection connection=null;
		try {
			driver = new Driver();
			DriverManager.registerDriver(driver);
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyss","root","root");
			Statement ststament = connection.createStatement();
			ResultSet result = ststament.executeQuery("select * from kantha");
			while (result.next()) {
				System.out.println(result.getString(1)+" "+result.getString(2));
			}
		} catch (SQLException e) {
		}

		connection.close();
	}
	
}
