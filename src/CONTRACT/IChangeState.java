package CONTRACT;


import java.util.HashMap;

import MODEL.Appliance;

public interface IChangeState {
	public boolean changeState(int statenum,Appliance obj[],int itemnum,HashMap<Integer,Appliance> h1);
}
