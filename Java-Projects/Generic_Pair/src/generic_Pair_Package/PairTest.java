package generic_Pair_Package;

public class PairTest
{

	public static void main(String[] args)
	{
		Integer t = 15;
		String s = "Hello";
		String r = "World";
		
		// Create Pair class and pass two 
		Pair<Integer, String> pTest = new Pair<Integer, String>(t, s);
		
		// Create Pair class and pass two 
		SamePair<String> pTest2 = new SamePair<String>(s, r);
		
		// Print t and s output to console
		System.out.println("Output one is: " + pTest.getT() + " " + pTest.getS() + "\n");
		
		// Print s and r output to console
		System.out.println("Output two is: " + pTest2.getT() + " " + pTest2.getS());
	}

}
