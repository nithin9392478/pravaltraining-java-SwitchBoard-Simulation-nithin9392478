package model;

public class Appliance{
	private String name;
    private boolean state;
	private int id;
	private int number;
	public void set(String name,boolean state,int id,int number)
	{
		this.state=state;
		this.name=name;
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
