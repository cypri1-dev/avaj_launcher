package sources;

import static mypackage.Colors.ORANGE_BOLD;
import static mypackage.Colors.RESET;

public class JetPlane extends Aircraft {

	public JetPlane(long p_id, String p_name, Coordinates p_coordinate) {
		super(p_id, p_name, p_coordinate);
		this.type = "JetPlane";
	}

	@Override
	public void updateConditions() {
		String currentWeather = this.weatherTower.getWeather(this.getCoordinates());

		switch (currentWeather) {
			case("SUN"):
				this.coordinates.updateLatitude(10);
				this.coordinates.updateHeight(2);
				break;
			case("RAIN"):
				this.coordinates.updateLatitude(5);
				break;
			case("FOG"):
				this.coordinates.updateLatitude(1);
				break;
			case("SNOW"):
				this.coordinates.updateHeight(-7);
				break;
			default:
				System.out.println(ORANGE_BOLD + "Unknown meteo type!" + RESET);
		}
	}
}