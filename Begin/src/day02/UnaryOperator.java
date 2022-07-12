package day02;

public class UnaryOperator {
	public static void main(String[] args)
	{
		System.out.println("1. 단항 연산자 (부호연산자 : +, -)");
		int a=-6;
		System.out.println(+a);
		System.out.println(-a);
		System.out.println("2.증감연산자:++,00");
		int b=4;
		long c=9;
		b++;
		c--;
		System.out.println(b);
		System.out.println(c);
		++b;
		--c;
		System.out.println(b);
		System.out.println(c);
		float d = 5.3f;
		double e = 7.3;
		System.out.println(d++);
		System.out.println("d : "+d);
		System.out.println(e--);
		System.out.println("e : "+e);
		System.out.println(++d);
		System.out.println("d : "+d);
		System.out.println(--e);
		System.out.println("e : "+e);
		
		int x=10;
		int y=x++;
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		x=10;
		int z=++x;
		System.out.println("x="+x);
		System.out.println("z="+z);
		
		System.out.println("3. 비트별 not연산자 : ~");
		// 3 : 00000000 00000000 00000000 0000011
		int m=3;
		System.out.println(m);
		System.out.println(~m);
		int n=0xfffffff1;
		System.out.println("~n:"+(~n));
		
		System.out.println("4. 논리 부정 연산자 : !");
		boolean bool = true;
		System.out.println(bool);
		System.out.println(!bool);
		System.out.println(!(3<2));
		int fo=5;
		System.out.println(fo==5.0);
		System.out.println(fo!=5.0);
	}
}
