package multicampus;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number1 {
	public static void main(String[] args) throws IOException
			{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				int count = 0;
				double sum=0;
				int n = 1;
				while(n != 0)
				{
					System.out.println("숫자를 입력하세요 : ");
					StringTokenizer st = new StringTokenizer(br.readLine());
					n = Integer.parseInt(st.nextToken());
					if(n==0)
						break;
					count++;
					sum += n;
				}
				System.out.println("개수 : "+count);
				System.out.println("평균 값 : "+sum/count);
			}
}
