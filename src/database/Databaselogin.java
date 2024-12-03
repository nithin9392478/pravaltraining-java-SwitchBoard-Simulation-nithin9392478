package database;

public class Databaselogin {
	private final static String url="jdbc:sqlserver://L-IT-0189:1433;databaseName=db;encrypt=true;trustServerCertificate=true;integratedSecurity=true;";
	public static String getUrl()
	{
		return url;
	}
	

}
