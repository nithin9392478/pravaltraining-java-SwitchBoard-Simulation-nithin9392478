package database;
import constant.Constant;

public class DatabaseConnection extends Constant{
	private final static String url=JDBC_LOGIN;
	public static String getUrl()
	{
		return url;
	}
	

}
