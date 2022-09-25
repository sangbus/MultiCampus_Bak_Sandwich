import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int arr[] = new int[N*2];

        for(int i=1;i<=N;i++)
        {
            arr[i]=i;
        }
        int prev = 1;
        int last = N;
        while(N-- > 1)
        {
            prev++;
            arr[last+1]=arr[prev];
            last++;
            prev++;

        }
        System.out.println(arr[prev]);

    }
}
