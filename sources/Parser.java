package sources;

import static mypackage.Colors.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Parser {

	public static boolean checkerArgs(String[] args) {

		if (args.length == 0) {
			System.out.println(RED_BOLD + "No simulation provided!" + RESET);
			return false;
		}
		else if (args.length != 1) {
			System.out.println(RED_BOLD + "More than one argument provided!" + RESET);
			return false;
		}
		else if (!args[0].endsWith(".txt")) {
			System.out.println(RED_BOLD + "Simulation format file must be .txt!" + RESET);
			return false;
		}
		System.out.println(GREEN_BOLD + "Format file OK..." + RESET);
		System.out.println("Checking file [" + ITALIC + args[0] + RESET + "]...");
		return true;
	}

	public static Scanner readFile(String file) {
		File myFile = new File(file);

		if (!myFile.exists()) {
			System.out.println(ORANGE_BOLD + "The given file doesn't exists!" + RESET);
			return null;
		}

		try {
			Scanner myReader = new Scanner(myFile);
			if (!myReader.hasNextLine()) {
				System.out.println(ORANGE_BOLD + "Provided file is empty!" + RESET);
				return null;
			}
			return myReader;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}