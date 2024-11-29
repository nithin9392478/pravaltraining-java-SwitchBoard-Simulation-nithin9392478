package SERVICE;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import CONTRACT.IInsertinMap;
import model.Appliance;
import DATABASE.ConnectionDataBase;


public class InsertinMap implements IInsertinMap{
	public static int ind=0;
	public void insertinmap(int n,String name,boolean state,Appliance[] obj,HashMap<Integer,Appliance> h1) throws ClassNotFoundException, SQLException
	{
		for(int i=0;i<n;i++)
		{
//			obj[ind]=new Appliance();
//			obj[ind].set(i+1,name,false,ind+1);
			
			Appliance ob=new Appliance();
			ob.set(i+1,name,false,ind+1);
			h1.put(ind+1,ob);
	
			
			String s="insert into appliance(id,name,state,number) values("+(ind+1)+","+"'"+(name+"")+"'"+","+"'"+(state+"")+"'"+","+(i+1)+")";
			ConnectionDataBase db=new ConnectionDataBase();
			Connection con=db.connection();
			Statement st=con.createStatement();
			st.executeUpdate(s);
			st.close();
			con.close();
			
			ind++;
		}
	}


}