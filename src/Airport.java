/**
 * Airport is a Location with 3 uppercase letters as Name
 */
public class Airport extends Location {

	private String name;
	
	Airport() {
		super("");
	}
	
	Airport(String n) {
		super(n);
	}
	
	public String locationType() {
		return "Airport";
	}
}
