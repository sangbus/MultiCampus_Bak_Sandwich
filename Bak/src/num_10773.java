import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_10773 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		int list[] = new int[num];
		int result = 0;
		for(int i=0;i<num;i++)
		{
			st = new StringTokenizer(br.readLine());
			list[i] = Integer.parseInt(st.nextToken());
			if(list[i]==0)
			{
				for(int j=1;j<=i;j++)
				{
					if(list[i-j]!=0)
					{
						list[i-j]=0;
						break;
					}
				}
			}
		}
		for(int a:list)
		{
			result+=a;
		}
		System.out.println(result);
	}

}
