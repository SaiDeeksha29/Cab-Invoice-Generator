package InvoiceService;

import java.util.Map;
import java.util.HashMap;

public class RideRepository {
	private Map<Integer, Ride[]> USER_RIDES = new HashMap<Integer, Ride[]>();

	public RideRepository(int userId, Ride[] rides) {
		USER_RIDES.put(userId, rides);
	}

	public Ride[] getRides(int userId) {
		return USER_RIDES.get(userId);
	}
}
