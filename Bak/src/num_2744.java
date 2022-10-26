import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<N.length();i++)
        {
            if(N.charAt(i)<'a')
                sb.append((char)(N.charAt(i)+32));
            else
                sb.append((char)(N.charAt(i)-32));
        }
        System.out.println(sb);
    }
}
