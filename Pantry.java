<<<<<<< HEAD
import java.io.*;
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Collections;

public class Pantry
{
	private static PriorityQueue<PantryItem> sorted;
	private static File savedPantryList = new File("C:/Users/Shay/Documents/PantryList.txt");
	private static int numPantryList;
	private static PantryItem newGrocery;
	
	//Constructor for Pantry; takes an array of PantryItems and does [INSERT STUFF HERE]
	public Pantry() throws FileNotFoundException
	{
		this.createFromFile();
	}

	private void createFromFile() throws FileNotFoundException
	{
		Scanner scanFile = new Scanner(savedPantryList);
		
		while(scanFile.hasNext())
		{
			PantryItem newGrocery = new PantryItem(scanFile.next(), scanFile.nextInt());
			sorted.add(newGrocery);
		}
		
		scanFile.close();
	}
	
	private static void addToPantry(PantryItem item)
	{
		sorted.add(item);
	}
	
	public static void minHeapSort(PantryItem[] unsorted)
	{
		sorted = new PriorityQueue<PantryItem>(unsorted.length);
		
		//newGrocery = new PantryItem(scanFile.next(), scanFile.nextInt());
		sorted.add(newGrocery);
	}
	
	/* When user presses delete button, the String is passed from the GUI to this method, where
	 * it will be searched for in the sorted array (sorted) and then deleted. 
	 */
	public static void pantryDeleter(String del)
	{
		
	}
}
=======
import java.io.*;
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Collections;

public class Pantry
{
	private static PriorityQueue<PantryItem> sorted;
	private static File inFile;
	private static int numPantryList;
	private static Scanner scanFile;
	private static PantryItem newGrocery;
	
	//Constructor for Pantry; takes an array of PantryItems and does [INSERT STUFF HERE]
	public Pantry()
	{
		if(this.findFile())
		{
			this.createFromFile();
		}
	}
	
	private boolean findFile()//i can't access findFile() from constructor if it's marked static
	{
		inFile = new File("C:/Users/Shay/Documents/PantryList.txt");
		
		try
		{
			scanFile = new Scanner(inFile);
			
			return true;
		} catch(Exception e)
		{
			System.out.println("File not found.");
			
			return false;
		}
	}
	
	private void createFromFile()//i can't access createFromFile() from constructor if it's marked static
	{
		for(int i = 0; i < numPantryList; i++)//use the new thing Anneke showed us, once they post the slides?
		{
			PantryItem newGrocery = new PantryItem(scanFile.next());
			
			
		}
		
		
		
	}
	
	public static void minHeapSort(PantryItem[] unsorted)
	{
		sorted = new PriorityQueue<PantryItem>(unsorted.length);
		
		newGrocery = new PantryItem(scanFile.next());
		sorted.addToPantry(newGrocery);
	}
	
	public static void addToPantry(PantryItem food)
	{
		
	}
	
	
	
	
	
	
	
	/* When user presses delete button, the String is passed from the GUI to this method, where
	 * it will be searched for in the sorted array (sorted) and then deleted. 
	 */
	public static void pantryDeleter(String del)
    
/* the sorted list of items in the pantry
 *	new items are added by creating a PantryItem, which takes a string to search the database for
 *  if the entry is in the database, it will create a pair storing both the integer numDaysToExpiry
 *  and the integer pantry item
 * */

}
>>>>>>> d1e73d174ff5021edf2006d2cff63fb8bf04df09
