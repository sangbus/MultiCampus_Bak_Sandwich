import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_2609 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		int min = (num1<=num2)?num1:num2;
		int arr[] = new int[min+1];
		for(int i=2;i<=min;i++)
		{
			if(num1%i==0&&num2%i==0)
			{
				arr[i]++;
			}
		}
		
		int maxCommon = 1;
		for(int i=2;i<=min;i++)
		{
			if(arr[i]>0)
			{
				if(i>maxCommon)
				{
					maxCommon=i;
				}
			}
		}
		
		int minCommon1=num1/maxCommon;
		int minCommon2=num2/maxCommon;
		int minResult=maxCommon*minCommon1*minCommon2;
		System.out.println(maxCommon);
		System.out.println(minResult);
	}

}
