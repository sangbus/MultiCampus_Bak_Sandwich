package day09;

interface Inter1
{
	void a();
}

interface Inter2
{
	String b();
}

abstract class AbsClass
{
	abstract void c();
}

interface HisInter extends Inter1,Inter2
{
	String str = "Hello";
}
public class MyClass2 extends  AbsClass implements HisInter{

	public static void main(String[] args) {
		MyClass2 m = new MyClass2();
		HisInter h = new MyClass2();
		AbsClass a = new MyClass2();
		System.out.println("Myclass2타입의 변수");
		m.a();
		System.out.println(m.b());
		m.c();
		System.out.println(MyClass2.str);
		System.out.println("HisInter타입의 변수");
		h.a();
		System.out.println(h.b());
		((AbsClass)h).c();
		System.out.println(HisInter.str);
		System.out.println("AbsClass타입의 변수");
		((MyClass2)a).a();
		System.out.println(((MyClass2)a).b());
		a.c();
		System.out.println(MyClass2.str);
		System.out.println("");
	}

	@Override
	public void a() {
		System.out.println("인터");
	}

	@Override
	public String b() {
		return "반환";
	}

	@Override
	void c() {
		System.out.println("추상");
	}
}
