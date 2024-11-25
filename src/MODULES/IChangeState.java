package MODULES;

import java.util.HashMap;

import APPLIANCE.Appliance;

public interface IChangeState {
	public boolean changeState(int statenum,Appliance obj[],int itemnum,HashMap<Integer,Appliance> h1);
}
