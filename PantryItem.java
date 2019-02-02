public class PantryItem implements Comparable<PantryItem>{
	private String pantryItem;
	PantryItemDatabase database = new PantryItemDatabase();
	private int numDaysToExpiry;
	public PantryItem(String item)
	{
		pantryItem = item;
		numDaysToExpiry = database.checkDatabase(item);
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
