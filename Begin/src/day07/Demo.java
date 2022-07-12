package day07;

public class Demo {
	int x=10;
	double pi=3.14;
	static String STR = "Hello"; //클래스변수(static변수)
	//멤버 메소드(인스턴스 메소드)
	public void sub()
	{
		this.x=100;
		this.pi=5.15;
		STR = "222";
	}
	
	//클래스 메소드-static 메소드
	public static void main(String[] args) {
		Demo d = new Demo();
		d.x=20;
		System.out.println(d.x);
		System.out.println(d.pi);
		System.out.println(Demo.STR);
		d.sub();
		System.out.println(d.x);
		System.out.println(d.pi);
		System.out.println(Demo.STR);
	}

}
