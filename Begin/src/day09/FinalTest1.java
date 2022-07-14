package day09;
class Super{
	void foo()
	{
		System.out.println("Super's foo()");
	}
}
class Sub extends Super
{
	protected void foo()
	{
		System.out.println("Sub's foo()");
	}
}
public class FinalTest1 extends Sub{

	public static void main(String[] args) {
		
	}

}
