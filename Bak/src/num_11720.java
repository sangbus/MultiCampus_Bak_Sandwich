import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_11720 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());	// 값 입력받기
		st = new StringTokenizer(br.readLine());
		String b = st.nextToken();	//두번째 값 입력받기
		
		int result = 0;	//결과값 0으로 초기화
		
		for(int i=0;i<a;i++)	//반복횟수만큼 for문 반복
		{
			//입력받은 문자열에서 숫자를 추출한 다음 결과값에 더해준다.
			result += Character.getNumericValue(b.charAt(i));
		}
		System.out.println(result);	//결과값 출력
	}
}
