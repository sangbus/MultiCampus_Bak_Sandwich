package day07;
import java.util.*;
public class JobApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Job j = new Job();
		Job j1 = new Job("고졸");
		Job j2 = new Job("대졸",3.5);
		Job arr[] = new Job[2];
		Company c = new Company();
		int count=0,num=1;
		while(num!=0)
		{
			showMenu();
			num = sc.nextInt();
			switch(num)
			{
			case 1:
				j1.setJob("홍길동","남자",20);
				System.out.println("=======예시========");
				j1.showInfo();
				j.enroll();
				arr[count] = j;
				count++;
				System.out.println("저장되었습니다 !");
				break;
			case 2:
				for(int i=0;i<count;i++)
				{
					arr[i].showInfo();
				}
				break;
			case 3:
				c.Ework("대졸", arr[0].education);
				c.Gwork(arr[0].graduate, arr[0].graduate);
				break;
			case 0:
				System.out.println("안녕~");
				return;
			default:
				break;
			}
		}
	}
	public static void showMenu()
	{
		System.out.println("구인 구직 사이트입니다.");
		System.out.println("1. 사용자 정보 등록");
		System.out.println("2. 사용자 정보 출력");
		System.out.println("3. 구직");
		System.out.println("0. 종료");
	}
}
