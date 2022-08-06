import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_7568 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		int size[][] = new int[num][2];
		int result[] = new int[num];
		for(int i=0;i<num;i++) // 배열에 덩치들 넣기
		{
			st = new StringTokenizer(br.readLine());
			size[i][0]=Integer.parseInt(st.nextToken());
			size[i][1]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<num;i++)
		{
			int count = 1;
			for(int j=0;j<num;j++)
			{
				if(size[i][0]<size[j][0]&&size[i][1]<size[j][1])
				{
					count++;
				}
			}
			result[i] = count;
		}
		for(int a:result)
		{
			System.out.print(a+" ");
		}
	}

}
