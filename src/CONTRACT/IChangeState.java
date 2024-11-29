package CONTRACT;

import java.sql.SQLException;
import java.util.HashMap;

import model.Appliance;

public interface IChangeState {
	public boolean changeState(int statenum,Appliance obj[],int itemnum,HashMap<Integer,Appliance> h1) throws ClassNotFoundException, SQLException;
}
