package org.tnsif.assignment1p2;

public class WoodenBero extends Bero{
	private String woodType;

	public String getWoodType() {
		return woodType;
	}

	public void setWoodType(String woodType) {
		this.woodType = woodType;
	}

	public WoodenBero(String beroType, String beroColour, String woodType) {
		super(beroType, beroColour);
		this.woodType = woodType;
	}
	
	@Override
	public void calculatePrice()
	{
		switch(woodType)
		{
		case "Ply Wood":
			setPrice(15000);
			break;
			
		case "Tik Wood":
			setPrice(12000);
			break;
			
		case "Engineered wood":
			setPrice(10000);
			break;
			
		default:
			setPrice(0);
		}
	}
}
