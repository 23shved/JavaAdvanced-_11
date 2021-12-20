package shved.ua.lviv.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.xml.DOMConfigurator;

public class ConnectionUtil {
	private static String USER_NAME = "root";
	private static String USER_PASSWORD = "shved2306";
	private static String URL = "jdbc:mysql://localhost:3306/my_shop";
	
	
	public static Connection openConnection() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		
		
		DOMConfigurator.configure("loggerConfig.xml");	

		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		return DriverManager.getConnection(URL, USER_NAME, USER_PASSWORD);
	}
}
