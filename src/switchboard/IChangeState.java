package switchboard;


import java.util.HashMap;

public interface IChangeState {
	public boolean changeState(int statenum,Appliance obj[],int itemnum,HashMap<Integer,Appliance> h1);
	public void createobjArray(int n,String name,boolean state,Appliance obj[],HashMap<Integer,Appliance> h1);
}
