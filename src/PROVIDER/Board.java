package PROVIDER;                                                        //provider

import java.sql.SQLException;
import java.util.HashMap;
import SERVICE.InsertinMap;
import model.Appliance;
import CONSTANT.Constant;

public class Board extends Input {
	
    public void board() throws ClassNotFoundException, SQLException{
    	
    	
    	int numberOfFan=input(Constant.FAN);
    	int numberOfAc=input(Constant.AC);
    	int numberOfBulb=input(Constant.BULB);
		Appliance obj[]=new Appliance[numberOfFan+numberOfAc+numberOfBulb];
		HashMap<Integer,Appliance> h1=new HashMap<>();
		
		InsertinMap service=new InsertinMap();
		service.insertinmap(numberOfFan,Constant.FAN,false,obj,h1);
		service.insertinmap(numberOfAc,Constant.AC,false,obj,h1);
		service.insertinmap(numberOfBulb,Constant.BULB,false,obj,h1);
		
	    Display A=new Display();
		A.display(true,obj,h1);
		System.out.println("Exit from board");
	}

    

}
