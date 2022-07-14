package day09;

public class MyClass implements MyInter,YourInter{

	@Override
	public void demo() {
		System.out.println("MyClass's demo()####");
	}
	@Override
	public int inter1()
	{
		return 100;
	}
	@Override
	public void inter2(String str)
	{
		System.out.println(str.toUpperCase());
	}
	public static void main(String[] args) 
	{
		MyInter m1 = new MyClass();
		YourInter y1 = new MyClass();
		m1.demo();
		int a = y1.inter1();
		System.out.println("a = "+a);
		y1.inter2("네이버");
		double b = YourInter.PI;
		System.out.println(b);
	}
}

