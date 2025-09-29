import java.util.Scanner;

public class Simulator {

	private int nbSimulation = 0;

	public void setNbSimulation(int nb) {
		this.nbSimulation = nb;
	}
	public static void main(String[] args) {

		Scanner data;
		if (!Parser.checkerArgs(args))
			return;

		Simulator sim = new Simulator();
		data = Parser.readFile(args[0]);
		// if (data != null)
		// 	System.out.println("YES");
		// else
		// 	System.out.println("NO");
		Extractor.extractData(data);
	}
}