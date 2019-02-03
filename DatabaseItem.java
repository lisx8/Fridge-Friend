//http://foodbankofeastalabama.com/wp-content/uploads/2011/04/Just-How-Long-Is-That-Food-Good.pdf
public class DatabaseItem {
	private static String key;
	private static int expiryDate;
	public DatabaseItem(String aKey, int averageShelfLife)
	{
		key = aKey;
		expiryDate = averageShelfLife;
	}
	protected static int getExpiryDate()
	{
		return expiryDate;
	}
	protected static String getKey()
	{
		return key;
	}
}
