package solar;

public class Earth extends Planet	{
	private int wasteLevel;
	
	public Earth() {
		super();
		this.wasteLevel = 0;
	}
	public Earth(int orbitRadius, int wasteLevel) {
		super(orbitRadius);
		if(wasteLevel < 0) wasteLevel = 0;
		this.wasteLevel = wasteLevel;
	}
	public int getWasteLevel() {
		return wasteLevel;
	}
	public boolean orbit() {
		boolean orbit = true;
		if (wasteLevel > 5) orbit = false;
				
		return orbit;
	}

}
