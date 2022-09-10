import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_11022 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++)
		{
			StringTokenizer st=new StringTokenizer(br.readLine());
			int num1=Integer.parseInt(st.nextToken());
			int num2=Integer.parseInt(st.nextToken());
			sb.append("Case #"+(i+1)+": "+num1+" + "+num2+" = "+(num1+num2)+"\n");
		}
		System.out.println(sb);
	}
}
