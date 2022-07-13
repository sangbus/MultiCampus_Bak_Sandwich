package multicampus;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class aaa {
	public static void main(String[] args) throws IOException
			{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("점수 입력해주세요(0~100) : ");
				StringTokenizer st = new StringTokenizer(br.readLine());
				int score = Integer.parseInt(st.nextToken());
				System.out.println("학년 입력해주세요(1~4) : ");
				st = new StringTokenizer(br.readLine());
				int num = Integer.parseInt(st.nextToken());
				if(num==4 && score>=70)
					System.out.println("4학년 합격입니다.");
				else if(score>=60)
					System.out.println("합격입니다.");
				else
					System.out.println("불합격입니다.");
			}
}
