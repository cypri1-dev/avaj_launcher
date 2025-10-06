package sources;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Aircraft extends Flyable {

	protected long id;
	protected String name;
	protected Coordinates coordinates;
	protected String type;

	protected Aircraft(long p_id, String p_name, Coordinates p_coodinates) {
		this.id = p_id;
		this.name = p_name;
		this.coordinates = p_coodinates;
		this.type = "defaultType";
	}

	public void printToFileTxt(String msg, String fileOut) {
	try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileOut, true))) {
				writer.write(msg);
				writer.newLine();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	public String getType() {
		return this.type;
	}

	public String getName() {
		return this.name;
	}

	public long getId() {
		return this.id;
	}

	public Coordinates getCoordinates() {
		return this.coordinates;
	}

	public int getHeight() {
		return this.coordinates.getHeight();
	}
	
	/* Must be declared here but empty - will be overrided in children */
	public void updateConditions() {}
}