/**
 * For all TruckLeg at least one of the origin and destination must be TruckDepot, the other may be an Airport.
 * Trucks can only go between 2 TruckDepots, or an Airport and a TruckDepot, or a a TruckDepot and an Airport.
 * costPerKm is $0.58
 */
public class TruckLeg extends Leg {
	public TruckLeg (Location originIn, Location destinationIn, int distanceIn, String daysIn) {
		super(originIn, destinationIn, distanceIn, daysIn, 0.58);
		
		if (originIn.locationType().equals("TruckDepot") || destinationIn.locationType().equals("TruckDepot")) {
			if (originIn.locationType().equals("BikeDeliveryLocation") || destinationIn.locationType().equals("BikeDeliveryLocation")) {
				 throw new NullPointerException("Not a possible leg between " + originIn + " and " + destinationIn);
			}
		}
		
	}
}
