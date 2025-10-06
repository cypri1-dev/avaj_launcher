package sources;

public abstract class Flyable {
	
	protected WeatherTower weatherTower;
	
	public abstract void updateConditions();

	// need to add those abstact method in order to register in Tower!
	public abstract String getName();
	public abstract long getId();
	public abstract String getType();
	public abstract int getHeight();
	
	public void registerTower(WeatherTower p_tower) {
		this.weatherTower = p_tower;
	}
}