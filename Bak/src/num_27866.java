import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int num = Integer.parseInt(br.readLine());
        System.out.println(input.charAt(num-1));
    }
}
