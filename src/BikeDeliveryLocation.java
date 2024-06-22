
public class BikeDeliveryLocation extends Location {
	
	private String name;
	
	BikeDeliveryLocation() {
		super("");
	}
	
	BikeDeliveryLocation(String n) {
		super(n);
	}
	
	public String locationType() {
		return "BikeDeliveryLocation";
	}
}
