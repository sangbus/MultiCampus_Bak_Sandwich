import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_2581 {
    public static boolean prime[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum=0;
        int min=0;
        prime = new boolean[N+1];

        make_prime();

        for(int i=M;i<=N;i++)
        {
            if(prime[i]==false)
            {
                sum+=i;
                if(min==0)
                    min=i;
            }
        }

        if(sum==0)
            System.out.println(-1);
        else
        {
            System.out.println(sum);
            System.out.println(min);
        }
    }

    public static void make_prime()
    {
        prime[0]=prime[1]=true;

        for(int i=2;i<=Math.sqrt(prime.length);i++)
        {
            if(prime[i])
                continue;

            for(int j=i*i;j<prime.length;j=j+i)
            {
                prime[j]=true;
            }
        }
    }

}