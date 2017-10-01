package stringconcept;

public class SString1 
{
	public  static void main (String[]args)
	{
		String s1="RANJI";
		String s2="RANJI";
		char [] ch={'r','a','n'};
		String s3=new String(ch);
		String s4="RANJI";
		s4.concat("siva");
		  

		System.out.println(s1.toLowerCase());// 1.String toLowerCase() method
		System.out.println(s1.toUpperCase());// 2.String toUpperCase() method
		System.out.println(s1.charAt(1));    // 3.String charAt(1) method
		System.out.println(s1.compareTo(s2));//4. String compareTo() method
		System.out.println(s1.equals(s2));   // 5.String equal method

		System.out.println(s3);              // 6.String convert  char method
		System.out.println(s4);              // 7.String  concat method





		
	}

}
