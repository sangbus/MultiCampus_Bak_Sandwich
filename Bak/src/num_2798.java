import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_2798 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		
		int max_Black= Integer.parseInt(st.nextToken());
		
		st =  new StringTokenizer(br.readLine());
		
		int arr[] = new int[num];
		
		
		for(int i=0; i<num;i++)
		{
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		
		int max_Value = 0;
		int result = 0;
		
		
		for(int i=0; i<num-2;i++)
		{
			for(int j=i+1;j<num-1;j++)
			{
				for(int k=j+1;k<num;k++)
				{
					max_Value=arr[i]+arr[j]+arr[k];
					if(max_Value<=max_Black&&max_Value>result)
					{
						result=max_Value;
					}
				}
			}
		}
		
		System.out.println(result);
	}

}
