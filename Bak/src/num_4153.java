import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while(true)
        {
            st = new StringTokenizer(br.readLine());
            int N1 = Integer.parseInt(st.nextToken());
            int N2 = Integer.parseInt(st.nextToken());
            int N3 = Integer.parseInt(st.nextToken());

            if(N1==0 && N2==0 && N3==0)
                break;

            if((N1*N1)+(N2*N2)==(N3*N3))
                sb.append("right").append("\n");
            else if((N2*N2)+(N3*N3)==(N1*N1))
                sb.append("right").append("\n");
            else if((N1*N1)+(N3*N3)==(N2*N2))
                sb.append("right").append("\n");
            else
                sb.append("wrong").append("\n");

        }
        System.out.println(sb);
    }
}
