package day03;
import java.util.Scanner;
public class iftest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요=>");
		int input = sc.nextInt();
		System.out.println(input);
		if(input%2==0)
			System.out.println("짝수입니다");
		System.out.println("The End");
	}

}
