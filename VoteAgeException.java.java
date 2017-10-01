package day1example;
import java.util.*;

public class VoteAgeException {

	public static void main(String[] args) {
		try{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int a=sc.nextInt();
		System.out.println("Enter your name");
		String s=sc.next();

        
		
			if(a<18){
				System.out.println("age should not eligible for vote");
				
			}
			else if(a>18){
				System.out.println("age should be eligible for vote");
		        
				
			}
		}

			catch(NumberFormatException ae )
			{
				System.out.println(ae);

				System.out.println("Enter the valid number data");
			}
		
		
		finally{
			System.out.println("it worked");

		}
		}
		// TODO Auto-generated method stub

	}


