package DISPLAY;

import java.util.HashMap;

import APPLIANCE.Appliance;
import CONSTANT.*;
import INPUT.Input;
import SERVICE.ChangeState;

public class Display extends Constant{

	public void display(boolean exit,Appliance obj[],HashMap<Integer,Appliance> h1)
	{
		Input input=new Input();
		while(exit)
		{
			for(int i=0;i<h1.size();i++)                                  //obj.length
			{
//				obj[i].show();
				

				
				System.out.println(h1.get(i+1).getInd()+"."+h1.get(i+1).getName()+" "+h1.get(i+1).getNumber()+" is"+" "+(!(h1.get(i+1).getState())?"Off":"On"));
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
				boolean isState=true;
				while(isState)
				{
//					System.out.println("1."+SWITCH+" "+obj[itemnum-1].getName()+obj[itemnum-1].getNumber()+" "+((obj[itemnum-1].getState())?Off:On));
					
					System.out.println("1."+SWITCH+" "+h1.get(itemnum).getName()+h1.get(itemnum).getNumber()+" "+((h1.get(itemnum).getState())?Off:On));
					System.out.println("2."+BACK);
					System.out.println(SELECT_STATE);
					int statenum=input.iteminput();
					ChangeState service=new ChangeState();
					isState=service.changeState(statenum,obj,itemnum,h1);
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
