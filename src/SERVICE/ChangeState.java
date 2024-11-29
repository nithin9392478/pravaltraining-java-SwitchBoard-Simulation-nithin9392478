package SERVICE;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import CONTRACT.IChangeState;
import DATABASE.ConnectionDataBase;
import model.Appliance;

public class ChangeState implements IChangeState  {
	
	public enum State{
		Exit,
		Toggle,
		Back;
	}
	
	public boolean changeState(int statenum,Appliance[] obj,int itemnum,HashMap<Integer,Appliance> h1) throws ClassNotFoundException, SQLException
	{
	    boolean isState=true;
	    
	    State s1=State.values()[statenum];
	   
	    
		switch(s1) {
		case Toggle:
			
			
//			obj[itemnum-1].setState(((obj[itemnum-1].getState())?false:true));
			
			h1.get(itemnum).setState(((h1.get(itemnum).getState())?false:true));
			
			
			boolean finalState=false;
			String query="select *from appliance where id="+itemnum;
			ConnectionDataBase db=new ConnectionDataBase();
			Connection con=db.connection();
			Statement st1=con.createStatement();
			ResultSet rs =st1.executeQuery(query);
			
			Statement st=con.createStatement();
			
			rs.next();
			String state=rs.getString("state");
	
			int id=rs.getInt("id");
		
			finalState=(state=="true"?false:true);
			String updateState="update appliance set state="+"'"+(finalState+"")+"'"+"where id="+"'"+id+"'";
			st.executeUpdate(updateState);
			st.close();
			st1.close();
			con.close();
			isState=false;
			break;
		case Back:
			isState=false;
			break;
		default:
			isState=true;
			break;
		}
		return isState;
	}

}