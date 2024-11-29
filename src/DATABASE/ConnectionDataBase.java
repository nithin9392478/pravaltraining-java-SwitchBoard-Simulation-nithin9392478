package DATABASE;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDataBase {
	private Connection con;
	public Connection connection() throws ClassNotFoundException, SQLException
	{
		String url="jdbc:sqlserver://L-IT-0189:1433;databaseName=db;encrypt=true;trustServerCertificate=true;integratedSecurity=true;";
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		con=DriverManager.getConnection(url);
		return con;
	}
}





//
//String url="jdbc:mysql://localhost:3306/db1";
//String username="root";
//String password="Whitetiger@9392";
//Class.forName( "com.mysql.cj.jdbc.Driver");
//con=DriverManager.getConnection(url,username,password);
//Statement st=con.createStatement();
//System.out.println("connection established");
//return con;