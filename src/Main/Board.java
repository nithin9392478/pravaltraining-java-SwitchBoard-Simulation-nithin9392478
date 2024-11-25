package Main;


import java.util.HashMap;
import INPUT.Input;
import APPLIANCE.Appliance;
import DISPLAY.Display;
import SERVICE.CreateObjArray;

public class Board extends Input {
    Board(){
	
	input();
	Appliance obj[]=new Appliance[numberOfFan+numberOfAc+numberOfBulb];
	HashMap<Integer,Appliance> h1=new HashMap<>();
	CreateObjArray service=new CreateObjArray();
	service.createobjArray(numberOfFan,"Fan",false,obj,h1);
	service.createobjArray(numberOfAc,"Ac",false,obj,h1);
	service.createobjArray(numberOfBulb,"Bulb",false,obj,h1);
    Display A=new Display();
	A.display(true,obj,h1);
	System.out.println("Exit from board");
	
	
}

}
