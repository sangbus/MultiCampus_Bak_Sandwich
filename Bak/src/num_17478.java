import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_17478 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		String start = "어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n";
		String question = "\"재귀함수가 뭔가요?\"\n";
		String answer = "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n";
		String mid1 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n";
		String mid2 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n";
		String mid3 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n";
		String end = "라고 답변하였지.\n";
		String a = "____";
		String c = "";
		sb.append(start);
		for(int i=0;i<N;i++)
		{
			String b="";
			for(int j=0;j<i;j++)
			{
				b+=a;
			}
			sb.append(b+question);
			sb.append(b+mid1);
			sb.append(b+mid2);
			sb.append(b+mid3);
			if(i==N-1)
				c=b;
		}
		c+=a;
		sb.append(c+question);
		sb.append(c+answer);
		for(int i=N+1;i>0;i--)
		{
			String b="";
			for(int j=0;j<i-1;j++)
			{
				b+=a;
			}
			sb.append(b+end);
		}
		
		System.out.println(sb);
	}
}
