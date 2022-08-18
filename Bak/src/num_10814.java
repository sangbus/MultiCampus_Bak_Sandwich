import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class num_10814 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st;
		String person[][]=new String[num][2];
		
		for(int i=0;i<num;i++)
		{
			st = new StringTokenizer(br.readLine(), " ");
			person[i][0]=st.nextToken();
			person[i][1]=st.nextToken();
		}
		
		Arrays.sort(person,new Comparator<String[]>() {
			@Override
			public int compare(String[] s1,String[] s2)
			{
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
			}
		});
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<num;i++)
		{
			sb.append(person[i][0]).append(" ").append(person[i][1]).append("\n");
		}
		
		System.out.println(sb);
	}

}
