import java.util.ArrayList;

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
