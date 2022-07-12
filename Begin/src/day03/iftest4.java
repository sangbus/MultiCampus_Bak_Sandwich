package day03;
import java.util.*;
public class iftest4 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("0~9, 알파벳, 기타 문자를 1자만 입력하세요 : ");
		String input=sc.next();
		char ch = input.charAt(0);
		//int a = (int)ch;
		if(ch<=57 && ch>=48)	//if(ch>='0' && ch<='9')
			System.out.println("숫자입니다");
		else if((ch<=90 && ch>=65) || (ch<=122 && ch>=97))	//else if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
			System.out.println("알파벳이군요");
		else
			System.out.println("기타 문자입니다.");
	}
}