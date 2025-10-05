package sources;

import static mypackage.Colors.ORANGE_BOLD;
import static mypackage.Colors.RESET;

public class Baloon extends Aircraft {

	public Baloon(long p_id, String p_name, Coordinates p_coordinate) {
		super(p_id, p_name, p_coordinate);
		this.type = "Baloon";
	}

	@Override
	public void updateConditions() {
		String currentWeather = this.weatherTower.getWeather(this.getCoordinates());

		switch (currentWeather) {
			case("SUN"):
				this.coordinates.updateLongitude(2);
				this.coordinates.updateHeight(4);
				break;
			case("RAIN"):
				this.coordinates.updateHeight(-5);
				break;
			case("FOG"):
				this.coordinates.updateHeight(-3);
				break;
			case("SNOW"):
				this.coordinates.updateHeight(-15);
				break;
			default:
				System.out.println(ORANGE_BOLD + "Unknown meteo type!" + RESET);
		}
	}
}