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