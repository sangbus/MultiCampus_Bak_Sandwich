import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_2908 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String a1 = st.nextToken();
		String a2 = st.nextToken();
		char a1temp1 = ' ';
		char a2temp1 = ' ';
		char a3temp1 = ' ';
		char a1temp2 = ' ';
		char a2temp2 = ' ';
		char a3temp2 = ' ';
		a1temp1=a1.charAt(2);
		a2temp1=a1.charAt(1);
		a3temp1=a1.charAt(0);
		a1temp2=a2.charAt(2);
		a2temp2=a2.charAt(1);
		a3temp2=a2.charAt(0);
		
		String num1 = Character.toString(a1temp1)+Character.toString(a2temp1)+Character.toString(a3temp1); 
		String num2 = Character.toString(a1temp2)+Character.toString(a2temp2)+Character.toString(a3temp2);
		
		int num11=Integer.parseInt(num1);
		int num22=Integer.parseInt(num2);
		int result = (num11<num22)?num22:num11;
		
		System.out.println(result);
	}

}
