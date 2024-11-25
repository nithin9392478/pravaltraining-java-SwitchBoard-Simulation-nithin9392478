package SERVICE;

import java.util.HashMap;
import MODULES.ICreateObjArray;
import APPLIANCE.Appliance;

public class CreateObjArray implements ICreateObjArray{
	public static int ind=0;
	public void createobjArray(int n,String name,boolean state,Appliance[] obj,HashMap<Integer,Appliance> h1)
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




}
