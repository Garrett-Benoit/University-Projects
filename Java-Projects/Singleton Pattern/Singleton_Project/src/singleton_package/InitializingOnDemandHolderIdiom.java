/*	Project:	Assignment 2
 * 	Programmer:	Garrett Benoit
 * 	Due Date:	11/17/16
 */

package singleton_package;

public final class InitializingOnDemandHolderIdiom
{
  private InitializingOnDemandHolderIdiom() {}

  public static InitializingOnDemandHolderIdiom getInstance()
  {
    return HelperHolder.INSTANCE;
  }
  
  private static class HelperHolder
  {
    private static final InitializingOnDemandHolderIdiom INSTANCE =
        new InitializingOnDemandHolderIdiom();
  }
}