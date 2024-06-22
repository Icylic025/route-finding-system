
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
