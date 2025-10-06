package sources;

public class WeatherTower extends Tower {

	public String getWeather(Coordinates p_coordinate) {

		return WeatherProvider.getInstance().getCurrentWeather(p_coordinate);
	}

	public void changeWeather() {
		conditionChanged();
	}

	@Override
	public void register(Flyable p_flyable) {
		super.register(p_flyable);
		p_flyable.registerTower(this);
	}
}
