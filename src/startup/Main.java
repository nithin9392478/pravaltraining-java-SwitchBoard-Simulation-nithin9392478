package startup;



import provider.SwitchBoard;


public class Main {
	public static void main(String args[]) throws ClassNotFoundException 
	{
		SwitchBoard board= new SwitchBoard();
		board.createBoard();
	}
}