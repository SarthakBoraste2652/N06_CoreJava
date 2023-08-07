package org.tnsif.abstractkeyword;

public class AbstractClassExecutor {

	public static void main(String[] args) {
		//we can't create object for abstract class
//		Sandwich s = new Sandwich();
		CheezeCornSandwich c = new CheezeCornSandwich();
		c.prepare();
		c.showRecipe();
		c.prepare(8);

	}

}
