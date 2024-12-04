package model;
import constant.Constant;

public class Ac extends Appliance {
	private String name=Constant.AC;
    private boolean state;
	private int id;
	private int number;
	
	public void set(boolean state,int id,int number)
	{
		this.state=state;
		this.id=id;
		this.number=number;
	}
	public void setState(boolean state)
	{
		this.state=state;
	} 
	public String getName()
	{
		return name;
	}
	public boolean getState()
	{
		return state;
	}
	public int getInd()
	{
		return id;
	}
	public int getNumber()
	{
		return number;
	}
}
