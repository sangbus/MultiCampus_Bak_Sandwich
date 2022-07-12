package day05;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class homework {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int size1 = Integer.parseInt(st.nextToken());
		int size2 = Integer.parseInt(st.nextToken());
		int[][] arr = new int[size1][size2];
		int width=size1;	//값이 들어갈 수 있는 가로 
		int height=size2;	//값이 들어갈 수 있는 세로
		height--;	//4->5로 이동할 때 한자리가 비어야함
		int cnt=1,i=0,j=0;	//값은 1부터 시작하고 0,0부터 채워짐
		while(cnt<=size1*size2)
		{
			for(int k=0;k<width;k++)		//오른쪽
			{
				arr[i][j]=cnt;	// 값을 넣어줌
				cnt++;	// 값이 하나씩 증가
				j++;	// 오른쪽으로 한칸 이동
			}
			width--;	// 값이 들어갈 수 있는 공간이 줄어듦
			j--;		// for문 마지막에 하나 증가하기 때문에 감소시켜줘야함
			i++;		// 아래로 한칸 이동
			for(int l=0;l<height;l++)		//아래
			{
				arr[i][j]=cnt;
				cnt++;
				i++;	// 아래로 한칸 이동
			}
			height--;
			i--;
			j--;
			for(int m=0;m<width;m++)		//왼쪽
			{
				arr[i][j]=cnt;
				cnt++;
				j--;	// 왼쪽으로 한칸 이동
			}
			width--;
			j++;
			i--;
			for(int o=0;o<height;o++)		//위
			{
				arr[i][j]=cnt;
				cnt++;
				i--;	// 위로 한칸 이동
			}
			height--;
			i++;
			j++;
		}
		for(int a=0;a<size1;a++)
		{
			for(int b=0;b<size2;b++)
				System.out.print(arr[a][b]+"\t");
			System.out.println();
		}
	}

}
