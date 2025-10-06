package sources;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static mypackage.Colors.*;

public class Extractor {

	public static void setValues(String[] values, WeatherTower weatherTower) {
		/* set values for each aircraft */
		String typeAircraft = values[0];
		String nameAircraft = values[1];
		int longitude = Integer.parseInt(values[2]);
		int latitude = Integer.parseInt(values[3]);
		int height = Integer.parseInt(values[4]);

		Coordinates initCoordinates = new Coordinates(longitude, latitude, height);

		switch (typeAircraft) {
			case "Baloon":
				weatherTower.register(AircraftFactory.getInstance().newAircraft(typeAircraft, nameAircraft, initCoordinates));
				break;
			case "JetPlane":
				weatherTower.register(AircraftFactory.getInstance().newAircraft(typeAircraft, nameAircraft, initCoordinates));
				break;
			case "Helicopter":
				weatherTower.register(AircraftFactory.getInstance().newAircraft(typeAircraft, nameAircraft, initCoordinates));
				break;
			default:
				System.out.println(ORANGE_BOLD + "Error: unknown aircraft!" + RESET);
		}
	}

	public static boolean checkValues(String[] values, String line, List<String> nameAircraftList) {
		/* Checks longitude - latitude and height */
		int longitude = -1;
		int latitude = -1;
		int height = -1;
		try {
			longitude = Integer.parseInt(values[2]);
			latitude = Integer.parseInt(values[3]);
			height = Integer.parseInt(values[4]);
		}
		catch (NumberFormatException e) {
			System.out.println(ORANGE_BOLD + "Error: wrong value(s) detected (must be int type): " + line + RESET);
			return false;
		}
		if (longitude < 0 || latitude < 0 || (height < 0 || height > 100)) {
			System.out.println(ORANGE_BOLD + "Error: wrong value(s) detected (LONG & LAT must be positive and 0 <= HEIGHT <= 100): " + line + RESET);
			return false;
		}
		/* Checks aircraft's name */
		String nameAircraft = values[1];
		for (String name : nameAircraftList) {
			if (name.equals(nameAircraft)) {
				System.out.println(ORANGE_BOLD + "Error: name already exists: " + nameAircraft + RESET);
				return false;
			}
		}
		nameAircraftList.add(nameAircraft);
		String typeAircraft = values[0];
		
		switch (typeAircraft) {
			case "Baloon":
				System.out.println("Aircraft type: " + ITALIC + "-Baloon-..." + RESET + GREEN_BOLD + "OK" + RESET);
				break;
			case "JetPlane":
				System.out.println("Aircraft type: " + ITALIC + "-JetPlane-..." + RESET + GREEN_BOLD + "OK" + RESET);
				break;
			case "Helicopter":
				System.out.println("Aircraft type: " + ITALIC + "-Helicopter-..." + RESET + GREEN_BOLD + "OK" + RESET);
				break;
			default:
				System.out.println(ORANGE_BOLD + "Error: unknown aircraft!" + RESET);
				return false;
		}
		return true;
	}

	public static List<String> checkData(Scanner myReader, Simulator sim) {
		/* Extract nb of loop simulation */
		int nbLoop = 0;
		String fisrtLine = myReader.nextLine();

		try {
			nbLoop = Integer.parseInt(fisrtLine);
		}
		catch(NumberFormatException e) {
			System.out.println(ORANGE_BOLD + "Error: line 1: number of simulation must be int type" + RESET);
			return null;
		}
		if (nbLoop <= 0) {
			System.out.println(ORANGE_BOLD + "Error: line 1: number of simulation must be a positive int value: " + nbLoop + RESET);
			return null;
		}
		
		/*Extract data for each line - stop if error */
		String regex = "\\s+";
		List<String> nameAircraftList = new ArrayList<>();
		List<String> copyData = new ArrayList<>();
		
		while (myReader.hasNextLine()) {
			String line = myReader.nextLine();
			copyData.add(line);
			String[] lineArray = line.split(regex);
			
			if (lineArray.length != 5) {
				System.out.println(ORANGE_BOLD + "Error: wrong data at this line: " + line);
				return null;
			}
			if (!checkValues(lineArray, line, nameAircraftList))
				return null;
		}
		sim.setNbSimulation(nbLoop);
		return copyData;
	}
}