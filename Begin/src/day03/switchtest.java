package day03;
import java.util.*;
public class switchtest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연산자를 입력하세요[+,-,*,/] : ");
		int a = sc.nextInt();
		String operation = sc.next();
		char oper = operation.charAt(0);
		int b = sc.nextInt();
		int result=0;
		switch(oper)
		{
		case '+':
			result=a+b;
			break;
		case '-':
			result=a-b;
			//break;
		case '*':
			result=a*b;
			break;
		case '/':
			result=a/b;
			break;
		default:
			System.out.println("없는 연산자입니다.");
			return;
		}
		System.out.println(a+operation+b+"="+result);
	}

}
