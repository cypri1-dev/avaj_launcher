public class Simulator {
	public static void main(String[] args) {
		if (!Parser.checkerArgs(args))
			return;
		Parser.readFile(args[0]);
	}
}