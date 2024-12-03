package provider;


import java.util.List;
import constant.Constant;
import database.DataBaseSelectQueries;
import service.ChangeState;
import model.Appliance;

public class Display extends Constant{

	public void display(boolean exit) throws ClassNotFoundException 
	{
		Input inputObject=new Input();
		while(exit)
		{
			
			DataBaseSelectQueries dataObject=new DataBaseSelectQueries();
			List<Appliance> data=dataObject.getDataBase();
			for(int i=0;i<data.size();i++)
			{
				System.out.println(data.get(i).getInd()+"."+data.get(i).getName()+" "+data.get(i).getNumber()+" "+((data.get(i).getState())?"ON":"OFF"));
			}
			
			System.out.println("0."+EXIT);
			System.out.println(EnterDeviceno); 
			
			int itemnum=inputObject.iteminput();
			

			
			int count =DataBaseSelectQueries.getCount();
			System.out.println(count);
			if(itemnum==0)                                            //obj.length+1
			{
				exit=false;
			}
			else if(itemnum>0 && itemnum<=count)    	                                  //obj.length
			{
				boolean isState=true;
				while(isState)
				{
					
					String name=DataBaseSelectQueries.getName(itemnum);
					boolean state=DataBaseSelectQueries.getState(itemnum);
					
					System.out.println("1. "+SWITCH+" "+name+" "+((state)?"OFF":"ON"));              
					System.out.println("2."+BACK);
					System.out.println(SELECT_STATE);
					int statenum=inputObject.stateinput();
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






