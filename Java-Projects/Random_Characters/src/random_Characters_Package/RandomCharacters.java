package random_Characters_Package;

import java.security.SecureRandom;
import java.util.*;

public class RandomCharacters
{

	public static void main(String[] args)
	{
		
		// Write a program to insert 30 random letters into a list of characters
		List<Character> list = new ArrayList<>();

		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		
		SecureRandom random = new SecureRandom();
		
		for (int i=0; i<30; i++)
		{
			list.add(alphabet.charAt(random.nextInt(26)));
		}
		
		for(Character c:list)
		{
			System.out.printf("%c ", c);
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println(list);
		
		System.out.println();
		
		// Sort the list in ascending order
		list.stream().sorted().forEach(c -> System.out.printf("%c ", c));
		
		// Sort the list in descending order
		System.out.println();
		
		Comparator<Character> compare = Character::compareTo;
		
		list.stream()
			.sorted(compare.reversed())
			.forEach(c -> System.out.printf("%c ", c));
		
		System.out.println();
		System.out.println();
		
		// Display the list in ascending order with duplicates removed
		list.stream()
			.distinct()
			.sorted()
			.forEach(c -> System.out.printf("%c ", c));
	}

}
