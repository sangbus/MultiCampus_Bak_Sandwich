package day08;

public class Sub extends Super{
	int b=30;
	int c=40;
	
	@Override
	public void func()
	{
		System.out.println("func() ####");
	}
	
	//Overload
	public String func(int a)
	{
		return "func() : a="+a;
	}
}
