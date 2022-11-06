import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        boolean uni[] = new boolean[31];
        for(int i=0;i<28;i++)
        {
            int N = Integer.parseInt(br.readLine());
            uni[N] = true;
        }

        for(int i=1;i<31;i++)
        {
            if(uni[i]==false)
                sb.append(i).append('\n');
        }
        System.out.println(sb);
    }
}
