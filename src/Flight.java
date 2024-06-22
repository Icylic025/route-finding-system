/**
 * A Flight's origin and destination must be Airports. Airplanes can only go between two Airports.
 * costPerKm is $0.23
 */
public class Flight extends Leg{
	public Flight (Location originIn, Location destinationIn, int distanceIn, String daysIn) {
		super(originIn, destinationIn, distanceIn, daysIn, 0.23);
		
		if (!originIn.locationType().equals("Airport")  || !destinationIn.locationType().equals("Airport")) {
			 throw new NullPointerException("Not a possible leg between " + originIn + " and " + destinationIn);
		}
		
	}

}
