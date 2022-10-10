import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_4948 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=-1;
        while(true)
        {
            N = Integer.parseInt(br.readLine());
            if(N==0)
                break;
            sb.append(prime(N)).append('\n');
        }
        System.out.println(sb);
    }

    public static int prime(int num)
    {
        int cnt=0;
        int double_num = num*2;
        boolean prime_save[] = new boolean[double_num+1];
        prime_save[0]=prime_save[1]=true;

        for(int i=2;i<=Math.sqrt(prime_save.length);i++)
        {
            if(prime_save[i])
                continue;
            for(int j=i*i;j<prime_save.length;j+=i)
            {
                prime_save[j]=true;
            }
        }

        for(int i=num+1;i<=double_num;i++)
        {
            if(!prime_save[i])
                cnt++;
        }
        return cnt;
    }
}
