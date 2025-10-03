package sources;

public class Aircraft extends Flyable {

	protected long id;
	protected String name;
	protected Coordinates coordinates;

	// need a type attribute - also need getter for it
	protected String type;

	protected Aircraft(long p_id, String p_name, Coordinates p_coodinates) {
		this.id = p_id;
		this.name = p_name;
		this.coordinates = p_coodinates;
		this.type = "defaultType";
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

	/* Must be declared here but empty - will be overrided in children */
	public void updateConditions() {}
}