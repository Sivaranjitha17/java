package day1;

public class Polymophismr {
	void add(int a,int b)
	{
		System.out.println(a+b);
	}void sub(int a,int b)
	{
		System.out.println(a-b);
	}

	public static void main(String[] args) {
		Polymophismr p=new Polymophismr ();
		p.add(10,10);
		p.sub(10,10);
		
		// TODO Auto-generated method stub

	}

}
