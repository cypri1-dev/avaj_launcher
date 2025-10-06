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
		// Tower controlTower = new Tower();
		WeatherTower weatherTower = new WeatherTower();
		List<String> data = new ArrayList<>();
		// int i = 0;

		file = Parser.readFile(args[0]);
		if (file == null)
			return;
		
		data = Extractor.checkData(file, sim);
		if (data == null)
			return;

		for (String dataLine : data) {
			String[] lineArray = dataLine.split("\\s+");
			Extractor.setValues(lineArray, weatherTower);
		}

		for (int i = 0; i < sim.getNbSimulation(); ++i) {
			weatherTower.changeWeather();
			// System.out.println("------------------------------------------------------------------------------------");
		}
	}
}