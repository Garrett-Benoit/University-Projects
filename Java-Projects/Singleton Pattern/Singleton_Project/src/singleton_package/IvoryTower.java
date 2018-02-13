/*	Project:	Assignment 2
 * 	Programmer:	Garrett Benoit
 * 	Due Date:	11/17/16
 */

package singleton_package;

public final class IvoryTower
{
  private static final IvoryTower INSTANCE = new IvoryTower();

  private IvoryTower() {}

  public static IvoryTower getInstance()
  {
    return INSTANCE;
  }
}