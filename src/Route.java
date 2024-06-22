import java.util.ArrayList;

/**
 * The Route class represents an ordered list of connected legs between two Locations. It contains a list of Legs which
 * form a route between these two Locations.
 */
public class Route {
	
	private ArrayList <Leg> legs;
	public Route () {
		legs = new ArrayList <Leg>();
	}
	
	public double totalCost() {
		double total = 0;
		for (int i = 0; i < legs.size(); i++) {
			total += legs.get(i).getDistance() * legs.get(i).getCost();
			
		}
		return total;
	}
	
	public int totalDistance() {
		int total = 0;
		for (int i = 0; i < legs.size(); i++) {
			total += legs.get(i).getDistance();
		}
		return total;
	}
	
	public int totalSteps() {
		return legs.size();
	}
	
	public void addLeg(Leg l) {
		legs.add(l);
	}
	
	public String toString() {
		
		String output = ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n" ;
		output += "Steps: " + totalSteps() + " Distance: " + totalDistance() + " Cost: " + totalCost() + "\n";	
		output += "Route Start: \n";
		
		for (int i = legs.size() - 1; i >= 0; i--) {
			output += "Origin: " + legs.get(i).getOrigin().getName() + " Destination: " + legs.get(i).getDestination().getName() + "\n";
		}
		
		output += "Route End.\n";
		output += ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n";
		return output;
	}
}
