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
		String formatName = this.getType() + "#" + this.getName() + "(" + this.getId() + ")";

		switch (currentWeather) {
			case("SUN"):
				this.coordinates.updateLongitude(10);
				this.coordinates.updateHeight(2);
				System.out.println(formatName + ": Sun’s blazing! Perfect day for a tan at 10,000 feet!");
				break;
			case("RAIN"):
				this.coordinates.updateLongitude(5);
				System.out.println(formatName + ": It's pouring! Should’ve brought a bigger windshield wiper!");
				break;
			case("FOG"):
				this.coordinates.updateLongitude(1);
				System.out.println(formatName + ": Can’t see a thing… hope this isn’t a mountain ahead!");
				break;
			case("SNOW"):
				this.coordinates.updateHeight(-12);
				System.out.println(formatName + ": It’s snowing like crazy! Turning into a flying popsicle!");
				if (this.coordinates.getHeight() <= 0) {
					System.out.println(formatName + ": Landed.");
					this.weatherTower.unregister(this);
				}
				break;
			default:
				this.weatherTower.unregister(this);
				// System.out.println(ORANGE_BOLD + "Landing..." + RESET);
		}
		// System.out.println(DEBUG_BOLD + "Aircraft: " + formatName + " [height]: " + this.coordinates.getHeight() + " | [latitude]: " + this.coordinates.getLatitude() + " | [longitude]: " + this.coordinates.getLongitude());
	}
}