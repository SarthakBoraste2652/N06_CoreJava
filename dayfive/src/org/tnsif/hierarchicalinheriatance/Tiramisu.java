package org.tnsif.hierarchicalinheriatance;
//child class1
public class Tiramisu extends Android{

	//private datamembers
	private int version;
	
	//getters and setters
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	//parameterized constructor
	public Tiramisu(String brand, String slotType, int version) {
		super(brand, slotType);
		this.version = version;
	}

	//tostring methods
	@Override
	public String toString() {
		return "Tiramisu [version=" + version + ", toString()=" + super.toString() + "]";
	}

}
