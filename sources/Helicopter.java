package sources;

public class Helicopter extends Aircraft {

	public Helicopter(long p_id, String p_name, Coordinates p_coordinate) {
		super(p_id, p_name, p_coordinate);
		this.type = "Helicopter";
	}

	@Override
	public void updateConditions() {
		/* logic here */
	}
}