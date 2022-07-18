package day11_1;

public class Outer {
	int a = 1;
	static int b = 2;
	void print()
	{
		Inner i = new Inner();
		i.sub();
	}
	class Inner
	{
		int c = 3;
		void sub()
		{
			System.out.println("sub()****");
		}
	}
	static class SInner
	{
		int d = 4;
		static int e = 5;
		void foo()
		{
			System.out.println("foo()####");
		}
		static void bar()
		{
			System.out.println("bar()@@@@");
		}
	}
}
