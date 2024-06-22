/**
 * For all BikeLeg at least one of the origin and destination must be a BikeDeliveryLocation, the other may be a TruckDepot.
 * Bikes can only go between 2 BikeDeliveryLocations, or a BikeDeliveryLocation and a TruckDepot, or a TruckDepot
 * and a BikeDeliveryLocation.
 *
 * costPerKm is $1
 */
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
