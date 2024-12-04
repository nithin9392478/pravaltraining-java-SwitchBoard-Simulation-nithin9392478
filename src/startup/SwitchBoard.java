package startup;

import provider.InsertinDataBase;
import constant.Constant;
import view.Input;
import view.Display;

public class SwitchBoard extends Input {
	
	
    public void createBoard() throws ClassNotFoundException{

    	
    	
    	int numberOfFan=noOfApplianceInput(Constant.FAN);
    	int numberOfAc=noOfApplianceInput(Constant.AC);
    	int numberOfBulb=noOfApplianceInput(Constant.BULB);
    	
    	
		InsertinDataBase initialState=new InsertinDataBase();
		
		initialState.insertinDataBase(numberOfFan,Constant.FAN,false);
		initialState.insertinDataBase(numberOfBulb,Constant.BULB,false);
		initialState.insertinDataBase(numberOfAc,Constant.AC,false);
		
		Display view=new Display();
		view.showConsole(true);
		
		System.out.println("Exit from board");
	}

    

}
