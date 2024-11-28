package SERVLATE;

import java.util.HashMap;

import CONSTANT.Constant;
import model.Appliance;

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
		
				System.out.println(concateStringState(i,h1));
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
					
					System.out.println(concateStringItem(itemnum,h1));
					System.out.println("2."+BACK);
					System.out.println(SELECT_STATE);
					int statenum=input.stateinput();
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
	
	
	public static String concateStringItem(int itemnum,HashMap<Integer,Appliance> h1)
	{
		String s="";
//		s=s+"1."+SWITCH+" "+h1.get(itemnum).getName()+" "+h1.get(itemnum).getNumber()+" "+((h1.get(itemnum).getState())?Off:On);
		s=s.concat("1.");
		s=s.concat(SWITCH);
		s=s.concat(" ");
		s=s.concat(h1.get(itemnum).getName()+"");
		s=s.concat(" ");
		s=s.concat(h1.get(itemnum).getNumber()+"");
		s=s.concat(" ");
		s=s.concat(((h1.get(itemnum).getState())?Off:On));
		return s;
	}
	
	public static String concateStringState(int i,HashMap<Integer,Appliance> h1)
	{
		String s="";
		s=s.concat(h1.get(i+1).getInd()+"");
		s=s.concat(" ");
		s=s.concat(h1.get(i+1).getName()+"");
		s=s.concat(" ");
		s=s.concat(h1.get(i+1).getNumber() +"");
		s=s.concat(" is");
		s=s.concat(" ");
		s=s.concat((!(h1.get(i+1).getState())?"Off":"On"));
		return s;
	}
		
}