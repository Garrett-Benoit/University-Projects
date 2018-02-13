/*	Project:	Assignment 2
 * 	Programmer:	Garrett Benoit
 * 	Due Date:	11/17/16
 */

package singleton_package;

public class App
{
  public static void main(String[] args)
  {
    // eagerly initialized singleton
    IvoryTower ivoryTower1 = IvoryTower.getInstance();
    IvoryTower ivoryTower2 = IvoryTower.getInstance();
    System.out.println("ivoryTower1 eager initialization: " + ivoryTower1);
    System.out.println("ivoryTower2 eager initialization: " + ivoryTower2 + "\n");

    // lazily initialized singleton
    ThreadSafeLazyLoadedIvoryTower threadSafeIvoryTower1 =
        ThreadSafeLazyLoadedIvoryTower.getInstance();
    ThreadSafeLazyLoadedIvoryTower threadSafeIvoryTower2 =
        ThreadSafeLazyLoadedIvoryTower.getInstance();
    System.out.println("threadSafeIvoryTower1 lazy initialization: " + threadSafeIvoryTower1);
    System.out.println("threadSafeIvoryTower2 lazy initialization: " + threadSafeIvoryTower2 + "\n");

    // enum singleton
    EnumIvoryTower enumIvoryTower1 = EnumIvoryTower.INSTANCE;
    EnumIvoryTower enumIvoryTower2 = EnumIvoryTower.INSTANCE;
    System.out.println("enumIvoryTower1 enum singleton: " + enumIvoryTower1);
    System.out.println("enumIvoryTower2 enum singleton: " + enumIvoryTower2 + "\n");

    // double checked locking
    ThreadSafeDoubleCheckLocking dcl1 = ThreadSafeDoubleCheckLocking.getInstance();
    System.out.println("Double check 1: " + dcl1);
    ThreadSafeDoubleCheckLocking dcl2 = ThreadSafeDoubleCheckLocking.getInstance();
    System.out.println("Double check 2: " + dcl2 + "\n");

    // initialize on demand holder idiom
    InitializingOnDemandHolderIdiom demandHolderIdiom =
        InitializingOnDemandHolderIdiom.getInstance();
    System.out.println(demandHolderIdiom);
    InitializingOnDemandHolderIdiom demandHolderIdiom2 =
        InitializingOnDemandHolderIdiom.getInstance();
    System.out.println(demandHolderIdiom2);
  }
}
