import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_1541 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = Integer.MAX_VALUE; // 첫번째 수는 양수임을 체크하기 위한 값 설정
		String[] a = br.readLine().split("-");	//입력받은 문자열에서 -를 분리한다.
		for(int i=0;i<a.length;i++)
		{
			int temp=0;	// 덧셈인 묶음의 합을 구하기위한 변수
			String[] b = a[i].split("\\+");	// 덧셈 묶음인 수를 덧셈으로 다시 분리하여 합을 구한다.
			
			for(int j=0;j<b.length;j++)	// 덧셈으로 나뉜 수들을 모두 더한다.
				temp+=Integer.parseInt(b[j]);
			
			
			if(sum==Integer.MAX_VALUE)	// 첫번째 수일 경우 sum, temp값이 첫번째 수가 된다.
				sum = temp;
			
			else
				sum -= temp;	// 덧셈이 끝나면 뺄셈을 진행한다.
		}
		System.out.println(sum);
	}

}
