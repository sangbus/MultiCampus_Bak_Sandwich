package day03;
import java.util.Scanner;
public class switchtest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("----Menu----");
		System.out.println("1. 가정용 (liter당 50원)");
		System.out.println("2. 상업용 (liter당 45원)");
		System.out.println("3. 공업용 (liter당 30원)");
		System.out.println("======================");
		System.out.println("메뉴를 선택하세요 : (1~3)");
		System.out.println("======================");
		int no = sc.nextInt();
		System.out.println("사용량을 입력하세요 : ");
		int use = sc.nextInt();
		int cost = 0;
		switch(no)
		{
		case 1:
			cost = use * 50;
			break;
		case 2:
			cost = use * 45;
			break;
		case 3:
			cost = use * 30;
			break;
		default:
			System.out.println("일치하는 메뉴가 없습니다.");
			break;
		}
		System.out.println("사용자 코드 : " + no + ", 사용량 : " + use + ", 총수도요금 : " + cost * 1.05);
	}
}