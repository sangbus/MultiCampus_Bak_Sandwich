import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class num_1931 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int count = 0;
		int prev_end_time = 0;
		int [][] time = new int[num][2];
		
		

		StringTokenizer st1;
		
		for(int i=0;i<num;i++)
		{
			st1 = new StringTokenizer(br.readLine(), " ");
			time[i][0] = Integer.parseInt(st1.nextToken());
			time[i][1] = Integer.parseInt(st1.nextToken());
		}
		
		
		
		Arrays.sort(time,new Comparator<int[]>()	// 끝나는 시간을 기준으로 정렬하기 위해 compare 재정의
		{
			@Override
			public int compare(int[] o1, int[] o2)
			{
				if(o1[1]==o2[1])	// 종료시간이 같을 경우 시작 시간이 빠른 순으로 정렬해야한다.		
					return o1[0]-o2[0];
				
				return o1[1]-o2[1];	// 오름차순으로 정렬한다.
			}
		});
		
		
		
		for(int i=0;i<num;i++)
		{
			if(prev_end_time <= time[i][0])		// 시작 시간이 끝난 시간보다 늦으면
			{
				prev_end_time=time[i][1];	// 끝난 시간을 교체
				count++;							// 카운트 증가	
			}
		}
		
		
		
		System.out.println(count);
	}

}
