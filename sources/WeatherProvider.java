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
		int meteoNumber = (p_coordinates.getHeight() + p_coordinates.getLatitude() + p_coordinates.getLongitude()) % 4;
		String currentMeteo = this.weather[meteoNumber];

		System.out.println(DEBUG_BOLD + "meteoNumber: " + meteoNumber);
		System.out.println(DEBUG_BOLD + "currentMeteo: " + currentMeteo);
		System.out.println(DEBUG_BOLD + "[height]: " + p_coordinates.getHeight() + " | [latitude]: " + p_coordinates.getLatitude() + " | [longitude]: " + p_coordinates.getLongitude());

		return currentMeteo;
	}
}
