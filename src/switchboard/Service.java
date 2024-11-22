package switchboard;
import java.util.*;

public class Service implements IChangeState  {
	static int ind=0;
	
	public void createobjArray(int n,String name,boolean state,Appliance obj[],HashMap<Integer,Appliance> h1)
	{
		for(int i=0;i<n;i++)
		{
			obj[ind]=new Appliance();
			obj[ind].set(i+1,name,false,ind+1);
			
			Appliance o=new Appliance();
			o.set(i+1,name,false,ind+1);
			h1.put(ind+1,o);
			
			ind++;
		}
	}
	
	
	public boolean changeState(int statenum,Appliance obj[],int itemnum,HashMap<Integer,Appliance> h1)
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
