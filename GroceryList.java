import java.util.*;
import java.io.*;

public class GroceryList {
	// ----- Instance Variables ----- //
	private static ArrayList<String> checklist;
	
	// ----- Constructor ----- //
	public GroceryList() throws FileNotFoundException{
		checklist = new ArrayList<String>();
		this.uploadChecklist();
	}
	
	// ---- Methods ----- //
	//Uploads the saved checklist by reading the checkList from a file
	private void uploadChecklist() throws FileNotFoundException {
		
	}
	
	//Saves the current checklist by printing checklist to a file
	private void saveChecklist() {
		
	}
	
	//Adds new item to the checklist
	//In the future, we might make this boolean, because if the checklist already contains the item
	//We'll want to tell the user it already exists
	private static void addToChecklist(String newItem) {
		//Do we want the checklist sorted? if so, we would probably sort them as we add them to the checklist
		if (!checklist.contains(newItem)) {
			checklist.add(newItem);
		}
	}
	
	//Deletes the item without adding it to the Pantry
	private static void deleteWithoutAddingToPantry(String item) {
		checklist.remove(item);
	}
	
	//Deletes the item from the checklist
	//and calls Pantry.addtoPantry(String) to add it to the Pantry
	private static void deleteAndAddToPantry(String item) {
		PantryItem newPI = new PantryItem(item);
		Pantry.addToPantry(newPI);
		checklist.remove(item);
	}
	
}
