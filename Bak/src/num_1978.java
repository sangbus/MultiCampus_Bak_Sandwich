import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_1978 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());;
		int count = 0;
		num = 200;
		for(int i=100;i<num;i++)
		{
			int a = i;
//			int a = Integer.parseInt(st.nextToken());
			if(a==1)
			{
				
			}
			else if(a==2||a==3||a==5||a==7)
			{
				count++;
			}
			else if(a%2==0 || a%3==0 || a%5==0||a%7==0)
			{
				
			}
			else
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
