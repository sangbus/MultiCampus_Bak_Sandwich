import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_1541 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = Integer.MAX_VALUE;
		String[] a = br.readLine().split("-");
		for(int i=0;i<a.length;i++)
		{
			int temp=0;
			String[] b = a[i].split("\\+");
			
			for(int j=0;j<b.length;j++)
				temp+=Integer.parseInt(b[j]);
			
			
			if(sum==Integer.MAX_VALUE)
				sum = temp;
			
			else
				sum -= temp;
		}
		System.out.println(sum);
	}

}
