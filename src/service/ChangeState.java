package service;


import contract.IChangeState;
import database.DataBaseQueries;

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

			boolean finalState;
			GetFromDataBase applianceState=new GetFromDataBase();
			boolean state=applianceState.getState(itemnum);
			finalState=((state)?false:true);
			DataBaseQueries.set(itemnum, finalState);
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