import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_9020 {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());
        for(int i=0;i<test_case;i++)
        {
            int N = Integer.parseInt(br.readLine());
            prime(N);
        }
        System.out.println(sb);
    }

    public static void prime(int num)
    {
        boolean prime_save[] = new boolean[num+1];
        prime_save[0]=prime_save[1]=true;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=2;i<=Math.sqrt(prime_save.length);i++)
        {
            if(prime_save[i])
                continue;
            for(int j=i*i;j<prime_save.length;j+=i)
            {
                prime_save[j]=true;
            }
        }

        for(int i=prime_save.length/2;i>0;i--) {
            if (!prime_save[i])
            for (int j = i; j < prime_save.length; j++)
            {
                if(!prime_save[j])
                {
                    if(i+j==num)
                    {
                        min = i;
                        max=j;
                        sb.append(min).append(' ').append(max).append('\n');
                        return;
                    }
                }
            }
        }
    }
}
