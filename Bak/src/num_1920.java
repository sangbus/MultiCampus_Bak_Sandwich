import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class num_1920 {

	public static int[] A;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		A = new int[N];
		int num1=0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++)
		{
			num1 = Integer.parseInt(st.nextToken());
			A[i]=num1;
		}
		Arrays.sort(A);
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<M;i++)
		{
			if(binarySearch(Integer.parseInt(st.nextToken()))>=0)
			{
				sb.append(1).append('\n');
			}
			else
			{
				sb.append(0).append('\n');
			}
		}
		System.out.println(sb);
	}
	
	public static int binarySearch(int key)
	{
		int low=0;
		int high = A.length -1;
		
		while(low<=high)
		{
			int mid = (low+high)/2;
			
			if(key<A[mid])
			{
				high=mid-1;
			}
			
			else if(key>A[mid])
			{
				low=mid+1;
			}
			else
			{
				return mid;
			}
		}
		return -1;
	}

}
