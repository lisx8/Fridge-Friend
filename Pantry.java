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
			//If file is found, continue doing your shit
		}
	}
	
	private boolean findFile()
	{
		inFile = new File("C:/Users/Shay/Documents/PantryList.txt");
		
		try
		{
			scanFile = new Scanner(inFile);
			numPantryList = scanFile.nextInt();
			
			return true;
		} catch(Exception e)
		{
			System.out.println("File not found.");
			
			return false;
		}
	}
	
	public static void minHeapSort(PantryItem[] unsorted)
	{
		sorted = new PriorityQueue<PantryItem>(unsorted.length);
		
		newGrocery = new PantryItem(scanFile.next());
		sorted.add(newGrocery);
	}
	
	/*public static void addToPantry(PantryItem food)
	{
		
	}*/
	
	
	
	
	
	
	
	/* When user presses delete button, the String is passed from the GUI to this method, where
	 * it will be searched for in the sorted array (NAME IT) and then deleted. 
	 */
	public static void pantryDeleter(String del)
	{
		
	}
}
