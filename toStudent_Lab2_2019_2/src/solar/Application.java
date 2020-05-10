package solar;
import java.util.ArrayList;
public class Application {

	private ArrayList<Planet> planets;
	
	public static String printPlanet(Planet planet) {
		String print = "";
		if(planet instanceof Earth) {
			Earth a = (Earth)planet;
			print = "Earth's Waste Level is "+a.getWasteLevel();
		}
		else if(planet instanceof Saturn) {
			Saturn a = (Saturn)planet;
			print = "Saturn's Speed is "+a.getSpeed();
		}
		return print;
	}
	public void main() {
		Earth e = new Earth(1,4);
		Saturn s = new Saturn(2,2);
		planets.add(e);
		planets.add(s);
		for(Planet p : planets) {
			printPlanet(p);
		}
	}

}
