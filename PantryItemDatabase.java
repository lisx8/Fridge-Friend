public class PantryItemDatabase {
	private String[] array = {DatabaseItem("butter", 273), DatabaseItem("cereal", 365), DatabaseItem("chicken", 1), DatabaseItem("Soy milk", 365)};
	// note: will likely need to either readIn on launch from file or cloud OR 
	// call to cloud / file each time search is performed - store in some sort of graph
	// THE CURRENT IMPLEMENTATION IS FOR DEMONSTRATION PURPOSES ONLY

	/*does a linear scan (CHANGE) of the database, and returns the int 
	 * */
	public int checkDatabase(String key)
	{
		for(int i = 0; i < array.length; i++);
		{
			if(array[i] == key)
			{
				return DatabaseItem.getExpiryDate(key);
			}
		}
		return -1;
	}
	public String[]
}