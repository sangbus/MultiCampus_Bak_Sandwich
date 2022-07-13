package multicampus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class season {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("달을 입력해주세요(1~12) : ");
		StringTokenizer st = new StringTokenizer(br.readLine());
		int score = Integer.parseInt(st.nextToken());
		String season = "";
		switch(score)
		{
		case 12,1,2 :
			season="겨울";
			break;
		case 3,4,5 :
			season="봄";
			break;
		case 6,7,8 :
			season="여름";
			break;
		case 9,10,11 :
			season="가을";
			break;	
		default:
			System.out.println("잘못 입력했습니다.");
			return;
		}
		System.out.println(score+"월은 "+season+"입니다.");
	}

}
