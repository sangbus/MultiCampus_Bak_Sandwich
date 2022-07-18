package day11_1;

public class InnerClassTest {

	public static void main(String[] args) {
		//1) Outer클래스의 a,b변수값을 출력하세요
		//2) Inner클래스의 c변수값 출력하고
//			sub()메소드 호출하기
		//3) SInner클래스의 d 출력
//			foo(), bar()호출하기
		Outer o = new Outer();
		System.out.println(o.a);
		System.out.println(Outer.b);
		Outer.Inner i = o.new Inner();
		Outer.Inner oi2 = new Outer().new Inner();
		oi2.sub();
		System.out.println(i.c);
		i.sub();
		Outer.SInner s = new Outer.SInner();
		System.out.println(s.d);
		System.out.println(Outer.SInner.e);
		s.foo();
		Outer.SInner.bar();
	}

}
