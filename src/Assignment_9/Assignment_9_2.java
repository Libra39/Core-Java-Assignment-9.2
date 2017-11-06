/**
 * 
 */
package Assignment_9;																// Package Declared
import java.util.HashSet;															// import HashSet class for util package
import java.util.Set;																// import HashSet class for util package
public class Assignment_9_2 {														// Class declared
/**
 * Write a program to copy all the elements from set2 to set1 so that the set1 becomes the union of set1 and set2
 *
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com
 */	
public static void main(String[] args) {											// Main method Started
	    System.out.println("\n====================================="				// Print Statement	
	    				 + "\n        Union OF Two Sets\n"
	    				 + "=====================================");
		Set<String> myFirstSet = new HashSet<String>();								// created an anonymous inner class which has an instance initializer which adds Strings to itself when an instance is created.Keep Actually create an new subclass of HashSet each time it is used, even though one does not have to explicitly write a new subclass. 
		myFirstSet.add("LION");														// add() method is used for adding an element to the ArrayList. 
		myFirstSet.add("TIGER");													// add() method is used for adding an element to the ArrayList.	
		myFirstSet.add("CAT");														// add() method is used for adding an element to the ArrayList.
		Set<String> mySecondSet = new HashSet<String>();							// created an anonymous inner class which has an instance initializer which adds Strings to itself when an instance is created.Keep Actually create an new subclass of HashSet each time it is used, even though one does not have to explicitly write a new subclass. 
	    mySecondSet.add("DOG");														// add() method is used for adding an element to the ArrayList.
	    mySecondSet.add("CAT");														// add() method is used for adding an element to the ArrayList.
	    mySecondSet.add("FOX");														// add() method is used for adding an element to the ArrayList.
	    System.out.println("The First Set  : " + myFirstSet + 						// Print Statement
	    				 "\nThe Second Set : " + mySecondSet +
	    				"\n====================================="+
	    				"\nUnion: " + union(myFirstSet, mySecondSet)+				// Union() method is called
	    				"\n=====================================");
	  }																				// Main method Closed
	public static <T> Set<T> union(Set<T> myFirstSet, Set<T> mySecondSet) {     	//Creates a new HashSet object that is the set of all elements that are either in the first set or the second set.
		    Set<T> tmp = new HashSet<T>(myFirstSet);								
		    tmp.addAll(mySecondSet);												// HashSet will remove duplicates when using addAll() method
		    return tmp;}  
}																					// class Assignment_9_2 closed