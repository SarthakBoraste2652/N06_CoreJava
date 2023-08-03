package org.tnsif.finalkeyword;

public class FinalKeywordExecutor {

	public static void main(String[] args) {
		FinalVariable f = new FinalVariable();
		//we can't change the value of the final variable 
//		f.SALARY = 2342.34f;
		f.print();

		Lenovo l = new Lenovo();
		
		l.display();
		l.display(l.PROCESSOR);
	}

}
