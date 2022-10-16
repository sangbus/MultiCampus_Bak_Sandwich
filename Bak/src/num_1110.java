import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class num_1110 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        int copy_N = N;

        do {
            N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
            cnt++;
        } while (copy_N != N);

        System.out.println(cnt);
    }
}