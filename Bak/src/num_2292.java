import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_2292 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int onetwo = 1;
		int two = 2;
		if(num==1)
		{
			System.out.println(1);
		}
		else
		{
			while(two<=num)
			{
				two = two + (6 * onetwo);
				onetwo++;
			}
			System.out.println(onetwo);
		}
	}

}
