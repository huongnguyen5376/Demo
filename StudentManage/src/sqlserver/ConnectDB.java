/**
 * 
 */
package sqlserver;

import java.sql.*;

/**
 * @author User
 * @description:
 * @time: 10:57:44 AM
 * @date: Nov 27, 2017
 */
public class ConnectDB {
	static String Driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	//static String ConnectionURL = "jdbc:sqlserver://localhost:1433"
	//	       + ";instance=SQLEXPRESS;databaseName=StaffManager;";
	//static String userName = "";
	//static String passWord = "";
	static String URL ="jdbc:sqlserver://localhost:1433"
		       + ";instance=SQLEXPRESS;databaseName=StaffManager;integratedSecurity=true;";
	public static Connection connectToDB() throws ClassNotFoundException, 
									SQLException {
		Class.forName(Driver);
		//Connection cn = DriverManager.getConnection(ConnectionURL,userName,passWord);
		Connection connection = DriverManager.getConnection(URL);
		return connection;
	}
}
