package sources;

import static mypackage.Colors.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Simulator {

	private int nbSimulation = 0;

	public void setNbSimulation(int nb) {
		this.nbSimulation = nb;
	}

	public int getNbSimulation() {
		return this.nbSimulation;
	}
	public static void main(String[] args) {

		Scanner file;
		if (!Parser.checkerArgs(args))
			return;

		Simulator sim = new Simulator();
		Tower controlTower = new Tower();
		List<String> data = new ArrayList<>();

		file = Parser.readFile(args[0]);
		if (file == null)
			return;
		
		data = Extractor.checkData(file, sim, controlTower);
		if (data == null)
			return;

		for (String dataLine : data) {
			String[] lineArray = dataLine.split("\\s+");
			Extractor.setValues(lineArray, controlTower);
		}

		/* -------------------------------- TESTS PART -------------------------------- */

		System.out.println(DEBUG_BOLD + "sim.nbSimulation: " + sim.getNbSimulation());
			
		Coordinates coor = new Coordinates(23, 12, 43);
		// Helicopter H1 = new Helicopter(1234, "testHelico", coor);
		// JetPlane J1 = new JetPlane(12345, "testJetPlane", coor);
		// Baloon B1 = new Baloon(12346, "testBaloon", coor);

		// System.out.println(DEBUG_BOLD + "HelicoTest");
		// System.out.println(DEBUG_BOLD + "id: " + H1.id);
		// System.out.println(DEBUG_BOLD + "name: " + H1.name);
		// System.out.println(DEBUG_BOLD + "longitude: " + H1.coordinates.getLongitude());
		// System.out.println(DEBUG_BOLD + "latitude: " + H1.coordinates.getLatitude());
		// System.out.println(DEBUG_BOLD + "height: " + H1.coordinates.getHeight());

		// System.out.println(DEBUG_BOLD + "JetPlaneTest");
		// System.out.println(DEBUG_BOLD + "id: " + J1.id);
		// System.out.println(DEBUG_BOLD + "name: " + J1.name);
		// System.out.println(DEBUG_BOLD + "longitude: " + J1.coordinates.getLongitude());
		// System.out.println(DEBUG_BOLD + "latitude: " + J1.coordinates.getLatitude());
		// System.out.println(DEBUG_BOLD + "height: " + J1.coordinates.getHeight());

		// System.out.println(DEBUG_BOLD + "BaloonTest");
		// System.out.println(DEBUG_BOLD + "id: " + B1.id);
		// System.out.println(DEBUG_BOLD + "name: " + B1.name);
		// System.out.println(DEBUG_BOLD + "longitude: " + B1.coordinates.getLongitude());
		// System.out.println(DEBUG_BOLD + "latitude: " + B1.coordinates.getLatitude());
		// System.out.println(DEBUG_BOLD + "height: " + B1.coordinates.getHeight());
		
		controlTower.printListRegisteredFlyable();
		WeatherProvider.getInstance().getCurrentWeather(coor);
	}
}