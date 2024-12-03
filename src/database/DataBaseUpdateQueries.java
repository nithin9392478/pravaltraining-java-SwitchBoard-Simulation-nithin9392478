package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import constant.Constant;

public class DataBaseUpdateQueries extends Constant{
	public static void updateInDatabase(int id,boolean state) throws ClassNotFoundException
	{
		StringBuffer sb=new StringBuffer("");
		sb.append(UPDATEQUERY);
		sb.append("'");
		sb.append(state);
		sb.append("'");
		sb.append(WHERECLAUSE);
		sb.append("'");
		sb.append(id);
		sb.append("'");

		String query=sb.toString();
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		try(Connection con=DriverManager.getConnection(Databaselogin.getUrl());
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery(query)){
				} catch (SQLException e) {
				}
	}
}
