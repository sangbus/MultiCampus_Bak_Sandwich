import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_3052 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] forty = new int[42];
		int count=0;
		for(int i=0;i<10;i++)
		{
			int num = Integer.parseInt(br.readLine())%42;
			forty[num]++;
		}
		
		
		for(int a : forty)
		{
			if(a>=1)
			{
				count++;	
			}
		}
		System.out.println(count);
	}

}
