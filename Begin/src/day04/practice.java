package day04;
import java.util.Scanner;
public class practice {

	public static void main(String[] args) {
		int a = (int)(Math.random()*100+1);
		int count = 0;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.print("1-100사이의 정수를 입력하세요 : ");
			int num = sc.nextInt();
			if(num<1||num>100)
				continue;
			count++;
			if(a>num)
			{
				System.out.println("더 큰 수를 입력하세요.");
			}
			
			else if(a<num)
			{
				System.out.println("더 작은 수를 입력하세요.");
			}
			else
			{
				System.out.println("맞았습니다, 시도한 횟수는 "+count+"입니다.");
				return;
			}
			if(count==7)
			{
				System.out.println("못 맞췄군요!");
				return;
			}
		}
	}

}
