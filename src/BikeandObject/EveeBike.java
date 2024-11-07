package BikeandObject;

import java.util.HashMap;

public class EveeBike {
	
		
		
		
		
		
		
		
		
		public void specifiy() {
			generlbike gb=new generlbike();
	HashMap<String, String> specification=new HashMap<>();		
	HashMap<String, String> EVspecification= gb.generalfunction();		


	specification.put("Engin", "Electric_Engin");
	specification.put("bettery", "Big_RechargAble_Bettery");
	specification.put("max_speed", "40km/hr");
	specification.put("OneTimeCoverage", "40 km for jsut one time bettery regcharge");
	specification.put("Noise", "Noisless");
	specification.put("Price", "200k");
			
			System.out.println("\033[0;1m ----------------------------GENERAL---------------------------------");
			
			EVspecification.forEach(
		            (key, value)
		                -> System.out.println(key + " = " + value));
		
			System.out.println("\033[0;1m ----------------------------petrole---------------------------------");
			
			specification.forEach(
		            (key, value)
		                -> System.out.println(key + " = " + value));
			
			
			
		}
		
		
		
		
		
		
		
		


	
	

}
