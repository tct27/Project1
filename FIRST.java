package PRACTICE1;
//FIrst class
public class FIRST {

	static int a;
	public FIRST() {
		// TODO Auto-generated constructor stub
		a = 0;
	}
	public FIRST(int an)
	{
		a = an;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2, b=3;
		Operation o = new Operation();
		
		int sum = o.addition(a,b);
		int dif = o.substraction(a,b);
		int mul = o.multiplication(a, b);
		float div = o.division(a, b);

		System.out.println(sum+ " " + dif + "\n " + mul + " " + div + "\n"+3/2.0);
		

	}

}



