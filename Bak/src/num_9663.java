import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_9663 {
    public static boolean is_used1[] = new boolean[40];
    public static boolean is_used2[] = new boolean[40];
    public static boolean is_used3[] = new boolean[40];

    public static int cnt = 0;
    public static int N;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        func(0);
        System.out.println(cnt);
    }

    public static void func(int cur)
    {
        if(cur==N)
        {
            cnt++;
            return;
        }

        for(int i=0;i<N;i++)
        {
            if(is_used1[i] || is_used2[i+cur] || is_used3[cur-i+N-1])
                continue;

            is_used1[i] = true;
            is_used2[i+cur] = true;
            is_used3[cur-i+N-1] = true;

            func(cur+1);
            is_used1[i] = false;
            is_used2[i+cur] = false;
            is_used3[cur-i+N-1] = false;

        }
    }
}
