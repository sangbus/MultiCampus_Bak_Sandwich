import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.StringTokenizer;

public class num_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int day = Integer.parseInt(st.nextToken());
        int night = Integer.parseInt(st.nextToken());
        int tree_height = Integer.parseInt(st.nextToken());
        int cnt = (int) Math.ceil((double)(tree_height-night) / (day-night));
        System.out.println(cnt);
    }
}
