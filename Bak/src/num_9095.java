import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_9095 {
	public static int dp[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0;i<N;i++)
		{	
			int num = Integer.parseInt(br.readLine());
			sb.append(addDp(num)).append('\n');
		}
		System.out.println(sb);
	}
	
	public static int addDp(int num)
	{
		if(num==1) return 1;
		if(num==2) return 2;
		if(num==3) return 4;
		dp=new int[num+1];
		dp[1]=1;
		dp[2]=2;
		dp[3]=4;
		if(num>3)
		{
			for(int i=4;i<=num;i++)
			{
				dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
			}
		}
		
		return dp[num];
	}
}
