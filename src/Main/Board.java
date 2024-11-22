package Main;

//import static switchboard.Input.numberOfAc;
//import static switchboard.Input.numberOfBulb;
//import static switchboard.Input.numberOfFan;

//import java.util.HashMap;
//import switchboard.Appliance;
//import switchboard.Display;
//import INPUT.*;
//import switchboard.Service;

import java.util.HashMap;
import INPUT.*;
import APPLIANCE.*;
import DISPLAY.*;
import SERVICE.Service;

public class Board extends Input {
    Board(){
	
	input();
	Appliance obj[]=new Appliance[numberOfFan+numberOfAc+numberOfBulb];
	HashMap<Integer,Appliance> h1=new HashMap<>();
	Service service=new Service();
	service.createobjArray(numberOfFan,"Fan",false,obj,h1);
	service.createobjArray(numberOfAc,"Ac",false,obj,h1);
	service.createobjArray(numberOfBulb,"Bulb",false,obj,h1);
    Display A=new Display();
	A.display(true,obj,h1);
	System.out.println("Exit from board");
	
	
}

}
