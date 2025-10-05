package sources;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static mypackage.Colors.*;

public class Extractor {

	public static boolean extractValues(String[] values, String line, List<String> nameAircraftList, Tower controlTower) {
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
		/* This switch statement will be placed at the end of method: 
		first check if values are OK, if so, will create the associated object 
		
		-- UPDATE --

		Need to link this part with AircraftFactory - DONE */

		String typeAircraft = values[0];
		Coordinates initCoordinates = new Coordinates(longitude, latitude, height);;
		
		// need to add the new aircraft in tower
		switch (typeAircraft) {
			case "Baloon":
				controlTower.register(AircraftFactory.getInstance().newAircraft(typeAircraft, nameAircraft, initCoordinates));
				// System.out.println(GREEN_BOLD + "OK - Baloon" + RESET);
				break;
			case "JetPlane":
				controlTower.register(AircraftFactory.getInstance().newAircraft(typeAircraft, nameAircraft, initCoordinates));
				// System.out.println(GREEN_BOLD + "OK - JetPlane" + RESET);
				break;
			case "Helicopter":
				controlTower.register(AircraftFactory.getInstance().newAircraft(typeAircraft, nameAircraft, initCoordinates));
				// System.out.println(GREEN_BOLD + "OK - Helicopter" + RESET);
				break;
			default:
				System.out.println(ORANGE_BOLD + "Error: unknown aircraft!" + RESET);
				return false;
		}
		return true;
	}

	public static boolean extractData(Scanner myReader, Simulator sim, Tower controlTower) {
		/* Extract nb of loop simulation */
		int nbLoop = 0;
		String fisrtLine = myReader.nextLine();
		// System.out.println(DEBUG_BOLD + "fisrt line: " + fisrtLine);
		try {
			nbLoop = Integer.parseInt(fisrtLine);
		}
		catch(NumberFormatException e) {
			System.out.println(ORANGE_BOLD + "Error: line 1: number of simulation must be int type" + RESET);
			return false;
		}
		if (nbLoop <= 0) {
			System.out.println(ORANGE_BOLD + "Error: line 1: number of simulation must be a positive int value: " + nbLoop + RESET);
			return false;
		}
		
		/*Extract data for each line - stop if error */
		String regex = "\\s+";
		List<String> nameAircraftList = new ArrayList<>();
		
		while (myReader.hasNextLine()) {
			String line = myReader.nextLine();
			// System.out.println(line);
			String[] lineArray = line.split(regex);
			
			if (lineArray.length != 5) {
				System.out.println(ORANGE_BOLD + "Error: wrong data at this line: " + line);
				return false;
			}
			// for (String s : lineArray) {
			// 	System.out.println(DEBUG_BOLD + "splited line: " + s);
			// }
			if (!extractValues(lineArray, line, nameAircraftList, controlTower))
				return false;
		}
		// for (String elem : nameAircraftList) {
		// 	System.out.println(DEBUG_BOLD + "name of the aircraft: " + elem);
		// }
		sim.setNbSimulation(nbLoop);
		return true;
	}
}