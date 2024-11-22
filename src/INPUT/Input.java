package INPUT;


import CONSTANT.Constant;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Input extends Constant{

	public static int numberOfFan;
	public static int numberOfAc;
	public static int numberOfBulb;
    public static void input()
	{
    	Scanner sc=new Scanner(System.in);
    	boolean isState=true;
    	Constant c1=new Constant();
 
    	while(isState)
    	{
        	try {
        		System.out.println(ENTER_NO+" "+FAN);
        		numberOfFan=sc.nextInt();
        		if(numberOfFan<0)
        		{
        			System.out.println(ENTER_VALID_IN);
        			isState=true;
        		}
        		else {
        			isState=false;
        		}
        	}
        	catch(InputMismatchException e){
        		System.out.println(ENTER_VALID_IN);
        		sc.next();
        		isState=true;
        	}
    	}
    	isState=true;
    	while(isState)
    	{
        	try {
        		System.out.println(ENTER_NO+" "+AC);
        		numberOfAc=sc.nextInt();
        		if(numberOfAc<0)
        		{
        			System.out.println(ENTER_VALID_IN);
        			isState=true;
        		}
        		else {
        			isState=false;
        		}
        	}
        	catch(InputMismatchException e){
        		System.out.println(ENTER_VALID_IN);
        		sc.next();
        		isState=true;
        	}
    	}
    	isState=true;
    	while(isState)
    	{
        	try {
        		System.out.println(ENTER_NO+" "+BULB);
        		numberOfBulb=sc.nextInt();
        		if(numberOfBulb<0)
        		{
        			System.out.println(ENTER_VALID_IN);
        			isState=true;
        		}
        		else {
        			isState=false;
        		}
        	}
        	catch(InputMismatchException e){
        		System.out.println(ENTER_VALID_IN);
        		sc.next();
        		isState=true;
        	}
    	}
    

	}
    
	public int iteminput()
	{
		Scanner sc=new Scanner(System.in);
		int itemnum=0;
		boolean isItem=true;
		while(isItem)
		{
			try {
				itemnum=sc.nextInt();
				isItem=false;
			}
			catch(InputMismatchException e){
				System.out.println(ENTER_VALID_IN);
				sc.next();
			}
		}
		return itemnum;
	}
}
