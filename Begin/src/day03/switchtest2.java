package day03;
import java.util.Scanner;
public class switchtest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int day = 0;
		switch(number)
		{
		case 1,3,5,7,8,10,12:
			day = 31;
			break;
		case 2:
			day = 28;
			break;
		case 4,6,9,11:
			day = 30;
			break;
		default:
			System.out.println("일치하는 값이 없습니다.");
			break;
		}
		System.out.println(number + "월은 "+day+"일까지 있습니다.");
	}

}
