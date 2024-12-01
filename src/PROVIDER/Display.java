package PROVIDER;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

import CONSTANT.Constant;
import DATABASE.ConnectionDataBase;
import model.Appliance;

import SERVICE.ChangeState;

public class Display extends Constant{

	public void display(boolean exit,Appliance obj[],HashMap<Integer,Appliance> h1) throws ClassNotFoundException, SQLException
	{
		Input input=new Input();
		while(exit)
		{
			
			
//			for(int i=0;i<h1.size();i++)                                  //obj.length
//			{
////				obj[i].show();
//		
//				System.out.println(concateStringState(i,h1));
//			}
			

			
			String query="select *,rank() over(PARTITION BY name order by id) as number from appliance group by name,id,state  order by name desc";
			String length="select count(*) as count1 from appliance";
			
			
			ConnectionDataBase connection=new  ConnectionDataBase();
			Connection con=connection.connection();
			Statement st=con.createStatement();
			ResultSet rs =st.executeQuery(query);
			
			while(rs.next())
			{
				int id=rs.getInt("id");
				String name =rs.getString("name");
				int number=rs.getInt("number");
				boolean state=rs.getBoolean("state");
				System.out.println(id+"."+name+" "+number+" "+((state)?"ON":"OFF"));
			}
			
			
			System.out.println("0."+EXIT);
			System.out.println(EnterDeviceno);
			
			int itemnum=input.iteminput();
			
			Statement st1=con.createStatement();
			ResultSet rs1 =st1.executeQuery(length);
			
			rs1.next();
			int count =rs1.getInt(1);
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
					String query2="select * from appliance where id="+itemnum;
					
					Statement st2=con.createStatement();
					ResultSet rs2 =st2.executeQuery(query2);
					rs2.next();
					String name=rs2.getString("name");
					boolean state=rs2.getBoolean("state");
					
					System.out.println("1. "+SWITCH+" "+name+" "+((state)?"OFF":"ON"));              ///////////////////////
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static String concateStringItem(int itemnum,HashMap<Integer,Appliance> h1)
//	{
//		String s="";
////		s=s+"1."+SWITCH+" "+h1.get(itemnum).getName()+" "+h1.get(itemnum).getNumber()+" "+((h1.get(itemnum).getState())?Off:On);
//		
//		
//		s=s.concat("1.");
//		s=s.concat(SWITCH);
//		s=s.concat(" ");
//		s=s.concat(h1.get(itemnum).getName()+"");
//		s=s.concat(" ");
//		s=s.concat(h1.get(itemnum).getNumber()+"");
//		s=s.concat(" ");
//		s=s.concat(((h1.get(itemnum).getState())?Off:On));
//		return s;
//	}
//	
//	public static String concateStringState(int i,HashMap<Integer,Appliance> h1)
//	{
//		String s="";
//		s=s.concat(h1.get(i+1).getInd()+"");
//		s=s.concat(" ");
//		s=s.concat(h1.get(i+1).getName()+"");
//		s=s.concat(" ");
//		s=s.concat(h1.get(i+1).getNumber() +"");
//		s=s.concat(" is");
//		s=s.concat(" ");
//		s=s.concat((!(h1.get(i+1).getState())?"Off":"On"));
//		return s;
//	}
		
}