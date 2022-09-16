import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_2748 {
    public static long[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println(dpAdd(num));
    }

    /*
     * Bottom-up 방식
     * */
    public static long dpAdd(int num) {
        if (num == 0) return 0;
        if (num == 1) return 1;
        dp = new long[num + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= num; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[num];
    }

}
