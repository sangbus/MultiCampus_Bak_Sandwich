package day11_1;

public class Local {
	String str = "멤버변수@@@";
	public void bar()
	{
		class LocalInner
		{
			
		}
	}
	public void sub()
	{
		double pi = 3.14;
		System.out.println("str : "+str);
		System.out.println("pi : "+pi);
		class LocalInner
		{
			String lstr = "LocalInner의 멤버변수###";
			void foo()
			{
				System.out.println(str);
				System.out.println(lstr);
				System.out.println(pi);
			}
		}
		LocalInner li = new LocalInner();
		li.foo();
	}
	public static void main(String[] args) {
		Local l = new Local();
		l.sub();
	}

}
