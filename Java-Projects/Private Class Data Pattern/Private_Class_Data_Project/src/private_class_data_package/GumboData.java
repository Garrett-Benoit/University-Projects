/*	Project:	Assignment 2
 * 	Programmer:	Garrett Benoit
 * 	Due Date:	11/17/16
 */

package private_class_data_package;

public class GumboData
{
  private int numSausage;
  private int numChicken;
  private int numCelery;
  private int numOnions;
  private int numGarlic;

  public GumboData(int numSausage, int numChicken, int numCelery, int numOnions, int numGarlic)
  {
    this.numSausage = numSausage;
    this.numChicken = numChicken;
    this.numCelery = numCelery;
    this.numOnions = numOnions;
    this.numGarlic = numGarlic;
  }

  public int getNumSausage()
  {
    return numSausage;
  }

  public int getNumChicken()
  {
    return numChicken;
  }

  public int getNumCelery()
  {
    return numCelery;
  }

  public int getNumOnions() 
  {
    return numOnions;
  }
  
  public int getNumGarlic() 
  {
    return numGarlic;
  }
}
