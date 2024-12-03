package startup;

import java.sql.SQLException;

import provider.Board;


public class Main {
	public static void main(String args[]) throws ClassNotFoundException
	{
		Board objboard= new Board();
		objboard.createBoard();
	}
}
