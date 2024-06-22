import java.util.ArrayList;

/**
 * The Location class is an abstract class representing a location along a possible delivery route.
 */
public abstract class Location {
	private String name;
	public ArrayList<Leg> connecting;
	
	public Location (String n) {
		name = n;
		connecting = new ArrayList<Leg>();
	
	}
	public void addConnection(Leg l) {
		connecting.add(l);
	}
	
	// returns the cheapest Route between this location and loc on given day. 
	// Returns null if no route found or if there are no outgoing connections from this location.
	public Route cheapestRouteTo(Location loc, String day) {

		Route bestRoute = null;
		
		// create new route if it is a possible route (base case)
		if (this.getName().equals(loc.getName())) {
			return new Route();
		}

		// cycle through the connecting legs to see if an available route is possible
		for (int i = 0; i < connecting.size(); i++) {
		
			if (this == connecting.get(i).getOrigin() && connecting.get(i).getDays().indexOf(day) >= 0) {
			
				// make sure this route being tested exists
				if (connecting.get(i) != null && connecting.get(i).getDestination().minStepsRouteTo(loc, day) != null) {

					Route testRoute = connecting.get(i).getDestination().cheapestRouteTo(loc, day);
					testRoute.addLeg(connecting.get(i));

					if (bestRoute != null) {
						if (bestRoute.totalCost() >= testRoute.totalCost()) {
							bestRoute = testRoute;
						}
					} else {
						bestRoute = testRoute;
					}

				}
			}
		}
		if (bestRoute == null) {
			throw new NullPointerException("No Possible Route");
		}
		return bestRoute;

	}
	
	// returns the Route with the minimum number of steps between this location and loc on given day. 
	// Returns null if no route found or if there are no outgoing connections from this location.
	public Route minStepsRouteTo(Location loc, String day) {
		for (Leg l : connecting) {
			System.out.println(connecting.size());
			System.out.println(l.getOrigin().getName());
		}
		if (this.getName().equals(loc.getName())) {
			return new Route();
		}

		Route bestRoute = null;
		
		// cycles through the connecting legs to see if it will be a possible route
		for (Leg leg : connecting) {
			
			if (this == leg.getOrigin() && leg.getDays().indexOf(day) >= 0) {

				if (leg != null && leg.getDestination().minStepsRouteTo(loc, day) != null) {

					Route testRoute = leg.getDestination().minStepsRouteTo(loc, day);
					testRoute.addLeg(leg);

					if (bestRoute != null) {
						if (bestRoute.totalSteps() >= testRoute.totalSteps()) {
							bestRoute = testRoute;
						}
					} else {
						bestRoute = testRoute;
					}

				}
			}
		}
		
		return bestRoute;

	}
	
	
	// returns the shortest Route between this location and loc on given day. 
	// Returns null if no route found or if there are no outgoing connections from this location.
	public Route shortestKmRouteTo(Location loc, String day) {
		
				if (this.getName().equals(loc.getName())) {
					return new Route();
				}

				Route bestRoute = null;
				
				// cycles through the connecting legs to see if it will be a possible route
				for (Leg leg : connecting) {
				
					if (this == leg.getOrigin() && leg.getDays().indexOf(day) >= 0) {
					
						if (leg != null && leg.getDestination().minStepsRouteTo(loc, day) != null) {

							Route testRoute = leg.getDestination().shortestKmRouteTo(loc, day);
							testRoute.addLeg(leg);


							if (bestRoute != null) {
								if (bestRoute.totalDistance() >= testRoute.totalDistance()) {
									bestRoute = testRoute;
								}
							} else {
								bestRoute = testRoute;
							}

						}
					}
				}
				
				if (bestRoute == null) {
					throw new NullPointerException("No Possible Route");
				}
				return bestRoute;

	}
	
	public String getName() {
		return name;
	}
	
	public String locationType() {
		return "General Location";
	}
	
	public boolean equals(Location o) {
		return name.equals(o.getName());
	}
}
