package CONTRACT;

import java.sql.SQLException;
import java.util.HashMap;

import model.Appliance;

public interface IInsertinMap {
	public void insertinmap(int n,String name,boolean state,Appliance obj[],HashMap<Integer,Appliance> h1) throws ClassNotFoundException, SQLException;
}
