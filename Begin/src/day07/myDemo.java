package day07;

public class myDemo {
	int x = 10;
	static int y = 20;
	public static void foo()
	{
		System.out.println("foo...");
	}
	public void bar()
	{
		System.out.println("bar...");
	}
	public String star(int n)
	{
		String a = "";
		for(int i=0;i<n;i++)
		{
			a+="★";
		}
		return a;
	}
	public static String snail()
	{
		return "@@@";
	}
}
