package day04;
public class mathtest {
	public static void main(String[] args) {
		//java.lang.math 클래스의 멤버변수
		//public static final double PI : 상수 원주율(3.14)
		System.out.println(Math.PI);
		/*
		 * public static double sqrt​(double a) : a의 제곱근 
		 * public static double ceil​(double a) : a의 올림값
		 * public static double floor​(double a) : a의 내림값
		 * public static int round​(float a) : a의 반올림값을 int로 반환
		 * public static double random()
		 */
		double a = Math.sqrt(64);
		System.out.println(a);
		double num=45.678;
		long b = Math.round(num);
		double c = Math.ceil(num);
		double n = Math.floor(num);
		System.out.println(c);
		System.out.println(n);
		System.out.println(b);
		double r3 = Math.random();
		System.out.println("r3 : " + r3);
		// [문제 1] 0<= r4 < 10 사이의 임의의 정수를 발생시켜 출력하세요
		double randomvalue = Math.random();
		int r4 = (int)(randomvalue * 10);
		System.out.println("r4 : "+r4);
		// [문제 2] 5<= r5 < 15 사이의 임의의 정수를 발생시켜 출력
		int r5 = (int)(randomvalue * 10+5);
		System.out.println("r5 : "+r5);
		
		// 문제 3) 16<= r6 < 48 사이의 임의의 정수
		int r6 = (int)(randomvalue * 32+16);
		System.out.println("r6 : " + r6);
		// 문제 4) 알파벳 대문자를 무작위로 추출해서 아래와 같은 형태로 출력
		/*		W I P O A
		 * 		T B P W Z
		 * 		A A V C Z
		 * */
		for(int i=0;i<5;i++)
		{
			for(int k=0;k<3;k++)
			{
				int r7 = (int)(Math.random() * 26 + 'A');
				System.out.print((char)r7 + "\t");
			}
			System.out.println();
		}
	}

}
