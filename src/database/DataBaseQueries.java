package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import constant.Constant;
import model.Appliance;

public class DataBaseQueries extends Constant {
	
	public static void put(String name,boolean state) throws ClassNotFoundException
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
		Class.forName(LOAD_JDBC_DRIVER);
		try(Connection con=DriverManager.getConnection(DatabaseConnection.getUrl());
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery(query)){
				}catch (Exception e) {
					
				}
	}
	
	public static void set (int id,boolean state) throws ClassNotFoundException
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
		Class.forName(LOAD_JDBC_DRIVER);
		try(Connection con=DriverManager.getConnection(DatabaseConnection.getUrl());
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery(query)){
				} catch (SQLException e) {
				}
	}
	
	public static int getCount() throws ClassNotFoundException
	{
		String query=COUNTQUERY;
		Class.forName(LOAD_JDBC_DRIVER);
		try(Connection con=DriverManager.getConnection(DatabaseConnection.getUrl());
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery(query)){
			rs.next();
			int count=rs.getInt("count");
			return count;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		} 
		
	}
	
	public static boolean getState(int id) throws ClassNotFoundException
	{
		String query=STATEQUERY+id;
		Class.forName(LOAD_JDBC_DRIVER);
		try(Connection con=DriverManager.getConnection(DatabaseConnection.getUrl());
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery(query)){
			rs.next();
			boolean state=rs.getBoolean("state");
			return state;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} 
	}
	
	public static String getName(int id) throws ClassNotFoundException
	{
		String query=NAMEQUERY+id;
		Class.forName(LOAD_JDBC_DRIVER);
		try(Connection con=DriverManager.getConnection(DatabaseConnection.getUrl());
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery(query)){
			rs.next();
			String name=rs.getString(NAME);
			return name;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return "";
		} 
	}
	
	public static int getId(int id) throws ClassNotFoundException
	{
		String query=IDQUERY+id;
		Class.forName(LOAD_JDBC_DRIVER);
		try(Connection con=DriverManager.getConnection(DatabaseConnection.getUrl());
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery(query)){
			rs.next();
			int ind=rs.getInt("id");
			return ind;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		} 
	}
	
	public  List<Appliance> getDataBase() throws ClassNotFoundException  {
		
		String query=CONSOLEQUERY;
	    List<Appliance> data=new ArrayList<>();
		Class.forName(LOAD_JDBC_DRIVER);
		try(Connection con=DriverManager.getConnection(DatabaseConnection.getUrl());
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery(query)){
			while(rs.next())
			{
				
				int id=rs.getInt(ID);
				String name=rs.getString(NAME);
				boolean state=rs.getBoolean(STATE);
				int number=rs.getInt(NUMBER);
				Appliance createApplianceObject=new Appliance();
				createApplianceObject.set(name, state, id,number);
				data.add(createApplianceObject);
			}
			return data;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} 
	}
}
