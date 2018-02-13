/*	Project:	Assignment 2
 * 	Programmer:	Garrett Benoit
 * 	Due Date:	11/17/16
 */

package singleton_package;

public enum EnumIvoryTower
{
  INSTANCE;

  @Override
  public String toString()
  {
    return getDeclaringClass().getCanonicalName() + "@" + hashCode();
  }
}
