import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_8958 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int point=0;
		int result=0;
		String a[] = new String[num];
		for(int i=0;i<num;i++)
		{
			a[i]=br.readLine();
		}
		for(String b:a)
		{
			for(int i=0;i<b.length();i++)
			{
				char c = b.charAt(i);
				if(c=='O')
				{
					point++;
				}
				else if(c=='X')
				{
					point=0;
				}
				result+=point;
			}

			System.out.println(result);
			point=0;
			result=0;
		}
	}

}
