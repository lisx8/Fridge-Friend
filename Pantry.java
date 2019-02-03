import java.io.*;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Collections;
import java.util.ArrayList;

public class Pantry
{
	private static ArrayList<PantryItem> sortedPantry;
	private static File savedPantryList = new File("C:/Users/Shay/Documents/PantryList.txt");
	private static int numPantryList;
	
	//Constructor for Pantry; calls createFromFile()
	public Pantry() throws FileNotFoundException
	{
		this.createFromFile();
	}
	
	//Fills sortedPantry with PantryItems from a file, then sorts all values.
	private void createFromFile() throws FileNotFoundException
	{
		Scanner scanFile = new Scanner(savedPantryList);
		sortedPantry = new ArrayList<PantryItem>();
		
		while(scanFile.hasNext())
		{
			PantryItem newGrocery = new PantryItem(scanFile.next(), scanFile.nextInt());
			sortedPantry.add(newGrocery);
			numPantryList++;
		}
		Collections.sort(sortedPantry);
		scanFile.close();
	}
	
	//Takes a String, makes a PantryItem from it, then adds it to sortedPantry and sorts it.
	private static void addToPantry(String item)
	{
		PantryItem temp = new PantryItem(item);
		sortedPantry.add(temp);
		Collections.sort(sortedPantry);
		numPantryList++;
	}

	//Removes a PantryItem from sortedPantry, then sorts it.
	public static void pantryDeleter(PantryItem item)
	{
		sortedPantry.remove(item);
		Collections.sort(sortedPantry);
	}
	
	public static void savePantry() throws FileNotFoundException
	{
		PrintWriter writer = new PrintWriter(savedPantryList);
		
		for(int i = 0; i < sortedPantry.size(); i++)
		{
			writer.print(sortedPantry.get(i).pantryItem() + " " + sortedPantry.get(i).getNumDaysToExpiry());
			pantryDeleter(sortedPantry.get(i));
		}
		
		writer.close();
	}
}