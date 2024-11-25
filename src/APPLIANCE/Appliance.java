package APPLIANCE;

public class Appliance{
	private int number;
	private String name;
    private boolean state;
	private int ind;
	
	public void set(int number,String name,boolean state,int ind)
	{
		this.number=number;
		this.state=state;
		this.name=name;
		this.ind=ind;
	}
	public void setState(boolean state)
	{
		this.state=state;
	}
	public int getNumber()
	{
		return number;
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
		return ind;
	}

}
