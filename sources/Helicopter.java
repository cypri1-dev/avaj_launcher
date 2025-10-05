package sources;

import static mypackage.Colors.*;

public class Helicopter extends Aircraft {

	public Helicopter(long p_id, String p_name, Coordinates p_coordinate) {
		super(p_id, p_name, p_coordinate);
		this.type = "Helicopter";
	}

	@Override
	public void updateConditions() {
		String currentWeather = this.weatherTower.getWeather(this.getCoordinates());

		switch (currentWeather) {
			case("SUN"):
				this.coordinates.updateLongitude(10);
				this.coordinates.updateHeight(2);
				break;
			case("RAIN"):
				this.coordinates.updateLongitude(5);
				break;
			case("FOG"):
				this.coordinates.updateLongitude(1);
				break;
			case("SNOW"):
				this.coordinates.updateHeight(-12);
				break;
			default:
				System.out.println(ORANGE_BOLD + "Unknown meteo type!" + RESET);
		}
	}
}