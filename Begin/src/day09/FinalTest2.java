package day09;
class SuperDemo
{
	void Sub()
	{
		System.out.println("SuperDemo's sub()");
	}
	final void bar()
	{
		System.out.println("SuperDemo's bar()");
	}
}
class SubDemo extends SuperDemo
{
	@Override
	void Sub()
	{
		System.out.println("SubDemo's sub()");
	}
}
public class FinalTest2 {
	public static void main(String[] args) {
		SuperDemo sd = new SuperDemo();
		sd.Sub();
		sd.bar();
		SubDemo m = new SubDemo();
		m.Sub();
		m.bar();
	}

}
