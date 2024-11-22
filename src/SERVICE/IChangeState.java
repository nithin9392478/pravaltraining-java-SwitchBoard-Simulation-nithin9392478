package SERVICE;

import java.util.HashMap;
import APPLIANCE.Appliance;

public interface IChangeState {
	public void createobjArray(int n,String name,boolean state,Appliance obj[],HashMap<Integer,Appliance> h1);
	public boolean changeState(int statenum,Appliance obj[],int itemnum,HashMap<Integer,Appliance> h1);
}