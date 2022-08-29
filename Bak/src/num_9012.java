import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_9012 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		for(int i=0;i<num;i++)
		{
			String ps = br.readLine();
			int count = 0;
			for(int j=0;j<ps.length();j++)
			{
				if(ps.charAt(j)=='(')
				{
					count++;
				}
				else if(ps.charAt(j)==')')
				{
					count--;
					if(count<0)
					{
						break;
					}
				}
			}
			if(count!=0)
			{
				sb.append("NO\n");
			}
			else if(count==0)
			{
				sb.append("YES\n");
			}
		}
		System.out.println(sb);
	}

}
