package generic_Pair_Package;

public class Pair<T,S>
{
	private T text;
	private S sentence;
	
	public Pair(T t,S s)
	{
		text = t;
		sentence = s;
	}
	
	public T setT(T t)
	{
		return text = t;
	}
	
	public S setS(S s)
	{
		return sentence = s;
	}
	
	public T getT()
	{
		return text;
	}
	
	public S getS()
	{
		return sentence;
	}
		
}


class SamePair<S>
{
	private S text1;
	private S text2;
	
	public SamePair(S t,S s)
	{
		text1 = t;
		text2 = s;
	}
	
	public S setT(S t)
	{
		return text1 = t;
	}
	
	public S setS(S s)
	{
		return text2 = s;
	}
	
	public S getT()
	{
		return text1;
	}
	
	public S getS()
	{
		return text2;
	}
		
}