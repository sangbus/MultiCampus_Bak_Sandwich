package day02;

public class myoperator {
	public static void main(String[] args)
	{
		System.out.println("1. ---산술 연산자---");
		double b = 10;
		System.out.println(b/3);
		System.out.println("2. --- Shitft연산자(<<,>>,>>>)---");
		// -43 : 11111111 11111111 11111111 11010101
		System.out.println(-43<<2);
		// 11111111 11111111 11111111 01010100 -172
		System.out.println(-43>>2);
		// 11111111 11111111 11111111 11110101 -11
		System.out.println(-43>>>2);
		// 00111111 11111111 11111111 11110101
		System.out.println("3.비교연산자:==,!=,>=,<,<=,instanceof");
		int m=60;
		int n=160;
		System.out.println(m>=n);
		if(m>=n)
		{
			System.out.println("@@@@");
		}
		else if(m<n)
		{
			System.out.println("####");
		}
	}
}
