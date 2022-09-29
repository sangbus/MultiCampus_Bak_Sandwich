import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_15649 {
    public static boolean[] visit;  //방문한 노드를 알기 위한 배열
    public static int[] arr;    // 탐색과정에서 값을 담을 배열
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int [M];
        visit = new boolean[N];
        dfs(N,M,0);
        System.out.println(sb);
    }

    public static void dfs(int N,int M, int depth)
    {
        if(depth == M)
        {
            for(int val : arr)
                sb.append(val).append(' ');
        sb.append('\n');
        return;
        }

        for(int i=0;i<N;i++)
        {
            if(!visit[i])   //노드를 방문하지 않았다면
            {
                visit[i] = true;    //방문한 것으로 체크
                arr[depth] = i+1;
                dfs(N,M,depth+1);   //재귀호출, 다음 자식 노드를 방문한다.
                visit[i] = false;
            }
        }
    }


}
