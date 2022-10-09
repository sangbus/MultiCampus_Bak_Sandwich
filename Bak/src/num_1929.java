import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_1929 {
    public static boolean prime_save[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        prime_save = new boolean[N+1];
        prime(M,N);

        for(int i=M;i<=N;i++)
        {
            if(!prime_save[i])
                sb.append(i).append('\n');
        }
        System.out.println(sb);
    }

    public static void prime(int M,int N)
    {
        prime_save[0] = prime_save[1] = true;

        for(int i=2;i<=Math.sqrt(prime_save.length);i++)
        {
            if(prime_save[i])
                continue;
            for(int j=i*i;j< prime_save.length;j=j+i)
                prime_save[j]=true;
        }
    }

}