
public abstract class Leg {

    /**
     * The Leg class is an abstract class defining one “leg” of a route between two locations.
     */
	private Location origin;
	private Location destination;
	private int distanceInKm = 0;
	private String days = "";
	private double cost = 0;
	
	public Leg(Location originIn, Location destinationIn, int distanceIn, String daysIn, double costIn) {
		origin = originIn;
		destination = destinationIn;
		distanceInKm = distanceIn;
		days = daysIn;
		cost = costIn;
		
	}
	
	public double getCost() {
		return cost;
	}
	
	public double getDistance() {
		return distanceInKm;
	}
	
	public Location getOrigin() {
		return origin;
	}
	
	public Location getDestination() {
		return destination;
	}
	
	public String getDays() {
		return days;
	}
}
