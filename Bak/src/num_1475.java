import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_1475 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		int set[] = new int[10];
		int count=0;
		for(int i=0;i<num.length();i++)
		{
			int a=Character.getNumericValue(num.charAt(i));
			set[a]++;
		}
		int k = set[6] + set[9];
		if(k%2==0)
		{
			set[6] = k / 2;
			set[9] = k / 2;
		}
		else
		{
			set[6] = k / 2 + 1;
			set[9] = k / 2 + 1;
		}
		
		for(int b : set)
		{
			count = Math.max(count, b);
		}
		System.out.println(count);
		
	}

}
