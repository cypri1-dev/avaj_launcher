package sources;

// import static mypackage.Colors.DEBUG_BOLD;
// import static mypackage.Colors.ORANGE_BOLD;
// import static mypackage.Colors.RESET;

public class JetPlane extends Aircraft {

	public JetPlane(long p_id, String p_name, Coordinates p_coordinate) {
		super(p_id, p_name, p_coordinate);
		this.type = "JetPlane";
	}

	@Override
	public void updateConditions() {
		String currentWeather = this.weatherTower.getWeather(this.getCoordinates());
		String formatName = this.getType() + "#" + this.getName() + "(" + this.getId() + ")";
		String fileOut = "simulation.txt";
		String txtSun = formatName + ": Sun's blazing! Perfect day for a tan at 10,000 feet!";
		String txtRain = formatName + ": It's pouring! Should've brought a bigger windshield wiper!";
		String txtFog = formatName + ": Can't see a thing... hope this isn't a mountain ahead!";
		String txtSnow = formatName + ": It's snowing like crazy! Turning into a flying popsicle!";
		String txtLanded = formatName + ": Landed."; 

		switch (currentWeather) {
			case("SUN"):
				this.coordinates.updateLatitude(10);
				this.coordinates.updateHeight(2);

				printToFileTxt(txtSun, fileOut);
				break;
			case("RAIN"):
				this.coordinates.updateLatitude(5);

				printToFileTxt(txtRain, fileOut);
				break;
			case("FOG"):
				this.coordinates.updateLatitude(1);

				printToFileTxt(txtFog, fileOut);
				break;
			case("SNOW"):
				this.coordinates.updateHeight(-7);
				printToFileTxt(txtSnow, fileOut);
				if (this.coordinates.getHeight() <= 0) {
					printToFileTxt(txtLanded, fileOut);
					this.weatherTower.unregister(this);
				}
				break;
			default:
				this.weatherTower.unregister(this);
		}
		// System.out.println(DEBUG_BOLD + "Aircraft: " + formatName + " [height]: " + this.coordinates.getHeight() + " | [latitude]: " + this.coordinates.getLatitude() + " | [longitude]: " + this.coordinates.getLongitude());
	}
}