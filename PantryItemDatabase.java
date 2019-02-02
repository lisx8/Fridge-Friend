public class PantryItemDatabase {
	private static DatabaseItem[] array = {new DatabaseItem("butter", 273), new DatabaseItem("cereal", 365), new DatabaseItem("chicken", 1), new DatabaseItem("Soy milk", 365)};
	// note: will likely need to either readIn on launch from file or cloud OR 
	// call to cloud / file each time search is performed - store in some sort of graph
	// THE CURRENT IMPLEMENTATION IS FOR DEMONSTRATION PURPOSES ONLY

	/*does a linear scan (CHANGE) of the database, and returns the int 
	 * */
	public static int checkDatabase(String key)
	{
		for(int i = 0; i < array.length; i++)
		{
			if(array[i].getKey() == key)
			{
				return DatabaseItem.getExpiryDate();
			}
		}
		return -1;
	}
	
	
}