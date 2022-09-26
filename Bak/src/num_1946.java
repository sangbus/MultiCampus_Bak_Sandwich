import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int employee[];
        for(int i=0;i<N;i++)
        {
            int count=0;
            int M = Integer.parseInt(br.readLine());
            employee = new int[M+1];
            for(int j=0;j<M;j++)
            {
                st = new StringTokenizer(br.readLine());
                int K = Integer.parseInt(st.nextToken());
                employee[K] = Integer.parseInt(st.nextToken());
            }

            count++;
            int number_1 = employee[1];

            for(int k=2;k<=M;k++)
            {
                if(employee[k]<number_1)
                {
                    count++;
                    number_1=employee[k];
                }
            }
            System.out.println(count);
        }
    }
}
