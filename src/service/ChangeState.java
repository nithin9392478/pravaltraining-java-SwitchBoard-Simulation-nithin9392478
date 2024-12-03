package service;


import contract.IChangeState;
import database.DataBaseSelectQueries;
import database.DataBaseUpdateQueries;

public class ChangeState implements IChangeState  {
	
	public enum State{
		Exit,
		Toggle,
		Back;
	}
	
	public boolean changeState(int statenum,int itemnum) throws ClassNotFoundException
	{
	    boolean isState=true;
	    
	    State s1=State.values()[statenum];
	   
	    
		switch(s1) {
		case Toggle:
			
			
//			obj[itemnum-1].setState(((obj[itemnum-1].getState())?false:true));
			
//			h1.get(itemnum).setState(((h1.get(itemnum).getState())?false:true));
			
			
			boolean finalState;
			boolean state=DataBaseSelectQueries.getState(itemnum);
	
			
			
			finalState=((state)?false:true);
			
			DataBaseUpdateQueries.updateInDatabase(itemnum, finalState);
			
			
			isState=false;
			break;
		case Back:
			isState=false;
			break;
		default:
			isState=true;
			break;
		}
		return isState;
	}

}