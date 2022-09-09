import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_1654 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		long max=0;
		long mid=0;
		long min=0;
		long resultNum=0;
		int lan[] = new int[K];
		for(int i=0;i<K;i++)
		{
			lan[i]=Integer.parseInt(br.readLine());
			if(max<lan[i])
				max=lan[i];
		}
		max++;
		while(min<max)
		{
			mid=(max+min)/2;
			resultNum=0;
			for(int j=0;j<K;j++)
				resultNum+=(lan[j]/mid);
			if(resultNum<N)
				max=mid;
			else
				min=mid+1;
		}
		System.out.println(min-1);
	}
}
