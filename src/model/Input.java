package model;

import view.Constant;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Input extends Constant{


    public static int input(String device)
	{
    	Scanner sc=new Scanner(System.in);
    	boolean isState=true;
    	int noOFDevice=0;
    	while(isState)
    	{
        	try {
        		System.out.println(ENTER_NO+" "+device);
        		noOFDevice=sc.nextInt();
        		if(noOFDevice<0)
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
    	return noOFDevice;
    

	}
    
    
	public int stateinput()
	{
		Scanner sc=new Scanner(System.in);
		int itemnum=0;
		boolean isItem=true;
		while(isItem)
		{
			try {
				itemnum=sc.nextInt();
				if(itemnum<=0 || itemnum>2)
				{
					isItem=true;
					System.out.println(ENTER_VALID_IN);
				}
				else {
					isItem=false;
				}
			}
			catch(InputMismatchException e){
				System.out.println(ENTER_VALID_IN);
				sc.next();
			}
		}
		return itemnum;
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
