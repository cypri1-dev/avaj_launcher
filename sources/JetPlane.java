package sources;

public class JetPlane extends Aircraft {

	public JetPlane(long p_id, String p_name, Coordinates p_coordinate) {
		super(p_id, p_name, p_coordinate);
		this.type = "JetPlane";
	}

	@Override
	public void updateConditions() {
		/* logic here */
	}
}