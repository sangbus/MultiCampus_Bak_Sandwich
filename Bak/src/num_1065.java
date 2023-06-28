import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(hansu(N));
    }
    public static int hansu(int N)
    {
        int cnt = 0;
        if(N<100)
            return N;
        else
        {
            cnt = 99;
            for(int i=100;i<=N;i++)
            {
                int one = i%10;
                int ten = (i/10)%10;
                int hun = i/100;

                if(hun-ten==ten-one)
                    cnt++;
            }
            return cnt;
        }
    }
}
