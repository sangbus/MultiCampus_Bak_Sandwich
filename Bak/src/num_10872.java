import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_10872 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int result=1;
		for(int i=0;i<=N;i++)
		{
			if(i==0)
			{
				result= result*(i+1);
			}
			else
			{
				result*=i;
			}
		}
		System.out.println(result);
	}

}
