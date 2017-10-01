package day2example;
import java.util.Scanner;
public class SumofNum {


    public static void main(String args[])
    {
        int i, n, sum=0, num;
        Scanner sc = new Scanner(System.in);
		
        System.out.print("How many Number You want to Enter to Add them ? ");
        n = sc.nextInt();
		
        System.out.print("Enter " +n+ " numbers : ");
        for(i=0; i<n; i++)
        {
            num = sc.nextInt();
            sum = sum + num;
        }
		
        System.out.print("Sum of all " +n+ " numbers is " +sum);
    }
}




