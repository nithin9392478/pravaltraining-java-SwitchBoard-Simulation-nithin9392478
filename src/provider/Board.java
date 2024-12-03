package provider;                                                        //provider



import service.InsertinDataBase;
import constant.Constant;

public class Board extends Input {
	
	
    public void createBoard() throws ClassNotFoundException{

    	
    	
    	int numberOfFan=noOfApplianceInput(Constant.FAN);
    	int numberOfAc=noOfApplianceInput(Constant.AC);
    	int numberOfBulb=noOfApplianceInput(Constant.BULB);
    	
    	
		InsertinDataBase initialState=new InsertinDataBase();
		
		initialState.insertinDataBase(numberOfFan,Constant.FAN,false);
		initialState.insertinDataBase(numberOfBulb,Constant.BULB,false);
		initialState.insertinDataBase(numberOfAc,Constant.AC,false);
		
		Display A=new Display();
		A.display(true);
		System.out.println("Exit from board");
	}

    

}