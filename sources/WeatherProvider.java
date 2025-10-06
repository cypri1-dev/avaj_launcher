package sources;

import static mypackage.Colors.DEBUG_BOLD;

public class WeatherProvider {

	private String[] weather = {"RAIN", "FOG", "SUN", "SNOW"};
	private static WeatherProvider instance;

	private WeatherProvider() {}

	public static WeatherProvider getInstance() {
		if (instance == null)
			instance = new WeatherProvider();
		return instance;
	}

	public String getCurrentWeather(Coordinates p_coordinates) {
		String landed = "LANDED";
		int meteoNumber = (p_coordinates.getHeight() + p_coordinates.getLatitude() + p_coordinates.getLongitude()) % 4;

		if (meteoNumber == -1)
			return landed;
			
		String currentMeteo = this.weather[meteoNumber];
		// System.out.println(DEBUG_BOLD + "meteoNumber: " + meteoNumber);
		// System.out.println(DEBUG_BOLD + "currentMeteo: " + currentMeteo);
		return currentMeteo;
	}
}
