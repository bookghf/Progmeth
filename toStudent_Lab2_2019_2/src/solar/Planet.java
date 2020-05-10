package solar;

public class Planet {
	protected Coordinate coordinate;
	protected Coordinate orbitCenterCoordinate;
	protected int orbitRadius;
	
	public Planet() {
		getCoordinate().setX(1);
		getCoordinate().setY(0);
		getOrbitCenterCoordinate().setX(0);
		getOrbitCenterCoordinate().setY(0);
		this.orbitRadius = 1;
	}
	public Planet(int orbitRadius) {
		getCoordinate().setX(1);
		getCoordinate().setY(0);
		getOrbitCenterCoordinate().setX(0);
		getOrbitCenterCoordinate().setY(0);
		if(orbitRadius < 1) orbitRadius = 1;
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
		return orbit;
	}
	
}
