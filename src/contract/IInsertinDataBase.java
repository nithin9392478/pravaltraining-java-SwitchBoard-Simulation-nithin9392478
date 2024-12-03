package contract;

import java.sql.SQLException;
import java.util.HashMap;

import model.Appliance;

public interface IInsertinDataBase {
	public void insertinDataBase(int n,String name,boolean state) throws ClassNotFoundException, SQLException;
}
