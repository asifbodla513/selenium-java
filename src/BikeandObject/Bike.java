package BikeandObject;

import java.util.HashMap;
import java.util.Scanner;

public class Bike {

	
 
	
	
	 public HashMap generalfunction() {		
		 
		 HashMap<String, String> Gspecification=new HashMap<>();
		
		Gspecification.put("head_light", "1");
		Gspecification.put("Tyres", "2");
		Gspecification.put("indicators", "4");
		Gspecification.put("Shock_Absorber", "4");
		Gspecification.put("Lock_System", "2");
		
		return Gspecification;
		
	 }
	
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub


HashMap<String, String> Gspecification=new HashMap<>();		
			
			
        Bike b=new Bike();
		

        Gspecification= b.generalfunction();
        
        
			 try (Scanner myObj = new Scanner(System.in)) {
		
			switch(myObj.nextInt()) {
			   
			   case 1:
				   generlbike gb=new generlbike( );
				   gb.specifiy();
				   
				   
				   break;
				   
			   case 2:
				   EveeBike   eb=new EveeBike();
				   eb.specifiy();
				   
				   break;
				   
			   default:
				   System.out.println("please enter value between 1 to 2");
		   
			}
			
			
			
			
			
			
			
			

			
		 
		
		
		
	}
		
		

		

}


}
