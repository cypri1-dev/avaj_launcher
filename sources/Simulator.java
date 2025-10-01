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
		System.out.println(DEBUG_BOLD + "sim.nbSimulation: " + sim.getNbSimulation());
	}
}