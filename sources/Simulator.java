package sources;

import static mypackage.Colors.DEBUG_BOLD;
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

		Scanner data;
		if (!Parser.checkerArgs(args))
			return;

		Simulator sim = new Simulator();
		data = Parser.readFile(args[0]);
		if (data == null)
			return;
		if (!Extractor.extractData(data, sim))
			return;
		// System.out.println(DEBUG_BOLD + "sim.nbSimulation: " + sim.getNbSimulation());

		Coordinates coorH1 = new Coordinates(23, 12, 43);
		Helicopter H1 = new Helicopter(1234, "testHelico", coorH1);

		System.out.println(DEBUG_BOLD + "HelicoTest");
		System.out.println(DEBUG_BOLD + "id: " + H1.id);
		System.out.println(DEBUG_BOLD + "name: " + H1.name);
		System.out.println(DEBUG_BOLD + "longitude: " + H1.coordinates.getLongitude());
		System.out.println(DEBUG_BOLD + "latitude: " + H1.coordinates.getLatitude());
		System.out.println(DEBUG_BOLD + "height: " + H1.coordinates.getHeight());
	}
}