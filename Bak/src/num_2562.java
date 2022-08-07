import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_2562 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int result = 0;
		int num=0;
		int temp = 0;
		for(int i=1; i<=9;i++)
		{
			st = new StringTokenizer(br.readLine(), " ");
			temp = Integer.parseInt(st.nextToken());
			if(result<temp)
			{
				result=temp;
				num=i;
			}
		}
		System.out.println(result);
		System.out.println(num);
		
	}

}
