package homework;

public class Palindrome {

	public static void main(String[] args) {
		int a=231,r,s=0,t=a;
		while(a!=0)
		{
			r=a%10;
			a=a/10;
			s=s*10+r;
			
			
		}
		if(t==s)
		{
			System.out.println("the number is palindrome");
		}
		// TODO Auto-generated method stub
		if(t!=s)
		{
			System.out.println("the number is not a palindrome");
		}

	}

}
