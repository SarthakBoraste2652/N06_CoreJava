package org.tnsif.assignment1p2;

public class SteelBero extends Bero{
	private int beroHeight;

	public int getBeroHeight() {
		return beroHeight;
	}

	public void setBeroHeight(int beroHeight) {
		this.beroHeight = beroHeight;
	}

	public SteelBero(String beroType, String beroColour, int beroHeight) {
		super(beroType, beroColour);
		this.beroHeight = beroHeight;
	}
	
	public void calculatePrice()
	{
		int bHeight= getBeroHeight();
		if(bHeight==3)
		{
			setPrice(5000);
		}
		else if(bHeight==5)
		{
			setPrice(8000);
		}
		else if(bHeight==7)
			setPrice(10000);
		else
			setPrice(0);
	}

}
