import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        long num2 = Integer.parseInt(st.nextToken());

        long result = FT(num1)/(FT(num2) * (FT(num1-num2)));
        System.out.println(result);
    }


    public static long FT(long num)
    {
        long FT_result = 1;
        for(int i=1;i<=num;i++)
        {
            FT_result*=i;
        }

        return FT_result;
    }

}

