package homework;

public class Swapstring {

	public static void main(String[] args) {
		String a= "my";
		String b="name";
		System.out.println("Before swap: " + a + " " + b);
		a=a+b;
		 b = a.substring(0, a.length() - b.length());  
	     a = a.substring(b.length());
		System.out.println("After : " + a + " " + b);
		// TODO Auto-generated method stub

	}

}
