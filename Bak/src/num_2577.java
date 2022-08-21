import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_2577 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num[] = {0,0,0,0,0,0,0,0,0,0};
		int result = 1;
		int b=0;
		for(int i=0;i<3;i++)
		{
			result*=Integer.parseInt(br.readLine());
		}
		String sresult = Integer.toString(result);
		int position=0;
		for(int i=0;i<sresult.length();i++)
		{
			position=Character.getNumericValue(sresult.charAt(i));
			num[position]++;
		}
		for(int a : num)
		{
			System.out.println(a);
		}
	}

}
