package day09;

class MyFinal
{
	final public static int n = 1;
	int x=2;
}
public class FinalTest3 {

	public static void main(String[] args) {
		MyFinal m = new MyFinal();
		System.out.println(MyFinal.n);
		System.out.println(m.x);
	}

}
