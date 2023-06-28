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
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++)
			A[i] = Integer.parseInt(st.nextToken());

		// 이분 탐색을 하기 위해서는 오름차순 정렬을 해둬야 함
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

	/*
	* 이분 탐색 : 두 부분으로 쪼개면서 탐색
	* 중간 인덱스를 구함
	* 중간 인덱스의 값과 key 값을 비교
	* key 값이 중간 값보다 작다면 왼쪽 부분 탐색
	* key 값이 중간 값보다 크다면 오른쪽 부분 탐색
	* 같다면 해당 인덱스를 반환, 종료
	* */
	public static int binarySearch(int key)
	{
		int low=0;	// 탐색 범위의 왼쪽 끝 인덱스
		int high = A.length -1;		// 탐색 범위의 오른쪽 끝 인덱스
		
		// low 값이 high보다 커지기 전까지 반복
		while(low<=high)
		{
			int mid = (low+high)/2;
			
			/*
			* key 값이 중간 인덱스보다 작을 경우
			* key 값은 중간보다 왼쪽에 있음
			* 그래서 탐색 범위의 오른쪽 끝을 조정해야됨
			* */
			if(key<A[mid])
			{
				high=mid-1;
			}
			
			/*
			* key 값이 중간 인덱스보다 클 경우
			* key 값은 중간보다 오른쪽에 있음
			* 그래서 탐색 범위의 왼쪽 끝을 조정해야됨
			* */
			else if(key>A[mid])
			{
				low=mid+1;
			}
			
			// key 값과 중간 위치의 값이 같을 경우
			else
			{
				return mid;
			}
		}
		
		// 찾고자 하는 값이 존재하지 않을 경우
		return -1;
	}

}
