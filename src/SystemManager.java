import java.util.ArrayList;

/**
 * The System Manager provides an interface between the client and the Route Finding System.  It contains a list of all
 * locations and a list of all the legs in the system. A text display of information on all the legs and locations in
 * the system can be accessed by calling printSystemDetails().
 */
public class SystemManager {
	private ArrayList<Location> locations = new ArrayList <Location>();
	private ArrayList<Leg> legs = new ArrayList <Leg>();
	
	public SystemManager() {
		
	}
	public void addLocation(Location l) {
		
		locations.add(l);
	}
	
	public void addLeg(Leg l) {
		l.getOrigin().addConnection(l); // keep track of legs that are connected
		legs.add(l);


	}
	
	public Location findLocation(String s) {
		for (Location i: locations) {
			if (i.getName().equals(s)) {
				return i;
			}
		}
		
		return null;
	}
	
	public Route findCheapestRoute (Location origin, Location destination, String day) {
		Route output = origin.cheapestRouteTo(destination, day);
		if(output == null) {
			
			throw new NullPointerException("No Possible Route");
			
		}
		return output;
	}
	
	public Route findShortestKmRoute (Location origin, Location destination, String day) {
		Route output = origin.shortestKmRouteTo(destination, day);
		if(output == null) {
			
			throw new NullPointerException("No Possible Route");
			
		}
		return output;
		
	}
	
	public Route findMinStepsRoute (Location origin, Location destination, String day) {
		Route output = origin.minStepsRouteTo(destination, day);
		if(output == null) {
			
			throw new NullPointerException("No Possible Route");
			
		}
		return output;
		
	}
}
