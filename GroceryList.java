import java.util.*;
import java.io.*;

public class GroceryList {
	// ----- Instance Variables ----- //
	private static ArrayList<String> checkList = new ArrayList();
	// !FLAG this file location should change if the install path for the .exe is changed. COME BACK TO THIS
	private static File savedGroceryList = new File("C:/Program Files/Fridge-Friend/savedGroceryList.txt");

	// ----- Constructor ----- //
	public GroceryList() throws FileNotFoundException{
		checkList = new ArrayList<String>();
		this.uploadChecklist();
	}

	// ---- Methods ----- //
	//Uploads the saved checklist by reading the checkList from a file
	private void uploadChecklist() throws FileNotFoundException{
		Scanner sc = new Scanner(savedGroceryList);
		while(sc.hasNext())
		{
			checkList.add(sc.next());
		}
		sc.close();
	}

	//Overwrites and saves the current checklist by printing checklist to a file
	public void saveChecklist() throws FileNotFoundException{
		PrintWriter wr = new PrintWriter(savedGroceryList);
		for(int i = 0; i < checkList.size(); i++)
		{
			wr.print(checkList.remove(i));
		}
		wr.close();
	}
	
	//Returns the checkList
	public static ArrayList<String> getCheckList()
	{	
		String[] arr = ArrayList.toArray();
		return arr;
	}

	//Adds new item to the checklist
	//In the future, we might make this boolean, because if the checklist already contains the item
	//We'll want to tell the user it already exists
	public static void addToChecklist(String newItem) {
		//Do we want the checklist sorted? if so, we would probably sort them as we add them to the checklist
		if (!checkList.contains(newItem)) {
			checkList.add(newItem);
		}
	}

	//Deletes the item without adding it to the Pantry
	public static void deleteWithoutAddingToPantry(String item) {
		checkList.remove(item);
	}

	//Deletes the item from the checklist
	//and calls Pantry.addtoPantry(String) to add it to the Pantry
	public static void deleteAndAddToPantry(String item) {
		Pantry.addToPantry(item);
		checkList.remove(item);
	}
}

//https://stackoverflow.com/questions/10166453/how-to-save-something-to-the-desktop-without-hard-coding-the-directory/10166623#10166623
