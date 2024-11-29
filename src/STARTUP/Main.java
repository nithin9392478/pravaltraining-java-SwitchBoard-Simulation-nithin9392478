package STARTUP;

import java.sql.SQLException;

import DATABASE.ConnectionDataBase;
import PROVIDER.Board;


public class Main {
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Board objb= new Board();
		objb.board();
		ConnectionDataBase db=new ConnectionDataBase();
		db.connection();
	}
}
