import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        if(N>0&&M>0)
            sb.append(1);
        else if(N>0&&M<0)
            sb.append(4);
        else if(N<0&&M>0)
            sb.append(2);
        else if(N<0&&M<0)
            sb.append(3);

        System.out.println(sb);

    }
}
