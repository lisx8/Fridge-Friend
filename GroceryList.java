import java.util.*;
import java.io.*;
public class GroceryList {
	// ----- Instance Variables ----- //
	ArrayList<String> checkList = new ArrayList();
	// !FLAG this file location should change if the install path for the .exe is changed. COME BACK TO THIS
	private static File savedGroceryList = new File("C:/Program Files/Fridge-Friend/savedGroceryList.txt");
	
	// ----- Constructor ----- //
	public GroceryList() throws FileNotFoundException{
		uploadChecklist();
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
	private void saveChecklist() throws FileNotFoundException{
		PrintWriter wr = new PrintWriter(savedGroceryList);
		for(int i = 0; i < checkList.size(); i++)
		{
			wr.print(checkList.remove(i));
		}
		wr.close();
	}
	
	//Adds new item to the checklist
	private void addToChecklist() {
		
	}
	
	//Deletes the item without adding it to the Pantry
	private void deleteWithoutAddingToPantry(String item) {
		
	}
	
	//Deletes the item from the checklist
	//and called addtoPantry(String) to add it to the Pantry
	private void deleteAndAddToPantry(String item) {
		
	}
	
	// ----- Helper Methods ----- //
	//Takes in a string, converts it to a PantryItem, and gives the new PantryItem to the Pantry
	private void addToPantry(String newPI) {
		
	}
}

//https://stackoverflow.com/questions/10166453/how-to-save-something-to-the-desktop-without-hard-coding-the-directory/10166623#10166623
