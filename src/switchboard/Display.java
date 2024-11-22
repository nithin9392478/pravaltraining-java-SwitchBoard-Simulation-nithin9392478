package switchboard;
import java.util.*;
public class Display extends Constant{

	void display(boolean exit,Appliance obj[],HashMap<Integer,Appliance> h1)
	{
		Input input=new Input();
		while(exit)
		{
			for(int i=0;i<h1.size();i++)                                  //obj.length
			{
//				obj[i].show();
				
				h1.get(i+1).show();
			}
			System.out.println((obj.length+1)+"."+EXIT);
			System.out.println(EnterDeviceno);
			
			int itemnum=input.iteminput();
			if(itemnum==(h1.size()+1))                                            //obj.length+1
			{
				exit=false;
			}
			else if(itemnum>0 && itemnum<=h1.size())                                      //obj.length
			{
				boolean flag1=true;
				while(flag1)
				{
//					System.out.println("1."+SWITCH+" "+obj[itemnum-1].getName()+obj[itemnum-1].getNumber()+" "+((obj[itemnum-1].getState())?Off:On));
					
					System.out.println("1."+SWITCH+" "+h1.get(itemnum).getName()+h1.get(itemnum).getNumber()+" "+((h1.get(itemnum).getState())?Off:On));
					System.out.println("2."+BACK);
					System.out.println(SELECT_STATE);
					int statenum=input.iteminput();
					Service service=new Service();
					flag1=service.changeState(statenum,obj,itemnum,h1);
					if(!flag1)
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
