//A program to demonstrate on access specifier
//driver class
package in.kkwagh.library;
import in.bkcmet.library.*;

//another way to import the package
//import in.bkcmet.library.Library;

public class FacultyExecutor {

	public static void main(String[] args) {
		
		Library l = new Library();
		l.libraryName = "Bhujbal Library";
		l.displayPublic();
		
		/*
		 userId and displayPrivate() method is private, so we can't access into another 
		 package or class, only we can access inside the same class
		 */
//		l.userId = 1234324L;
//		l.displayPrivate();
		
		/*
		 booksName and displayDefault() method is default,
		 so we can't access into another package, 
		 only we can access it within the same package
		 */
		
//		l.booksName;
//		l.displayDefault();
				
	}

}
