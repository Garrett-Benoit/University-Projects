package arithmetic_Package;

public class Arithmetic {
		
	//instance fields
	private int num1;
	private int num2;

	//constructor
	public Arithmetic(int a, int b)
	{
		if (a>b)
		  {
			num1 = a;
			num2 = b;	
		  }
		else
		  {
			num1 = b;
			num2 = a;
		  }
	}

	//Accessor
	public void setNum1(int num)
	{
		num1 = num;
	}

	public int getNum1()
	{
		return num1;
	}

	public void setNum2(int num)
	{
		num2 = num;
	}

	public int getNum2()
	{
		return num2;
	}

	//methods
	public int add()
	{
		return num1+num2;
	} 

	public int subtract()
	{
		return num1-num2;
	} 
	
	public int multiply()
	{
		return num1*num2;
	} 
	
	public int divide()
	{
		return num1/num2;
	} 
	
	public int remainder()
	{
		return num1%num2;
	} 
	
}
