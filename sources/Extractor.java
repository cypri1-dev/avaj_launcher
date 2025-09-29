import java.util.Scanner;

public class Extractor {

	public static void extractData(Scanner myReader) {
		while (myReader.hasNextLine()) {
			String line = myReader.nextLine();
			System.out.println(line);
		}
	}
}