package geekster;

public class Typecasting {
	public static void main(String args[])
	{
		int a=141414;
		float b;
		b=a;
		System.out.println(a);
		System.out.println("widening casting");
	    System.out.println(b);/*automatic casting*/
	    
	    
	    double mydn=12.44d;
	    int yudn=(int)mydn;
	    System.out.println(mydn);
	    System.out.println("narrow casting");
	    System.out.println(yudn);/*narrow casting*/
	    
	}

}
