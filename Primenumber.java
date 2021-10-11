package geekster;

public class Primenumber {
	public static void main(String args[])
	{
	int n=200;
	int count=0;
	for(int i=1;i<=n;i=i+1)
	{
		if(n%i==0){
			count=count+1;
		}
	}
	System.out.println(count);
	if(count==2)
	{
		System.out.println("prime");
	}else
	{
		System.out.println("not prime");
	}

}
}