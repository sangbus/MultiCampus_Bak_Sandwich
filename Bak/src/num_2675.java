import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_2675 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b[] = new int[a];
		String c[] = new String[a];
		String result ="";
		
		for(int i=0;i<a;i++)
		{
			st = new StringTokenizer(br.readLine());
			b[i] = Integer.parseInt(st.nextToken());
			c[i] = st.nextToken();
		}
		for(int k=0;k<a;k++)
		{
			for(int i=0;i<c[k].length();i++)
			{
				for(int j=0;j<b[k];j++)
				{
					result+=c[k].charAt(i);
				}
			}
			result+="\n";
		}
		System.out.println(result);
	}

}
