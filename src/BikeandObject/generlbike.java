package BikeandObject;

import java.util.HashMap;

public class generlbike extends Bike {

	
	
	
	
	
	
	public void specifiy() {
		generlbike gb=new generlbike();
HashMap<String, String> specification=new HashMap<>();		
HashMap<String, String> gbspecification= gb.generalfunction();		


		specification.put("Engin", "Petrole_Engin");
		specification.put("bettery", "Small_indicator and headlight bettery");
		specification.put("max_speed", "120km/hr");
		specification.put("Price", "160k");
		
		System.out.println("\033[0;1m ----------------------------GENERAL---------------------------------");
		
		
		gbspecification.forEach(
	            (key, value)
	                -> System.out.println(key + " = " + value));
	
		System.out.println("\033[0;1m ----------------------------petrole---------------------------------");
		
		specification.forEach(
	            (key, value)
	                -> System.out.println(key + " = " + value));
		
		
		
	}
		
		
		
		
		
	}
	
	

