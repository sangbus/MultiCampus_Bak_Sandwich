import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class num_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>(Arrays.asList());
        StringBuilder sb = new StringBuilder();
        while(N-->0)
        {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int num=0;
            if(command.equals("push_back"))
            {
                num = Integer.parseInt(st.nextToken());
                list.add(num);
            }
            else if(command.equals("push_front"))
            {
                num = Integer.parseInt(st.nextToken());
                list.add(0,num);
            }
            else if(command.equals("pop_front"))
            {
                if(list.size()==0)
                    sb.append(-1).append('\n');
                else
                {
                    sb.append(list.get(0)).append('\n');
                    list.remove(0);
                }
            }
            else if(command.equals("pop_back"))
            {
                if(list.size()==0)
                    sb.append(-1).append('\n');
                else
                {
                    sb.append(list.get(list.size()-1)).append('\n');
                    list.remove(list.size()-1);
                }
            }
            else if(command.equals("size"))
            {
                sb.append(list.size()).append('\n');
            }
            else if(command.equals("empty"))
            {
                if(list.size()==0)
                    sb.append(1).append('\n');
                else
                    sb.append(0).append('\n');
            }
            else if(command.equals("front"))
            {
                if(list.size()==0)
                    sb.append(-1).append('\n');
                else
                    sb.append(list.get(0)).append('\n');
            }
            else if(command.equals("back"))
            {
                if(list.size()==0)
                    sb.append(-1).append('\n');
                else
                    sb.append(list.get(list.size()-1)).append('\n');
            }
        }
        System.out.println(sb);
    }
}
