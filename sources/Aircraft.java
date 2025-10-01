package sources;

public class Aircraft {

	protected long id;
	protected String name;
	protected Coordinates coordinates;

	protected Aircraft(long p_id, String p_name, Coordinates p_coodinates) {
		this.id = p_id;
		this.name = p_name;
		this.coordinates = p_coodinates;
	}

	/* May add method to create unique id */
}