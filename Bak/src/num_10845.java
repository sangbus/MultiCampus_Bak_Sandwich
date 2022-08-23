import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class num_10845 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		ArrayList<Integer> queue = new ArrayList<Integer>();
		for(int i=0;i<num;i++)
		{
			int pushNum=0;
			int popIndex = queue.size() - 1;
			st=new StringTokenizer(br.readLine());
			String Command = st.nextToken();
			
			if(st.hasMoreTokens()==true)
			{
				pushNum = Integer.parseInt(st.nextToken());
			}
			switch(Command) {
			
				case "push" :
						queue.add(pushNum);
					break;
					
				case "pop" :
						if(popIndex<0)
						{
							sb.append(-1+"\n");
						}
						else
						{
							sb.append(queue.get(0)+"\n");
							queue.remove(0);
						}
					break;
					
				case "size" :
						sb.append(queue.size()+"\n");
					break;
					
				case "empty" :
						if(popIndex<0)
						{
							sb.append(1+"\n");
						}
						else
						{
							sb.append(0+"\n");
						}
					break;
					
				case "front" :
						if(popIndex<0)
						{
							sb.append(-1+"\n");
						}
						else
						{
							sb.append(queue.get(0)+"\n");
						}
					break;
					
				case "back" :
						if(popIndex<0)
						{
							sb.append(-1+"\n");
						}
						else
						{
							sb.append(queue.get(popIndex)+"\n");
						}
					break;
			}
		}
		System.out.println(sb);
	}

}
