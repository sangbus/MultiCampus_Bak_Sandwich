import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_2775 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int apt[][] = new int[15][15];
		for(int i=0;i<apt.length;i++)
		{
			for(int j=1;j<apt[i].length;j++)
			{
				if(i==0)
				{
					apt[i][j]=j;
				}
				else
				{
					if(j==1)
					{
						apt[i][j]=apt[i-1][j];
					}
					else
					{
						apt[i][j]=apt[i][j-1]+apt[i-1][j];	
					}
				}
					
			}
		}
		int num = Integer.parseInt(br.readLine());
		String result="";
		for(int i=0;i<num;i++)
		{
			int x =Integer.parseInt(br.readLine());
			int y =Integer.parseInt(br.readLine());
			result +=apt[x][y]+"\n";
		}
		System.out.println(result);
	}
}
