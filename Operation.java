package PRACTICE1;

public class Operation {

	int a, b;
	public Operation() {
		// TODO Auto-generated constructor stub
	}
	
	int addition (int a, int b)
	{
		int sum = a+b;
		return sum;
	}
	
	int substraction (int a, int b)
	{
		int dif = a - b;
		return dif;
	}
	
	int multiplication (int a,int b)
	{
		int mul =  a*b;
		return mul;
	}
	
	
	float division (int a, int b)
	{
		float div = 0;
		
		
		if( b!= 0)
			div = a/(float)b;
		else
			System.out.println("Can't divide by 0\n");
		
		return div;
	}
	
}
