package contract;

import java.sql.SQLException;
import java.util.HashMap;

import model.Appliance;

public interface IChangeState {
	public boolean changeState(int statenum,int itemnum) throws ClassNotFoundException, SQLException;
}
