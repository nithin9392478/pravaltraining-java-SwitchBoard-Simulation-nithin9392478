package view;

import java.util.List;
import constant.Constant;
import provider.ChangeState;
import model.Appliance;
import provider.GetFromDataBase;

public class Display extends Constant{

	public void showConsole(boolean exit) throws ClassNotFoundException 
	{
		Input input=new Input();
		while(exit)
		{
			
			GetFromDataBase tabledata=new GetFromDataBase();
			List<Appliance> data=tabledata.getDataBase();
			for(int i=0;i<data.size();i++)
			{
				System.out.println(data.get(i).getInd()+"."+data.get(i).getName()+" "+data.get(i).getNumber()+" "+((data.get(i).getState())?On:Off));
			}
			
			System.out.println("0."+EXIT);
			System.out.println(EnterDeviceno); 
			
			int itemnum=input.itemInput();
			int count =tabledata.getCount();
			
			if(itemnum==0)                                           
			{
				exit=false;
			}
			else if(itemnum>0 && itemnum<=count)    	                                 
			{
				boolean isState=true;
				while(isState)
				{
					
					String name=tabledata.getName(itemnum);
					boolean state=tabledata.getState(itemnum);
					
					System.out.println("1. "+SWITCH+" "+name+" "+((state)?Off:On));              
					System.out.println("2."+BACK);
					System.out.println(SELECT_STATE);
					int statenum=input.stateInput();
					
					
					ChangeState service=new ChangeState();
					isState=service.changeState(statenum,itemnum);
					
					
					if(!isState)
					{
						System.out.println(STATE_CHANGE);
					}

				}
			}
			else {
				System.out.println(ENTER_VALID_IN);
			}

		}
	}
		
}
