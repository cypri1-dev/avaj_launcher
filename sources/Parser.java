import static mypackage.Colors.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Parser {

	public static boolean checkerArgs(String[] args) {

		if (args.length == 0) {
			System.err.println(RED_BOLD + "No simulation provided!" + RESET);
			return false;
		}
		else if (args.length != 1) {
			System.err.println(RED_BOLD + "More than one argument provided!" + RESET);
			return false;
		}
		else if (!args[0].endsWith(".txt")) {
			System.err.println(RED_BOLD + "Simulation format file must be .txt!" + RESET);
			return false;
		}
		System.out.println(GREEN_BOLD + "Format file OK..." + RESET);
		System.out.println("Checking file [" + ITALIC + args[0] + RESET + "]...");
		return true;
	}

	public static void readFile(String file) {
		File myFile = new File(file);

		try (Scanner myReader = new Scanner(myFile)) {
			if (!myReader.hasNextLine()) {
				System.err.println(ORANGE_BOLD + "Provided file is empty!" + RESET);
				return;
			}
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			System.err.println(ORANGE_BOLD + "The given file doesn't exists!" + RESET);
			// e.printStackTrace();
		}
	}
}