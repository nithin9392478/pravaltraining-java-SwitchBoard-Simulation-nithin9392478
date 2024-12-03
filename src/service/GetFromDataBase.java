package service;
import model.Appliance;
import java.util.List;
import java.util.ArrayList;

import database.DataBaseQueries;

public class GetFromDataBase {
	
	public int getCount() throws ClassNotFoundException
	{
		int count=DataBaseQueries.getCount();
		return count;
	}
	
	public String getName(int id) throws ClassNotFoundException
	{
		String name=DataBaseQueries.getName(id);
		return name;
	}
	
	public boolean getState(int id) throws ClassNotFoundException
	{
		boolean state=DataBaseQueries.getState(id);
		return state;
	}
	
	public List<Appliance> getDataBase() throws ClassNotFoundException
	{
		DataBaseQueries tabledata=new DataBaseQueries();
		List<Appliance> data=new ArrayList<>();
		data=tabledata.getDataBase();
		return data;
	}
}
