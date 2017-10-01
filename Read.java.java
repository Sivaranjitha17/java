package day2example;
 import java.io.*;

public class Read {

	public static void main(String[] args) {
		try{
			FileInputStream an=new FileInputStream("D:\\two.txt");
			 int i=0;    
	            while((i=an.read())!=-1){    
	             System.out.print((char)i);    
	            }    
			an.close();
		}catch(Exception e)
		{
			System.out.println("Succed");

		}
		// TODO Auto-generated method stub

	}

} 
