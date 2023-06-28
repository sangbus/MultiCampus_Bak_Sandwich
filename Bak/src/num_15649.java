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
        dfs(N,M,0);     // 제일 위(뿌리) 노드는 0으로 둔다.
        System.out.println(sb);
    }

    public static void dfs(int N,int M, int depth)
    {
        if(M==depth)    // 재귀 깊이가 M과 같아진다면 탐색과정에서 담았던 배열 출력
        {
            for(int val:arr)
            {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return; // 현재 재귀 함수를 끝낸다.
        }

        for(int i=0;i<N;i++)
        {
            if(!visit[i])       //해당 노드를 방문하지 않았다면
            {
                visit[i]=true;  // 방문했다고 체크
                arr[depth]=i+1; //  재귀 깊이를 index로 하여 값 저장
                dfs(N,M,depth+1);   // 자식 노드 탐색하기 위해 재귀 호출

                // 자식 노드 방문이 끝나면 방문하지 않은 상태로 변경 why?
                // 예를 들어 N = 4, M = 2일 때
                // 밑에 코드를 추가하지 않는다면
                // 1 2, 1 3, 1 4밖에 출력하지 않는다.
                // 두번째, 세번째, 네번째 값까지 출력하려면 아래 코드를 추가해줘야 한다.
                visit[i]=false;
            }
        }
    }
}
