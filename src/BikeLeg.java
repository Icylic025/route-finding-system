
public class BikeLeg extends Leg {
	
	public BikeLeg (Location originIn, Location destinationIn, int distanceIn, String daysIn) {
		super(originIn, destinationIn, distanceIn, daysIn, 1);
		if (originIn.locationType().equals("BikeDeliveryLocation") && destinationIn.locationType().equals("BikeDeliveryLocation") 
				|| originIn.locationType().equals("TruckDepot") && destinationIn.locationType().equals("BikeDeliveryLocation") 
				|| originIn.locationType().equals("BikeDeliveryLocation") && destinationIn.locationType().equals("TruckDepot") ) {
			
		} else {
			 throw new NullPointerException("Not a possible leg between " + originIn + " and " + destinationIn);
		}
		
	}
}
