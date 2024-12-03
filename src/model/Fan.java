package model;
import constant.Constant;

public class Fan {
	private String name=Constant.FAN;
    private boolean state;
	private int id;
	
	public void set(boolean state,int id)
	{
		this.state=state;
		this.id=id;
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
}