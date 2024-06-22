
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
