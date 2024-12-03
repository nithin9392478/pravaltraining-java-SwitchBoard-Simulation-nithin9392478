package service;


import contract.IInsertinDataBase;
import database.DataBaseQueries;

public class InsertinDataBase implements IInsertinDataBase{
	
	public void insertinDataBase(int n,String name,boolean state) throws ClassNotFoundException
	{
		for(int i=0;i<n;i++)
		{
			
			DataBaseQueries.put(name,state);
			
		}
	}


}