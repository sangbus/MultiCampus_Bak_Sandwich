package day02;

public class myoperator3 {

	static public void main(String[] args) {
		System.out.println("6. ----조건연산자(삼항연산자)----");
		int a=50;
		int b=60;
		int result=(a>b)?a:b;
		System.out.println("result = " + result);
		
		String str=(a<b)? a+"":b+"";
		System.out.println("str = "+str);
		
		System.out.println("7.---할당연산자(연산 후 대입연산자)---");
		
		int i=1;
		i+=3;
		System.out.println("i = "+i);
		
		int j=15;
		j-=7;
		System.out.println("j = "+j);
		
		
		System.out.println("1"+"2");//string 12
		System.out.println(true+ "");//string true
		System.out.println('A' + 'B');//char -> int + int
		
		System.out.println('1'+2); // int + int
		
		System.out.println('1'+'2'); // int + int
		
		System.out.println('J'+"ava"); // string JAVA
		
		//System.out.println(true+null);
		
	}

}
