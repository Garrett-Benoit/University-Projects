/*	Project:	Assignment 2
 * 	Programmer:	Garrett Benoit
 * 	Due Date:	11/17/16
 */

package private_class_data_package;

import java.util.Random;

public class App
{
  public static void main(String[] args)
  {
	  int meat = 18;
	  int veggie = 4;
	  
	  // Mutable Gumbo
	  Gumbo gumbo = new Gumbo(TossIn(meat), TossIn(meat), TossIn(veggie), TossIn(veggie), TossIn(veggie));
	  gumbo.mix();
	  gumbo.taste();
	  gumbo.mix();
	  
	  System.out.println("");
	  
	  // Immutable Gumbo protected with Private Class Data pattern
	  ImmutableGumbo immutableGumbo = new ImmutableGumbo(TossIn(meat), TossIn(meat), TossIn(veggie), TossIn(veggie), TossIn(veggie));
	  immutableGumbo.mix();
	  immutableGumbo.mix();
  }
  
  // G - Randomly generate and return a number from 1 to n
  public static int TossIn(int n)
  {
	  int min = 1;
	  int max = n;
	  
	  Random rand = new Random();
	  
	  int randomNum = rand.nextInt((max - min) + 1) + min;
	  
	  return randomNum;
  }
}
