package org.tnsif.interfaceexecutor;
//driver class
public class InterfaceExecutor {

	public static void main(String[] args) {
		//we can't instantiate inheritance
//		Sony n = new Sony();
		
		SonyTV s = new SonyTV();
		s.display();
		s.show();
		Sony.accept();
		System.out.println(Sony.noOfChannels);
		
		ISRO i= new ISRO();
		i.status();
		
		Human h = new Human();
		h.showDrink();

	}

}
