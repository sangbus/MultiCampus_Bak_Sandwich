import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Stack;
import java.util.StringTokenizer;

public class num_7576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int arr[][] = new int[M][N];


        for(int i=0;i<M;i++)
        {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++)
            {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        while(true)
        {
            for(int i=0;i<M;i++)
            {
                for(int j=0;j<N;j++)
                {
                    if(arr[i][j]==1)
                    {

                    }
                }
            }
        }
    }
}
