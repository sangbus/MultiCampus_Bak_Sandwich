import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_2805 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int treeNum = Integer.parseInt(st.nextToken());
		int treeLength = Integer.parseInt(st.nextToken());
		int tree[] = new int[treeNum];
		st = new StringTokenizer(br.readLine());
		int maxLength = 0;
		int minLength=0;
		for(int i=0;i<treeNum;i++)
		{
			tree[i]=Integer.parseInt(st.nextToken());
			if(maxLength<tree[i])
				maxLength=tree[i];
		}
		while(minLength<maxLength)
		{
			int midLength=(minLength+maxLength)/2;
			long sum=0;
			for(int j=0;j<treeNum;j++)
			{
				int cutTree=tree[j]-midLength;
				if(cutTree>0)
				{
					sum+=cutTree;
				}
			}
			if(sum<treeLength)
			{
				maxLength=midLength;
			}
			else
			{
				minLength=midLength+1;
			}
		}
		System.out.println(minLength-1);
	}

}
