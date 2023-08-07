package org.tnsif.interfaceexecutor;

public class Human implements Alcohol, ColdDrink{

	@Override
	public void showDrink() {
		System.out.println(colddrinkName+" "+alcoholType+" "+brand);
		
	}

}
