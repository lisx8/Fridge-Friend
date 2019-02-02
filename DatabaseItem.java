//http://foodbankofeastalabama.com/wp-content/uploads/2011/04/Just-How-Long-Is-That-Food-Good.pdf
public class DatabaseItem {
	private String key;
	private int expiryDate;
	public DatabaseItem(String aKey, int averageShelfLife)
	{
		aKey = key;
		expiryDate = averageShelfLife;
	}
	protected int getExpiryDate(String key)
	{
		return expiryDate;
	}
}
