// A program to demonstrate Method overriding
package org.tnsif.polymorphism;

class ChiefMinister
{
	static void corruption(String str1, float amount)
	{
		System.out.println(str1+" corrupted the amount of "+amount);
	}
}

class MLA extends ChiefMinister
{
	static void corruption(String str2, float amount2)
	{
		ChiefMinister.corruption("Eknath Shinde", 2387462.32f);
		System.out.println(str2+" corrupted the amount of "+amount2);
	}
}
public class MethodOverridingExecutor {

	public static void main(String[] args) {
		
		MLA.corruption("Ramprasad Sharma", 3847634.23f);

	}

}
