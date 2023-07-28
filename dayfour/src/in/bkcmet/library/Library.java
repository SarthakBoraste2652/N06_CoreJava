//A program to demonstrate on access specifier

package in.bkcmet.library;

public class Library {
	//different access specifier
	public String libraryName;
	private long userId;
	String booksName;
	
	//public method
	public void displayPublic()
	{
		System.out.println("Library Name : "+libraryName);
	}
	
//	private method
	private void displayPrivate()
	{
		System.out.println("User Id"+userId);
	}
	
	//default method
	void displayDefault()
	{
		System.out.println("Books Name: "+booksName);
	}
}
