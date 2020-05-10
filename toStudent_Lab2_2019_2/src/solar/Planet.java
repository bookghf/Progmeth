package solar;

public class Planet {
	protected Coordinate coordinate;
	protected Coordinate orbitCenterCoordinate;
	protected int orbitRadius;
	
	public Planet() {
		coordinate = new Coordinate();
		orbitCenterCoordinate = new Coordinate();
		getCoordinate().setX(1);
		getCoordinate().setY(0);
		getOrbitCenterCoordinate().setX(0);
		getOrbitCenterCoordinate().setY(0);
		this.orbitRadius = 1;
	}
	public Planet(int orbitRadius) {
		if(orbitRadius < 1) orbitRadius = 1;
		coordinate = new Coordinate();
		orbitCenterCoordinate = new Coordinate();
		getCoordinate().setX(orbitRadius);
		getCoordinate().setY(0);
		getOrbitCenterCoordinate().setX(0);
		getOrbitCenterCoordinate().setY(0);
		this.orbitRadius = orbitRadius;
	}
	public Coordinate getCoordinate() {
		return coordinate;
	}
	
	public Coordinate getOrbitCenterCoordinate() {
		return orbitCenterCoordinate;
	}
	public int getOrbitRadius() {
		return orbitRadius;
	}
	public boolean orbit() {
		boolean orbit = true;
		if (orbitRadius > 4) orbit = false;
		return orbit;
	}
	
}
