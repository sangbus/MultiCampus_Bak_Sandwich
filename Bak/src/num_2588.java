import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(br.readLine());
        String second = br.readLine();

        System.out.println(first * (Character.getNumericValue(second.charAt(2))));
        System.out.println(first * (Character.getNumericValue(second.charAt(1))));
        System.out.println(first * (Character.getNumericValue(second.charAt(0))));
        System.out.println(first * Integer.parseInt(second));

    }
}
