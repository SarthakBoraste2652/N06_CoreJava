package org.tnsif.singleinheritance;
//base class
public class Citizen {
	
	//data members
	private String city;
	private int pincode;
	private long adharNo;
	private String area;
	
	//getters & setters
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public long getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	//toString  method
	@Override
	public String toString() {
		return "Citizen [City=" + city + ", pincode=" + pincode + ", adharNo=" + adharNo + ", area=" + area + "]";
	}
	public Citizen() {
		System.out.println("Citizen-Parent Class");
	}
	
	//parameterized constructor
	public Citizen(String city, int pincode, long adharNo, String area) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.adharNo = adharNo;
		this.area = area;
		
	}
	
	
	
	
	
}
