package switchboard;
import java.util.*;

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






