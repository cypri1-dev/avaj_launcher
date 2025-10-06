package sources;

import static mypackage.Colors.*;
import java.util.List;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Tower {

	private List<Flyable> observers = new ArrayList<>();
	final private String registerMsg = " registered to weather tower.";
	final private String unregisterMsg = " unregistered from weather tower.";

	public void register(Flyable p_flyable) {
		
		String formatName = p_flyable.getType() + "#" + p_flyable.getName() + "(" + p_flyable.getId() + ")";
		// System.out.println(DEBUG_BOLD + "foramtName: " + RESET + formatName);
		observers.add(p_flyable);
		String txt = "Tower says: " + formatName + registerMsg;
		String fileOut = "simulation.txt";

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileOut, true))) {
			writer.write(txt);
			writer.newLine();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void unregister(Flyable p_flyable) {
		String formatName = p_flyable.getType() + "#" + p_flyable.getName() + "(" + p_flyable.getId() + ")";
		observers.remove(p_flyable);
		String txt = "Tower says: " + formatName + unregisterMsg;
		String fileOut = "simulation.txt";

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileOut, true))) {
			writer.write(txt);
			writer.newLine();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

protected void conditionChanged() {
	// need copy !
	List<Flyable> copyObservers = new ArrayList<>(this.observers);

	for (Flyable registeredAircraft : copyObservers) {
		registeredAircraft.updateConditions();
	}
}


	/* PRINTING FUNCTION FOR DEBUG*/

	public void printListRegisteredFlyable() {

		for (Flyable aircraft : this.observers) {
			System.out.println("Aircraft: " + aircraft.getName());
		}
	}
}