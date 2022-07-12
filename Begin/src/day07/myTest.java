package day07;

public class myTest {

	public static void main(String[] args) {
		myDemo md = new myDemo();
		System.out.println(md.x);
		System.out.println(myDemo.y);
		myDemo.foo();
		md.bar();
		System.out.println(md.star(5));
		System.out.println(myDemo.snail());
	}

}
