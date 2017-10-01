package day1example;

public class Exception {

	public static void main(String[] args) {
		
try{
	int a;
	a=100/0;
}
		
		
		catch(ArithmeticException a)
		{
			System.out.println(a);

			System.out.println("cannot divide by zero");

		}
		finally
		{
			System.out.println("finally....");

		}
		// TODO Auto-generated method stub

	}

}
