package SERVICE;


import java.util.HashMap;
import CONTRACT.IInsertinMap;
import MODEL.Appliance;



public class InsertinMap implements IInsertinMap{
	public static int ind=0;
	public void insertinmap(int n,String name,boolean state,Appliance[] obj,HashMap<Integer,Appliance> h1)
	{
		for(int i=0;i<n;i++)
		{
			
			
			obj[ind]=new Appliance();
			obj[ind].set(i+1,name,false,ind+1);
			
			Appliance ob=new Appliance();
			ob.set(i+1,name,false,ind+1);
			h1.put(ind+1,ob);
	
			

			
			ind++;
		}
	}


}