package SERVICE;

import java.util.HashMap;
import MODULES.IChangeState;
import APPLIANCE.Appliance;

public class ChangeState implements IChangeState  {
	public boolean changeState(int statenum,Appliance[] obj,int itemnum,HashMap<Integer,Appliance> h1)
	{
		boolean isState=true;
		switch(statenum) {
		case 1:
//			obj[itemnum-1].setState(((obj[itemnum-1].getState())?false:true));
			h1.get(itemnum).setState(((h1.get(itemnum).getState())?false:true));
			isState=false;
			break;
		case 2:
			isState=false;
			break;
		default:
			isState=true;
		}
		return isState;
	}
}
