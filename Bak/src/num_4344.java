import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++)
        {
            int cnt = 0;
            float avg = 0;
            st = new StringTokenizer(br.readLine()," ");
            int M = Integer.parseInt(st.nextToken());
            int student[][] = new int[N][M];
            for(int j=0;j<M;j++)
            {
                student[i][j] = Integer.parseInt(st.nextToken());
                avg+=student[i][j];
            }
            avg = avg / M;

            for(int k=0;k<M;k++)
            {
                if(avg<student[i][k])
                {
                    cnt++;
                }
            }
            double avg_student =  cnt / (double)M * 100;
            avg_student = Math.round(avg_student*1000)/1000.0;
            String avg_format = String.format("%.3f",avg_student);
            sb.append(avg_format).append('%').append('\n');
        }
        System.out.println(sb);
    }
}
