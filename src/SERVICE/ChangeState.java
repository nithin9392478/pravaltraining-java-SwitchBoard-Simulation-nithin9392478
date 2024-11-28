package SERVICE;

import java.util.HashMap;
import CONTRACT.IChangeState;
import model.Appliance;

public class ChangeState implements IChangeState  {
	
	public enum State{
		Exit,
		Toggle,
		Back;
	}
	
	public boolean changeState(int statenum,Appliance[] obj,int itemnum,HashMap<Integer,Appliance> h1)
	{
	    boolean isState=true;
	    
	    State s1=State.values()[statenum];
	   
	    
		switch(s1) {
		case Toggle:
			
			
//			obj[itemnum-1].setState(((obj[itemnum-1].getState())?false:true));
			
			
			h1.get(itemnum).setState(((h1.get(itemnum).getState())?false:true));
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