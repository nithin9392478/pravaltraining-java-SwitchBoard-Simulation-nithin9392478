package switchboard;

public class Appliance{
	private int number;
	private String name;
    private boolean state;
	private int ind;
	
	void set(int number,String name,boolean state,int ind)
	{
		this.number=number;
		this.state=state;
		this.name=name;
		this.ind=ind;
	}
	void setState(boolean state)
	{
		this.state=state;
	}
	int getNumber()
	{
		return number;
	}
	String getName()
	{
		return name;
	}
	boolean getState()
	{
		return state;
	}
	int getInd()
	{
		return ind;
	}
	void show()
	{
		String s="";
		s=s+((this.state==false)?"Off":"On");
		System.out.println(this.ind+"."+this.name+" "+this.number+" is"+" "+s);
	}
}
