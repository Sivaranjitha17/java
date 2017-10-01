package day1example;


public class Demo {
	protected int a=1,b=2,c;

	void add ()
    {
		c=a+b;
		System.out.println(c);
		
	}
	void sub()
	{
		int c=1,d=2,e;
		e=c-d;
		System.out.println(e);
	}
	class ranj extends Demo{
		void don()
		{
			 System.out.println (a*b);
		}
	}
		public static void main   (String []args)
		{
			Demo ob=new Demo();
			ob.sub();
			
		
		
			
		}
}
	





