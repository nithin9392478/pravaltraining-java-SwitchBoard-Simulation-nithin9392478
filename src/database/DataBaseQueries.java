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
import model.Ac;
import model.Fan;
import model.Bulb;
public class DataBaseQueries extends Constant {
	
	public enum Type{
		Fan,
		Ac,
		Bulb;
	}
	
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
		try(Connection connection=DriverManager.getConnection(DatabaseConnection.getUrl());
				Statement statement=connection.createStatement();
				ResultSet result=statement.executeQuery(query)){
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
		try(Connection connection=DriverManager.getConnection(DatabaseConnection.getUrl());
				Statement statement=connection.createStatement();
				ResultSet result=statement.executeQuery(query)){
				} catch (SQLException e) {
				}
	}
	
	public static int getCount() throws ClassNotFoundException
	{
		String query=COUNTQUERY;
		Class.forName(LOAD_JDBC_DRIVER);
		try(Connection connection=DriverManager.getConnection(DatabaseConnection.getUrl());
				Statement statement=connection.createStatement();
				ResultSet result=statement.executeQuery(query)){
			result.next();
			int count=result.getInt("count");
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
		try(Connection connection=DriverManager.getConnection(DatabaseConnection.getUrl());
				Statement statement=connection.createStatement();
				ResultSet result=statement.executeQuery(query)){
			result.next();
			boolean state=result.getBoolean("state");
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
		try(Connection connection=DriverManager.getConnection(DatabaseConnection.getUrl());
				Statement statement=connection.createStatement();
				ResultSet result=statement.executeQuery(query)){
			result.next();
			String name=result.getString(NAME);
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
		try(Connection connection=DriverManager.getConnection(DatabaseConnection.getUrl());
				Statement statement=connection.createStatement();
				ResultSet result=statement.executeQuery(query)){
			result.next();
			int ind=result.getInt("id");
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
		try(Connection connection=DriverManager.getConnection(DatabaseConnection.getUrl());
				Statement statement=connection.createStatement();
				ResultSet result=statement.executeQuery(query)){
			while(result.next())
			{
				
				int id=result.getInt(ID);
				String name=result.getString(NAME);
				boolean state=result.getBoolean(STATE);
				int number=result.getInt(NUMBER);
				Type type=Type.valueOf(name);
				switch(type)
				{
				case Fan:
					Fan createFan=new Fan();
					createFan.set(state, id,number);
					data.add(createFan);
					break;
				case Ac:
					Ac createAc=new Ac();
					createAc.set(state, id,number);
					data.add(createAc);
					break;
				case Bulb:
					Bulb createBulb=new Bulb();
					createBulb.set(state, id,number);
					data.add(createBulb);
					break;
				}

			}
			return data;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} 
	}
}
