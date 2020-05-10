package solar;

public class Saturn extends Planet {
	private int speed;
	
	public Saturn() {
		super();
		this.speed = 0;
	}
	public Saturn(int orbitRadius,int speed) {
		super(orbitRadius);
		if(speed < 0) speed = 0;
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}
	public boolean orbit() {
		boolean orbit = true;
		if(getSpeed() <= 0) orbit = false;
		return orbit;
	}

}
