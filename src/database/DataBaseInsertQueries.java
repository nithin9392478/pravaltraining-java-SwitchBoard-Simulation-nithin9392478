package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import constant.Constant;

public class DataBaseInsertQueries extends Constant {
	public static void insertInDatabase(String name,boolean state) throws ClassNotFoundException
	{
		StringBuffer sb=new StringBuffer("");
		sb.append(INSERTQUERY);
		sb.append(name);
		sb.append("'");
		sb.append(",");
		sb.append("'");
		sb.append((state? 1 : 0));
		sb.append("'");
		sb.append(")");
		String query=sb.toString();
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		try(Connection con=DriverManager.getConnection(Databaselogin.getUrl());
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery(query)){
				}catch (Exception e) {
					
				}
	}
}
