/*	Project:	Assignment 2
 * 	Programmer:	Garrett Benoit
 * 	Due Date:	11/17/16
 */

package private_class_data_package;

public class ImmutableGumbo
{
	private GumboData data;
	private int numSausage;
	private int numChicken;
	private int numCelery;
	private int numOnions;
	private int numGarlic;

	// G - Constructor
	public ImmutableGumbo(int numSausage, int numChicken, int numCelery, int numOnions, int numGarlic)
	{
		data = new GumboData(numSausage, numChicken, numCelery, numOnions, numGarlic);
	}
  
	// G - Get the number of each ingredient
	public void chop()
	{
		numSausage = data.getNumSausage();
		numChicken = data.getNumChicken();
		numCelery = data.getNumCelery();
		numOnions = data.getNumOnions();
		numGarlic = data.getNumGarlic();
	}

	// G - Build the string of each ingredient and print it to the console
	public void mix()
	{
		final String sausage;
		final String chicken;
		final String celery;
		final String onion;
		final String garlic;
	  
		chop();
	  
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
        "Mixing the immutable gumbo we find: %d %s, %d %s, %d %s, %d %s, and %d %s", numSausage, sausage,
        numChicken, chicken, numCelery, celery, numOnions, onion, numGarlic, garlic));
	}
}
