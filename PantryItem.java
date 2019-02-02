public class PantryItem implements Comparable{
	private String pantryItem;
	private int numDaysToExpiry;
	public void PantryItem(String item)
	{
		pantryItem = item;
		numDaysToExpiry = checkDatabase(item);
	}
	
	public int compareTo(PantryItem other)
	{
		if(this.getExpiry() < other.getExpiry())
		{
			return -1;
		}
		else if(this.getExpiry() == other.getExpiry())
		{
			return 0;
		}
		else if(this.getExpiry() > other.getExpiry())
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
