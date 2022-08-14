import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_2920 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num[] = new int[8];
		for(int i=0;i<num.length;i++)
		{
			num[i]=Integer.parseInt(st.nextToken());
		}
		if(num[0]==1&&num[1]==2&&num[2]==3
				&&num[3]==4&&num[4]==5&&num[5]==6
				&&num[6]==7&&num[7]==8)
		{
			System.out.println("ascending");
		}
		else if(num[0]==8&&num[1]==7&&num[2]==6&&
				num[3]==5&&num[4]==4&&num[5]==3&&
				num[6]==2&&num[7]==1)
		{
			System.out.println("descending");
		}
		else
		{
			System.out.println("mixed");
		}
	}

}
