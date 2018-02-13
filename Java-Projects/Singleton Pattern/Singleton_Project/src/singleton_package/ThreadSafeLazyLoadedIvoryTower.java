/*	Project:	Assignment 2
 * 	Programmer:	Garrett Benoit
 * 	Due Date:	11/17/16
 */

package singleton_package;

public final class ThreadSafeLazyLoadedIvoryTower
{
  private static ThreadSafeLazyLoadedIvoryTower instance;

  private ThreadSafeLazyLoadedIvoryTower() {}

  public static synchronized ThreadSafeLazyLoadedIvoryTower getInstance()
  {
    if (instance == null)
    {
      instance = new ThreadSafeLazyLoadedIvoryTower();
    }
    return instance;
  }
}