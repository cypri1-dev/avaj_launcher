package sources;

/* Singleton ! */
public class AircraftFactory {

	static long id = 0;

	// stock unique instance (static)
	private static AircraftFactory instance;

	// private constructor (avoid new AircraftFactory() elsewhere)
	private AircraftFactory() {}

	// public method to get the unique instance
	public static AircraftFactory getInstance() {
		if (instance == null)
			instance = new AircraftFactory();
		return instance;
	}

	public Flyable newAircraft(String p_type, String p_name, Coordinates p_coordinate) {
		
		switch(p_type) {
			case "Baloon":
				id += 1;
				Baloon newBaloon = new Baloon(id, p_name, p_coordinate);
				return newBaloon;
			case "JetPlane":
				id += 1;
				JetPlane newJetPlane = new JetPlane(id, p_name, p_coordinate);
				return newJetPlane;
			case "Helicopter":
				id += 1;
				Helicopter newHelicopter = new Helicopter(id, p_name, p_coordinate);
				return newHelicopter;
			default:
				break;
		}
		return null;
	}
}