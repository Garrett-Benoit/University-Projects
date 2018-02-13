/*	Project:	Assignment 2
 * 	Programmer:	Garrett Benoit
 * 	Due Date:	11/17/16
 */

package private_class_data_package;

public class Gumbo
{
	private int numSausage;
	private int numChicken;
	private int numCelery;
	private int numOnions;
	private int numGarlic;

	// G - Constructor
	public Gumbo(int numSausage, int numChicken, int numCelery, int numOnions, int numGarlic)
	{
		this.numSausage = numSausage;
	    this.numChicken = numChicken;
	    this.numCelery = numCelery;
	    this.numOnions = numOnions;
	    this.numGarlic = numGarlic;
	 }

	// G - Build the string of each ingredient and print it to the console
	public void mix()
	{
		final String sausage;
		final String chicken;
		final String celery;
		final String onion;
		final String garlic;
		  
		if (numSausage == 1)
		{
			sausage = "sausage";
		}
		else
		{
			sausage = "sausages";
		}
		if (numChicken == 1)
		{
			chicken = "piece of chicken";
		}
		else
		{
			chicken = "pieces of chicken";
		}
		if (numCelery == 1)
		{
			celery = "stalk of celery";
		}
		else
		{
			celery = "stalks of celery";
		}
		if (numOnions == 1)
		{
			onion = "diced onion";
		}
		else
		{
			onion = "diced onions";
		}
		if (numGarlic == 1)
		{
			garlic = "clove of garlic";
		}
		else
		{
			garlic = "cloves of garlic";
		}
		
	    System.out.println(String.format(
	        "Mixing the gumbo we find: %d %s, %d %s, %d %s, %d %s, and %d %s", numSausage, sausage,
	        numChicken, chicken, numCelery, celery, numOnions, onion, numGarlic, garlic));
	}

  public void taste()
  {
	  System.out.println("Tasting the gumbo");
	  if (numSausage > 0)
	  {
		  numSausage--;
	  }
	  if (numChicken > 0)
	  {
		  numChicken--;
	  }
	  if (numCelery > 0)
	  {
		  numCelery--;
	  }
	  if (numOnions > 0)
	  {
		  numOnions--;
	  }
	  if (numGarlic > 0)
	  {
		  numGarlic--;
	  }
  }
}
