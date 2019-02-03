public class PantryItem implements Comparable<PantryItem>{
	private String pantryItem;
	PantryItemDatabase database = new PantryItemDatabase();
	private int numDaysToExpiry;
	/*
	 * PantryItem constructor 1):
	 * 1) This one searches the database for a string for a known expiry date
	 * */
	public PantryItem(String item)
	{
		pantryItem = item;
		numDaysToExpiry = database.checkDatabase(item);
	}
	/* PantryItem constructor 2)
	 * 
	 */
	public PantryItem(String item, int daysToExpiry)
	{
		pantryItem = item;
		numDaysToExpiry = daysToExpiry;
	}
	
	public int compareTo(PantryItem other)
	{
		if(this.getNumDaysToExpiry() < other.getNumDaysToExpiry())
		{
			return -1;
		}
		else if(this.getNumDaysToExpiry() == other.getNumDaysToExpiry())
		{
			return 0;
		}
		else
		{
			return -1;
		}
	}
	public String pantryItem()
	{
		return pantryItem;
	}
	public int getNumDaysToExpiry()
	{
		return numDaysToExpiry;
	}
}
