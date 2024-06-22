
public class Main {

	public static void main(String[] args) {
	    SystemManager sm = new SystemManager();
	  
	    Location A = new Airport ("YYZ");
	    Location B = new Airport ("YVR");
	    Location C = new Airport ("LAX");
	    Location D = new TruckDepot ("TRK001");
	    Location E = new TruckDepot ("TRK002");
	    Location F = new BikeDeliveryLocation ("BIK001");
	    Location G = new BikeDeliveryLocation ("BIK002");

	    sm.addLocation(A);
	    sm.addLocation(B);
	    sm.addLocation(C);
	    sm.addLocation(D);
	    sm.addLocation(E);
	    sm.addLocation(F);
	    sm.addLocation(G);
	  
	   

	    sm.addLeg(new Flight(A, B, 3350, "MTWRFSU"));
	    sm.addLeg(new Flight(B, C, 1750, "MTWRFSU"));
	    sm.addLeg(new TruckLeg(A, D, 50, "MWFSU"));
	    
	    sm.addLeg(new TruckLeg(D, E, 1000, "MTWRFU"));
	    sm.addLeg(new TruckLeg(E, B, 50, "MTWRFU"));
	    sm.addLeg(new BikeLeg(D, F, 10, "MTWRFU"));
	    sm.addLeg(new BikeLeg(F, G, 20, "MTWRFSU")); 
	    sm.addLeg(new BikeLeg(G, E, 10, "MTWRFSU"));
	    
	    System.out.println("connecting: " + A.connecting);
	   
	    // TruckDepot t1 to TruckDepot t4
	    System.out.println("------- A to E ----------");
	    Route rA = sm.findMinStepsRoute(sm.findLocation("YYZ"), sm.findLocation("TRK002"), "M");
	    System.out.println("\n\nCheapest Route: ");
	    System.out.println(rA);

	  
	    
	}

}
