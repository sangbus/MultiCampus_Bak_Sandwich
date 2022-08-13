import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_10818 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		int temp = Character.MAX_VALUE;
		st = new StringTokenizer(br.readLine());
		int min = 0;
		int max = 0;
		int a = 0;
		for(int i=0;i<num;i++)
		{
			a = Integer.parseInt(st.nextToken());
			if(temp==Character.MAX_VALUE)
			{
				temp=0;
				max=a;
				min=a;
			}
			else
			{
				max = (max<a)?a:max;
				min = (min<a)?min:a;
			}
		}
		System.out.println(min+" "+max);
	}

}
