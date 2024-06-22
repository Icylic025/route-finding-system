
public class TruckDepot extends Location {

	private String name;
	
	TruckDepot() {
		super("");
	}
	
	TruckDepot(String n) {
		super( n);
	}
	
	public String locationType() {
		return "TruckDepot";
	}
}
