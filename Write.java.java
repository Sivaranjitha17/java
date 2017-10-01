package day2example;
import java.io.FileOutputStream;
import java.util.*;

public class Write {

	public static void main(String[] args) {
		try
		{
			FileOutputStream Writing=new FileOutputStream("D:\\one.txt");
			String s="good";
			byte b[]=s.getBytes();
			System.out.println(s);

			Writing.write(b);
			Writing.close();
			System.out.println("SUCCESS");
			
		}
		catch(Exception e)
		{
			System.out.println(e);

			
		}
		// TODO Auto-generated method stub

	}

}
