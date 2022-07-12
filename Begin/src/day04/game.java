package day04;
import java.util.Scanner;
public class game {
	public static void main(String[] args)
	{
		while(true)
		{
			game.showMenu();
			Scanner sc = new Scanner(System.in);
			int computer = (int)(Math.random()*3+1);
			int user = sc.nextInt();
			if(user==9)
			{
				System.out.println("안녕~~");
				return;
			}
			String msg = "";
			if(user==computer)
			{
				msg="비겼습니다 ! ";
			}
			else if((user==1&&computer==3)||(user==2&&computer==1)||(user==3&&computer==2))
			{
				msg="당신이 이겼습니다 ! ";
			}
			else
				msg="당신이 졌습니다 ! ";
			System.out.println("당신 : " + user + " ("+game.show(user)+")");
			System.out.println("컴퓨터 : " + computer +" ("+game.show(computer)+")");
			System.out.println(msg);
		}
	}
	public static void showMenu()
	{
		System.out.println("***** Game Menu *****");
		System.out.println("1.가위\t 2.바위\t 3.보\t 9.종료");
		System.out.println("************************");
		System.out.println("입력하세요 ===>");
		System.out.println("************************");
	}
	
	public static String show(int num)
	{
		String str="";
		switch(num)
		{
		case 1:
			str="가위";
			break;
		case 2:
			str="바위";
			break;
		case 3:
			str="보";
			break;
		default:
			str="";
			break;
		}
		return str;
	}
}
