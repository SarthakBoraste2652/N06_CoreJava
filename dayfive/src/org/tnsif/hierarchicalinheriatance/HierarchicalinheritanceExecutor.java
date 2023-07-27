//Driver class
package org.tnsif.hierarchicalinheriatance;

public class HierarchicalinheritanceExecutor {

	public static void main(String [] args)
	{
		Tiramisu t = new Tiramisu("RealMe", "DoubleSlot", 13);
		SnowCone s = new SnowCone("Samsung", "DoubleSlot", 12);
		System.out.println(t);
		System.out.println(s);
	}
}
