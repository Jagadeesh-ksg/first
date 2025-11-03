package day1;

public class FibanocciSeries {
	public static void main(String[] args) 
	{
		int range=10;
		for(int i=0;i<=range-1;i++)
		{
			System.out.print(fib(i)+" ");
		}
	}
	public static int fib(int n)
	{
		if(n==0)return n;
		if(n==1)return n;
		return fib(n-1)+fib(n-2);
	}

}
