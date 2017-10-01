package stringconcept;

public class String3 {

	public static void main(String[] args) {
		String s1="do u know about me";
		
		
		
		String s2="javatpoint";  
		String s3="javatpoint";  
		String s4="JAVATPOINT";  
		String s5="python"; 
		

		System.out.println(s1.contains("do u"));
		System.out.println(s1.contains("about me"));
		System.out.println(s1.contains("hellow"));            // 11.string 
		 
		System.out.println(s2.equalsIgnoreCase(s2));//12.true because content and case both are same  
		System.out.println(s2.equalsIgnoreCase(s3));//true because case is ignored  
		System.out.println(s2.equalsIgnoreCase(s4));//false because content is not same  
		

		// TODO Auto-generated method stub

	}

}
