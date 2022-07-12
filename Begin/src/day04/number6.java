package day04;
import java.util.Scanner;
public class number6 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		String value=sc.next();
		String result = "";
		System.out.println(value);
		for(int i=0;i<value.length();i++)
		{
			if(value.charAt(i)>='0' && value.charAt(i)<='9')
			{
				result = "숫자입니다.";
			}
			else
			{
				result="숫자가 아닙니다.";
				break;
			}
		}
		System.out.println(result);
	}
}
